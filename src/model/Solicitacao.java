package model;

public class Solicitacao {
    private int id;
    private Beneficiario beneficiario;
    private ItemDoacao item; 
    private int quantidade;
    private String justificativa;
    private String status;



public Solicitacao(int id, Beneficiario beneficiario, ItemDoacao item, int quatidade, String justificativa, String status ){
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

public void setBeneficiario(Beneficiario beneficiario){
    this.beneficiario = beneficiario;

}

public Beneficiario getBeneficiario(){
    return beneficiario;

}

public void setItem(ItemDoacao item){
    this.item = item;

}

public ItemDoacao getItem(){
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
