package com.example.frank.municipiosretrofit.datosApi;

import com.example.frank.municipiosretrofit.models.Municipio;
import com.example.frank.municipiosretrofit.models.MunicipioRespuesta;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by frank on 18/05/17.
 */

public interface MuniService {

    @GET("resource/pfet-63uw.json?$$app_token=bjp8KrRvAPtuf809u1UXnI0Z8")
    Call<ArrayList<Municipio>> obtenerListaMunicipios();
}
