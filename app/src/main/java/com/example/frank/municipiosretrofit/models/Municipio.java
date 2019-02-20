package com.example.frank.municipiosretrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by frank on 18/05/17.
 */

public class Municipio {

    @SerializedName("codigo_dane_municipio")
    @Expose
    private String codigoDaneMunicipio;
    private String correocontactenos;
    private String direcciN;
    private String nit;
    private String nombreAlcalde;

    @SerializedName("nombre_municipio")
    @Expose
    private String nombreMunicipio;
    private String portalweb;
    private String telefonoDeContacto;

    public String getCodigoDaneMunicipio() {
        return codigoDaneMunicipio;
    }

    public void setCodigoDaneMunicipio(String codigoDaneMunicipio) {
        this.codigoDaneMunicipio = codigoDaneMunicipio;
    }

    public String getCorreocontactenos() {
        return correocontactenos;
    }

    public void setCorreocontactenos(String correocontactenos) {
        this.correocontactenos = correocontactenos;
    }

    public String getDirecciN() {
        return direcciN;
    }

    public void setDirecciN(String direcciN) {
        this.direcciN = direcciN;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreAlcalde() {
        return nombreAlcalde;
    }

    public void setNombreAlcalde(String nombreAlcalde) {
        this.nombreAlcalde = nombreAlcalde;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getPortalweb() {
        return portalweb;
    }

    public void setPortalweb(String portalweb) {
        this.portalweb = portalweb;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
}
