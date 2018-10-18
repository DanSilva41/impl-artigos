package br.com.danilo.artigos.alura.string;

import java.util.Arrays;

class SeparaPalavras {

    private static String conteudoRecebido = "Danilo; danilo.pereira@gmail.com.br; 20";

    public static void main(String[] args) {
        Aluno danilo = new Aluno();
        //Usando > substring <para buscar o NOME
        danilo.setNome(conteudoRecebido.substring(0,6));
        System.out.println(danilo.getNome());

        // Usando > split <
        String[] textoSeparado = conteudoRecebido.split(";\\s");
        System.out.println(Arrays.asList(textoSeparado));
        danilo.setNome(textoSeparado[0]);
        danilo.setEmail(textoSeparado[1]);
        danilo.setIdade(Integer.parseInt(textoSeparado[2]));
        System.out.println(danilo);
    }
}
