package model;

public class Beneficiario extends Usuario {
    private String tipo;
    private String prioridade;
    public static final String PRIORIDADE1 = "PCD";
    public static final String PRIORIDADE2 = "IDOSOS";
    public static final String PRIORIDADE3 = "CRIANÇAS";
    public static final String PRIORIDADE4 = "GERAL";
    public static final String TIPO1 = "ABRIGO";
    public static final String TIPO2 = "ONG";
    public static final String TIPO3 = "ESCOLA";
    
  
    
    public Beneficiario(String id, String nome, String telefone, String email, String endereco, String tipo, String prioridade){
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
