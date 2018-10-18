package br.com.danilo.artigos.casadocodigo.reflexao;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CriacaoClasse {

    private static final Logger LOGGER = Logger.getLogger(CriacaoClasse.class.getName());

    public CriacaoClasse() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            CriacaoClasse.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }
}
