package br.com.danilo.artigos.alura.anotacoes;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Util {

    public static <T> boolean validador(T objeto) {
        Class<?> classe = objeto.getClass();
        for (Field campo : classe.getDeclaredFields()) {
            if(campo.isAnnotationPresent(IdadeMinima.class)) {
                IdadeMinima idadeMinima = campo.getAnnotation(IdadeMinima.class);
                try {
                    campo.setAccessible(true);
                    LocalDate dataNascimento = (LocalDate) campo.get(objeto);
                    return Period.between(dataNascimento, LocalDate.now()).getYears() >= idadeMinima.valor();
                } catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

//    public static boolean usuarioValido(Usuario usuario) {
//        if(!usuario.getNome().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")){
//            return false;
//        }
//        if (!usuario.getCpf().matches("[^0-9]+")) {
//            return false;
//        }
//        return Period.between(usuario.getDataNascimento(), LocalDate.now()).getYears() >= 18;
//    }
}
