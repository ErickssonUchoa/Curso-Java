import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {

    public static void main(String[] args) {

        System.out.println("------------- INSTANCIAÇÃO ------------");
        LocalDate d01 = LocalDate.now();
        System.out.println("LocalDate: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("LocalDateTime: " + d02);

        Instant d03 = Instant.now();
        System.out.println("Instant: " + d03);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println("LocalDate com base no texto da ISO: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-21T01:30:26");
        System.out.println("LocalDateTime com base no texto da ISO: " + d05);

        Instant d06 = Instant.parse("2022-07-05T13:30:45Z");
        System.out.println("Instant com base no texto da ISO: " + d06);

        Instant d07 = Instant.parse("2022-07-05T13:30:45-03:00");
        // -03:00 -> passa texto com horário local e é guardado horario equivalente ao fuso colocado
        System.out.println("Instant equivalente ao fuso: " + d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //texto formatado ou formato customizado
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println("Formato customizado LocalDate: " + d08);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 13:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Formato customizado LocalDateTime: " + d09);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 13, 30);
        System.out.println(d11);

        System.out.println("------------------- FORMATAÇÃO --------------------");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(fmt2));
        System.out.println(fmt2.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d05.format(fmt3));
        System.out.println(fmt3.format(d05));
        System.out.println(d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        // Instant por ser global não tem .format
        // withZone = define fuso horario
        // zoneId.systemdefault() -> pega horario do sistema
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt4.format(d06));

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(d05.format(fmt5));

        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(fmt6.format(d06));

        System.out.println("--------------- CONVERSÃO ----------------");
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r1);
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(r2);

        System.out.println(d04.getDayOfMonth()); // pegando o dia
        System.out.println(d04.getMonthValue()); // pegando o mês
        System.out.println(d04.getYear()); // pega o ano
        System.out.println(d05.getHour()); // pegando hora -> LocalDateTime/Instant
        System.out.println(d05.getMinute()); // pegando o minuto -> LocalDateTime/Instant

        System.out.println("--------------- OPERAÇÕES -----------------");
        LocalDate pasteWeekLocalDate = d04.minusDays(7); // instanciando nova data -> d04 - 7 dias
        LocalDate nextWeekLocaldate = d04.plusDays(7); // instanciando nova data -> d04 + 7 dias
        System.out.println("pasteWeekLocalDate: " + pasteWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocaldate);
        System.out.println();

        LocalDateTime pasteWeekLocalDateTime = d05.minusDays(7);// instanciando nova data -> d04 - 7 dias
        LocalDateTime nextWeekLocaldateTime = d05.plusDays(7); // instanciando nova data -> d04 + 7 dias
        System.out.println("pasteWeekLocalDateTime: " + pasteWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocaldateTime);
        System.out.println();

        Instant pasteWeekInstant = d06.minus(7, ChronoUnit.DAYS); // instanciando nova data -> d04 - 7 dias
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // instanciando nova data -> d04 + 7 dias
        System.out.println("pasteWeekInstant: " + pasteWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        System.out.println();

        Duration t1 = Duration.between(pasteWeekLocalDateTime, d05);
        System.out.println("Duração datas: " + t1.toDays());

        // Quando for localDate deve converter para LocalDateTime
        Duration t2 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("Duração datas com LocalDate: " + t2.toDays());

        Duration t3 = Duration.between(pasteWeekInstant, d06);
        Duration t4 = Duration.between(d06, pasteWeekInstant);
        System.out.println("Duração datas com Instant: " + t3.toDays());
        System.out.println("Duração datas invertida com Instant: " + t4.toDays());






    }
}
