package model;

public class Beneficiario extends Usuario {
    private String tipo;
    private String prioridade;
  
    
    public Beneficiario(int id, String nome, String telefone, String email, String endereco, String tipo, String prioridade){
        super(id, nome, telefone, email, endereco);
        this.tipo = tipo;
        this.prioridade = prioridade;
    } 

    public void setTipo(String tipo){
        this.tipo = tipo;

    }

    public String getTipo(){
        return tipo;

    }

    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;

    }

    public String getPrioridade(){
        return prioridade;
        
    }

}
