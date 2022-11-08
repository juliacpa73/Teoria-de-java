package com.mycompany.tecnico;

public class Tecnico {

   private String nomeTecnico;
   private String cargoTecnico;
   private String telefone;
   private String horarioTrabalhoTecnico;
   private String loginTecnico;
   private String senhaTecnico;
   private String tecnico = "jefferson";
   private String senha = "jeff123";
   
   public Tecnico (String nomeTecnico, String cargoTecnico, String telefone, String horarioTrabalhoTecnico, String loginTecnico, String senhaTecnico, String tecnico, String senha){
    this.nomeTecnico=nomeTecnico;
    this.cargoTecnico=cargoTecnico;
    this.telefone=telefone;
    this.horarioTrabalhoTecnico=horarioTrabalhoTecnico;
    this.loginTecnico=loginTecnico;
    this.senhaTecnico=senhaTecnico;
    this.tecnico=tecnico;
    this.senha=senha;
}

    /**
     *
     * @param loginTecnico
     * @param senhaTecnico
     * @param tecnico
     * @param senha
     */
    public void fazerLogin (String loginTecnico, String senhaTecnico, String tecnico, String senha){
        if(loginTecnico.equals(tecnico)||senhaTecnico.equals(senha)){
            System.out.println ("Login Confirmado");
        }
        else if(loginTecnico.equals(tecnico)){
            System.out.println ("Senha incorreta");
        }
        else {
            System.out.println ("Login nÃ£o existe.");
        }
    }
    void identificarPomar (){
    }
    void cadastrarPomar (){
    }
    void gerarCodigo(){
    }
    void abrirCamera (){
    }
    void lerCodigo (){
    }
    void tirarFoto (){
    }
    void validarFoto (){
    }
    void enviarRelario (){
    }
    void gerarRelatorio (){
    }


     public String getNomeTecnico() {
        return nomeTecnico;
    }
    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
    public String getCargoTecnico() {
        return cargoTecnico;
    }
    public void setCargoTecnico(String cargoTecnico) {
        this.cargoTecnico = cargoTecnico;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getHorarioTrabalhoTecnico() {
        return horarioTrabalhoTecnico;
    }
    public void setHorarioTrabalhoTecnico(String horarioTrabalhoTecnico) {
        this.horarioTrabalhoTecnico = horarioTrabalhoTecnico;
    }
    public String getLoginTecnico() {
        return loginTecnico;
    }
    public void setLoginTecnico(String loginTecnico) {
        this.loginTecnico = loginTecnico;
    }
    public String getSenhaTecnico() {
        return senhaTecnico;
    }
    public void setSenhaTecnico(String senhaTecnico) {
        this.senhaTecnico = senhaTecnico;
    }
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}
