package com.example.pcwin.tribunaldejusticia;



public class ListItemMagistrados {

   private String id;
   private String foto_url;
   private String grado_estudios;
   private String nombre;
   private String cargo;
   private String mail;
   private String sintesis_url;

    public ListItemMagistrados(String foto_url, String grado_estudios, String nombre, String cargo, String mail, String sintesis_url) {
        this.foto_url = foto_url;
        this.grado_estudios = grado_estudios;
        this.nombre = nombre;
        this.cargo = cargo;
        this.mail = mail;
        this.sintesis_url = sintesis_url;
    }

    public String getId() {
        return id;
    }

    public String getGrado_estudios() {
        return grado_estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getMail() {
        return mail;
    }

    public String getSintesis_url() {
        return sintesis_url;
    }

    public String getFoto_url() {
        return foto_url;
    }
}