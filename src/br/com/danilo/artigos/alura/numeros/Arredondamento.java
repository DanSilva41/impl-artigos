package br.com.danilo.artigos.alura.numeros;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Arredondamento {

    public static void main(String[] args) {
        UsuarioNota usuario = new UsuarioNota();
        usuario.getNotas().add(4.0);
        usuario.getNotas().add(3.7);
        usuario.getNotas().add(7.8);
        System.out.println(calculaMedia(usuario));
    }

    public static String calculaMedia(UsuarioNota usuario) {
        double total = 0.0;
        for (Double nota : usuario.getNotas()) {
            total += nota;
        }
        return arredondar(total / usuario.getNotas().size());
    }

    private static String arredondar(double media) {
//        return Math.round(media); // devolve o long mais proximo do valor passado
//        return Math.round(media * 100.0) / 100.0; // gambiarra
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP); // Arredondando da metade pra cima. EX: 3,625 ficará 3,63
        return df.format(media);
    }
}
