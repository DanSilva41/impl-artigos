package br.com.danilo.artigos.alura.string;

class SeparaPalavras {

    private static String conteudoRecebido = "Danilo; danilo.pereira@gmail.com.br; 20";

    public static void main(String[] args) {
        Aluno danilo = new Aluno();
        //Usando substring para buscar o NOME
        danilo.setNome(conteudoRecebido.substring(0,6));
        System.out.println(danilo.getNome());
    }
}
