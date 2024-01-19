package application;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Reservation;
import models.exceptions.DomainException;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.printf("Room number: ");
			int roomNumber = scanner.nextInt();
			
			System.out.printf("Check-in date(dd/MM/yyyy): ");
			Date checkIn = sdf.parse(scanner.next());
			System.out.printf("Check-out date(dd/MM/yyyy): ");
			Date checkOut = sdf.parse(scanner.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data for new check-in reservation: ");
			System.out.printf("Check-in: ");
			checkIn = sdf.parse(scanner.next());
			System.out.printf("Check-out: ");
			checkOut = sdf.parse(scanner.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
						
		} catch (ParseException erro) {
			System.out.println("Erro de exceção: " + erro.getMessage());
		} catch(DomainException erro) {
			System.out.println("Erro de exceção: " + erro.getMessage());
		} finally {
			scanner.close();			
		}
	}
}
