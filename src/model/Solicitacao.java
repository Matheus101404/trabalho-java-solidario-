package model;

public class Solicitacao {
    private int id;
    private Beneficiario beneficiario;
    private ItemDoacao item; 
    private int quantidade;
    private String justificativa;
    private String status;
    public static final String STATUS_PEDENTE = "PENDENTE";
    public static final String STATUS_APROVADA  = "APROVADA";
    public static final String STATUS_EM_ANALISE = "EM ANALISE";
    public static final String STATUS_NEGADA = "NEGADA";
    public static final String STATUS_CONCLUIDA = "CONCLUIDA";



public Solicitacao(int id, Beneficiario beneficiario, ItemDoacao item, int quantidade, String justificativa, String status ){
    this.id = id;
    this.beneficiario = beneficiario;
    this.item = item;
    this.quantidade = quantidade;
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

public int getQuantidade(){
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
