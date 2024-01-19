package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		// d1 ~~ d10 -> formas de instanciar data-hora ;
		LocalDate d1 = LocalDate.now();
		LocalDate d4 = LocalDate.parse("2024-01-11");

		LocalDateTime d2 = LocalDateTime.now();
		LocalDateTime d5 = LocalDateTime.parse("2024-01-11T10:43:30");
		
		Instant d3 = Instant.now();		
		Instant d6 = Instant.parse("2024-01-11T10:48:10Z");
		
		// FORMA MAIS UTILIZADA (d7) --
		Instant d7 = Instant.parse("2024-01-11T10:00:00-03:00");
		
		// O PADRÃO DTF1 ABAIXO É USADO EM D8 PARA AJUSTAR O FORMATO DE DATA --
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d8 = LocalDate.parse("11/01/2024", dtf1);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d9 = LocalDateTime.parse("11/01/2024 11:00", dtf2);

		LocalDateTime d10 = LocalDateTime.of(2024, 1, 11, 11, 00);
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
		System.out.println("d5 = " + d5);
		System.out.println("d6 = " + d6);
		System.out.println();
		System.out.println("d7 = " + d7);
		System.out.println("d8 = " + d8);
		System.out.println("d9 = " + d9);
		System.out.println("d10 = " + d10);
	}
}
