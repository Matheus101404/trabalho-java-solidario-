package model;

public class DoacaoEfetivada {
    private int id;
    private String item;
    private String doador;
    private String beneficiario;
    private String data;
    private String observacoes;


    public DoacaoEfetivada(int id, String item, String doador, String beneficiario, String data, String observacoes){
        this.id = id;
        this.item = item;
        this.doador = doador;
        this.beneficiario = beneficiario;
        this.data = data;
        this.observacoes = observacoes;

    }

    public void setId(int id){
        this.id = id;

    }

    public int getId(){
        return id;

    }

    public void setItem(String item){
        this.item = item;

    }

    public String getItem(){
        return item;

    }

    public void setDoador(String doador){
        this.doador = doador;

    }

    public String getDoador(){
        return doador;

    }

    public void setBeneficiario(String beneficiario){
        this.beneficiario = beneficiario;

    }

    public String getBneficiario(){
        return beneficiario;

    }

    public void setData(String data){
        this.data = data;

    }

    public String getData(){
        return data;

    }

    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;

    }

    public String getObservacoes(){
        return observacoes;
        
    }

}
