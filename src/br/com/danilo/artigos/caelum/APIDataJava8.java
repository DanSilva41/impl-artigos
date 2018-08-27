package br.com.danilo.artigos.caelum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class APIDataJava8 {

    public static void main(String[] args) {

        Instant agora = Instant.now();
        System.out.println("Agora: " + agora);

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        LocalDate dataExata = LocalDate.of(2018, Month.DECEMBER, 12);
        System.out.println("Data exata: " + dataExata);

        // Calculo de datas
        LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
        LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);

        Period periodo = Period.between(homemNoEspaco, homemNaLua);
        System.out.printf("%s anos, %s mês e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());

        // Horario
        LocalTime horarioDeEntrada = LocalTime.of(9, 30);
        System.out.println("\nHorário de entrada: " + horarioDeEntrada);

        // Data e horario
        LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
        System.out.println("Data e hora: " + aberturaDaCopa);

        // Datas com fuso horário
        ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");

        LocalDateTime saidaDeSaoPauloSemFusoHorario =
                LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
        LocalDateTime chegadaEmNovaYorkSemFusoHorario =
                LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

        ZonedDateTime saidaDeSaoPauloComFusoHorario =
                ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioDeSaoPaulo);
        System.out.println(saidaDeSaoPauloComFusoHorario); //2014-04-04T22:30-03:00[America/Sao_Paulo]

        ZonedDateTime chegadaEmNovaYorkComFusoHorario =
                ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioDeNovaYork);
        System.out.println(chegadaEmNovaYorkComFusoHorario); //2014-04-05T07:10-04:00[America/New_York]

        Duration duracaoDoVoo =
                Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
        System.out.println(duracaoDoVoo); //PT9H40M

        //Importantes
        MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
        System.out.println("Natal: " + natal);

        // Formatando datas
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("pt", "br"));
        System.out.println("Hoje(formatado): " + hoje.format(formatador));

        // Manipulando datas
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Amanhã: " + amanha.format(formatador));

        LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
        long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);
        System.out.println(diasAteONatal + " até o natal");

        TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
        LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta);
        System.out.println("Próxima sexta: "+proximaSexta.format(formatador));

    }
}
