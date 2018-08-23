package br.com.danilo.artigos.alura.string;

public class Livro {

    private final String nome;
    private final String autor;
    private final String descricao;

    public Livro(String nome, String autor, String descricao) {
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        if (descricao.length() > 30) {
            return "nome: " + nome + "\nautor: " + autor + "\ndescricao: "
                    + descricao.substring(0, 30) + "..."; // indice final NÃO é incluso
        }

        return "nome: " + nome + "\nautor: " + autor + "\ndescricao: "
                + descricao;
    }
}
