package br.com.danilo.artigos.devmedia;

import br.com.danilo.artigos.alura.string.Livro;

import java.util.*;

public class ColecoesSet {

    public static void main(String[] args) {

        System.out.println("HashSet");
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(40);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        imprime(numeros);

        System.out.println("\nTreeSet");

        Set<Integer> outrosNumeros = new TreeSet<>();
        outrosNumeros.add(34);
        outrosNumeros.add(12);
        outrosNumeros.add(63);
        outrosNumeros.add(45);

        imprime(outrosNumeros);

        System.out.println("\n");

        Set<Livro> livros = new TreeSet<>(Comparator.comparing(Livro::getNome));
        livros.add(new Livro("Casa de papel", "Carlos", "Bom"));
        livros.add(new Livro("Crepusculo", "Josh", "Bom"));
        livros.add(new Livro("A moreninha", "Joao", "Bom"));

        imprime(livros);

    }

    private static void imprime(Set<?> objects) {
        Iterator<?> iterator = objects.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "\t");

        Class<? extends Set> classe = objects.getClass();
        System.out.println("\n" +classe.getName() + ": nº elementos: " + objects.size());
    }
}
