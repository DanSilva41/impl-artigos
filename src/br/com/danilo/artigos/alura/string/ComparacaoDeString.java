package br.com.danilo.artigos.alura.string;

public class ComparacaoDeString {

    public static void main(String[] args) {
        String a = "teste";
        String b = "TESTE";
        String c = new String("teste");
        String d = a;
        d = d.toUpperCase();

        if(d.equals(a)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }
}
