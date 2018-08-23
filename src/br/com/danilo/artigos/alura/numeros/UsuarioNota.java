package br.com.danilo.artigos.alura.numeros;

import java.util.ArrayList;
import java.util.List;

public class UsuarioNota {

    private String nome;
    private List<Double> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
