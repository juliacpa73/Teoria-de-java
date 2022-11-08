package com.mycompany.pomar;

public class Pomar {
private int identificadorPomar;
   private String tipoPomar;
   private String localizacaoPomar;
   private int verificacaoDiaPomar;
   private String codigoPomar;

    void contarDia (){
        for (int verificacaoDiaPomar = 0; verificacaoDiaPomar < 1; verificacaoDiaPomar++){}
        if (getVerificacaoDiaPomar() < 1){
        System.out.println ("O pomar nÃ£o foi verificado hoje");
        }
        else {
        System.out.println ("O pomar jÃ¡ foi verificado hoje.");
        }
    }

    public int getIdentificadorPomar() {
        return identificadorPomar;
    }
    public void setIdentificadorPomar(int identificadorPomar) {
        this.identificadorPomar = identificadorPomar;
    }
    public String getTipoPomar() {
        return tipoPomar;
    }
    public void setTipoPomar(String tipoPomar) {
        this.tipoPomar = tipoPomar;
    }
    public String getLocalizacaoPomar() {
        return localizacaoPomar;
    }
    public void setLocalizacaoPomar(String localizacaoPomar) {
        this.localizacaoPomar = localizacaoPomar;
    }
    public int getVerificacaoDiaPomar() {
        return verificacaoDiaPomar;
    }
    public void setVerificacaoDiaPomar(int verificacaoDiaPomar) {
        this.verificacaoDiaPomar = verificacaoDiaPomar;
    }
    public String getCodigoPomar() {
        return codigoPomar;
    }
    public void setCodigoPomar(String codigoPomar) {
        this.codigoPomar = codigoPomar;
    }

}
