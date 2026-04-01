package model;

public class Solicitacao {
    private int id;
    private String beneficiario;
    private String item; 
    private int quantidade;
    private String justificativa;
    private String status;



public Solicitacao(int id, String beneficiario, String item, int quatidade, String justificativa, String status ){
    this.id = id;
    this.beneficiario = beneficiario;
    this.item = item;
    this.quantidade = quatidade;
    this.justificativa = justificativa;
    this.status = status;

}

public void setId(int id){
    this.id = id;

}

public int getId(){
    return id;

}

public void setBeneficiario(String beneficiario){
    this.beneficiario = beneficiario;

}

public String getBeneficiario(){
    return beneficiario;

}

public void setItem(String item){
    this.item = item;

}

public String getItem(){
    return item;

}

public void setQuantidade(int quantidade){
    this.quantidade = quantidade;

}

public int setQuantidade(){
    return quantidade;

}

public void setJustificativa(String justificativa){
    this.justificativa = justificativa;

}

public String getJustificativa(){
    return justificativa;

}

public void setStatus(String status){
    this.status = status;

}

public String getStatus(){
    return status;
    
}
    
}
