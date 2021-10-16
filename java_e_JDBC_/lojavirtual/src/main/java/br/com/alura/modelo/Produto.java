package br.com.alura.modelo;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;

    public Produto(String nome, String descricao) {
        super();
        this.nome = nome;
        this.descricao = descricao;
    }

    public Produto(Integer id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
       
        return String.format("O produto é : %d, %s, %s",
                this.id, this.nome, this.descricao);
    }

    public void add(Produto produto) {
    }


       
    
}
