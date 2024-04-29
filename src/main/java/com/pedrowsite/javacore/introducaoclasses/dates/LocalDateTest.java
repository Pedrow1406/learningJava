package main.java.com.pedrowsite.javacore.introducaoclasses.dates;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate anniversary = LocalDate.of(2006, Month.JUNE, 14);
        LocalDate dateNow = LocalDate.now();
        Period dateNowMinusAnniversary = Period.between(anniversary, dateNow);
        System.out.println("O Dia do seu niver é no dia " + anniversary.get(ChronoField.DAY_OF_MONTH));
        System.out.println("O Mês do seu aniversário é no mês " + anniversary.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("O Ano do seu anivérsário é no ano de " + anniversary.get(ChronoField.YEAR));
        long idade = dateNowMinusAnniversary.get(ChronoUnit.YEARS);
        System.out.println("Você tem " + idade + " anos");
        LocalDate niverPlus3 = anniversary.plus(3, ChronoUnit.YEARS);
        System.out.println("Aniversário +3 anos(plus): " + niverPlus3);
        LocalDate niverMinus10 = anniversary.minus(10, ChronoUnit.YEARS);
        System.out.println("Aniversário -10 anos(minus): " + niverMinus10);
        LocalDate niverChangeYear = anniversary.with(ChronoField.YEAR,  2003);
        System.out.println("Aniversáro com o ano alterado para 2003(with): " + niverChangeYear);
        System.out.println("===================== // =====================");
        System.out.println("Ano Atual: " + dateNow);
        System.out.println("Quantos dias tem o mês atual? " + dateNow.lengthOfMonth());
        System.out.println("Quantos dias tem o ano atual? " + dateNow.lengthOfYear());
        System.out.println("O ano atual é bissexto? " + dateNow.isLeapYear());
    }
}
