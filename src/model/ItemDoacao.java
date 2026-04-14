package model;

public class ItemDoacao  {
    private int id;
    private String nomeItem;
    private String categoria;
    private String descricao;
    private int quantidade;
    private String estadoConservacao;
    private String dataCadastro;
    private String status;
    public static final String STATUS_DISPONIVEL = "DISPONIVEL";
    public static final String STATUS_RESERVADO = "RESERVADO";
    public static final String STATUS_ENTREGUE = "ENTREGUE";
    public static final String STATUS_CANCELADO = "CANCELADO";
    public static final String CATEGORIA_ALIMENTO = "ALIMENTO";
    public static final String CATEGORIA_ROUPA = "ROUPA";
    public static final String CATEGORIA_HIGIENE = "HIGIENE";
    public static final String CATEGORIA_MOVEIS = "MOVEIS";
    

    public ItemDoacao(int id, String nomeItem, String categoria, String descricao, int quantidade, String estadoConservacao, String dataCadastro, String status){
        this.id = id;
        this.nomeItem = nomeItem;
        this.categoria = categoria;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estadoConservacao = estadoConservacao;
        this.dataCadastro = dataCadastro; 
        this.status = status;


    }    

    public void setId(int id){
        this.id = id;

    }

    public int getId(){
        return id;

    }

    public void setNomeItem(String nomeItem){
        this.nomeItem = nomeItem;

    }

    public String getNomeItem(){
        return nomeItem;

    }

    public void setCategoria(String categoria){
        this.categoria = categoria;

    }

    public String getCategoria(){
        return categoria;

    }

    public void setDescricao(String descricao){
        this.descricao = descricao;

    }

    public String descricao(){
        return descricao;

    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

    }

    public int getQuantidade(){
        return quantidade;

    }

    public void setEstadoConservacao(String estadoConservacao){
        this.estadoConservacao = estadoConservacao;

    }

    public String getEstadoConservacao(){
        return estadoConservacao;

    }

    public void setDataCadastro(String dataCadastro){
        this.dataCadastro = dataCadastro;

    }

    public String getDataCadastro(){
        return dataCadastro;

    }

    public void setStatus(String status){
        this.status = status;

    }

    public String getStatus(){
        return status;
        
    }


}
