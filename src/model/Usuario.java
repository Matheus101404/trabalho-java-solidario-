package model;

public class Usuario {
    private String id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;


    public Usuario(String id, String nome, String telefone, String email, String endereco){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }    

    public void setId(String id){
        this.id = id;

    }

    public String getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;

    }

    public void setTelefone(String telefone){
        this.telefone = telefone;

    }

    public String getTelefone(){
        return telefone;

    }

    public void setEmail(String email){
        this.email = email;

    }

    public String getEmail(){
        return email;

    }

    public void setEndereco(String endereco){

    }

    public String getEndereco(){
        return endereco;

    }
    
}

    


