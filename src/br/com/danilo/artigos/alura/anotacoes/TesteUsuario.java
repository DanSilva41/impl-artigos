package br.com.danilo.artigos.alura.anotacoes;

import java.time.LocalDate;

public class TesteUsuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Thiago Martins", "99999999w99", LocalDate.of(1999, 12, 24));
        System.out.println("Usuario valido? "+ Util.validador(usuario));
    }
}
