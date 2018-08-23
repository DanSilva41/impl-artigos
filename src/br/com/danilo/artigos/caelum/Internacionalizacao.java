package br.com.danilo.artigos.caelum;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Internacionalizacao {

    public static void main(String[] args) throws ParseException {

        Locale vmLocale = Locale.getDefault(); // Locale da máquina virtual
        Locale ptBr = new Locale("pt", "BR"); // Locale para o Brasil
        Locale enCA = new Locale("en","CA"); // Locale para o Canadá - região inglesa
        Locale frCA = new Locale("fr","CA"); // Locale para o canadá - região francesa

        // Formatação de datas através do Locale
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, ptBr);
        System.out.println(dateFormat.format(new Date()));
        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, ptBr);
        System.out.println(timeFormat.format(new Date()));

        // Formatação de números através do Locale
        NumberFormat numberFormat = NumberFormat.getNumberInstance(ptBr);
        System.out.println(numberFormat.format(13.23));

        // Formatação de moedas através do Locale
        NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(ptBr);
        System.out.println(moedaFormat.format(13.23));

        // Parsing de String para Date/Number
        System.out.println(dateFormat.parse(
                "Sexta-feira, 21 de Setembro de 2007"));
        System.out.println(timeFormat.parse("00:58:16"));
        System.out.println(numberFormat.parse("13,23"));
        System.out.println(moedaFormat.parse("R$13,23"));

        System.out.println("\n----------------------------------------\n");

        // ResourceBundle - carregar arquivos de internacionalização
        ResourceBundle bundle = ResourceBundle.getBundle("messages", ptBr);
        System.out.println(bundle.getString("welcome"));

        // MessageFormat - ajuda a substituir parâmetros na mensagem
        String mensagemParam = "Isto foi um post sobre {0} e {1}!";
        String mensagem = MessageFormat.format(mensagemParam, "18n", "formatação");
        System.out.println(mensagem);
    }
}
