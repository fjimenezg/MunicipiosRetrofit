package com.example.frank.municipiosretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.frank.municipiosretrofit.datosApi.MuniService;
import com.example.frank.municipiosretrofit.models.Municipio;
import com.example.frank.municipiosretrofit.models.MunicipioRespuesta;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private static final String TAG="MUNICIPIOS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();
    }

    private void obtenerDatos() {

        MuniService service = retrofit.create(MuniService.class);
        Call<ArrayList<Municipio>> municipioRespuestaCall = service.obtenerListaMunicipios();
        municipioRespuestaCall.enqueue(new Callback<ArrayList<Municipio>>() {

            @Override
            public void onResponse(Call<ArrayList<Municipio>> call, Response<ArrayList<Municipio>> response) {
                if(response.isSuccessful()){

                    ArrayList lista = response.body();


                   for(int i=0;i<lista.size();i++)
                   {

                       Municipio municipio=(Municipio)lista.get(i);

                        Log.i(TAG," Municipios: "+municipio.getNombreMunicipio()+municipio.getNit());
                    }

                }else
                {
                    Log.e(TAG, " onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Municipio>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }


        });

    }
}
