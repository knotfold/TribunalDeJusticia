package com.example.pcwin.tribunaldejusticia;



public class ListItemSentencias {

   private String idSentencia;
   private String expediente;
   private String magistrado;
   private String fecha;
   private String pdf_url;
   private String infografia_url;


    public ListItemSentencias(String idSentencia, String expediente, String magistrado, String fecha, String pdf_url, String infografia_url) {
        this.idSentencia = idSentencia;
        this.expediente = expediente;
        this.magistrado = magistrado;
        this.fecha = fecha;
        this.pdf_url = pdf_url;
        this.infografia_url = infografia_url;
    }

    public String getIdSentencia() {
        return idSentencia;
    }

    public String getExpediente() {
        return expediente;
    }

    public String getMagistrado() {
        return magistrado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPdf_url() {
        return pdf_url;
    }

    public String getInfografia_url() {
        return infografia_url;
    }


}