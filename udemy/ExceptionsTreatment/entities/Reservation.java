package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import models.exceptions.DomainException;

public class Reservation {
	int roomNumber;
	Date checkIn;
	Date checkOut;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}
	public Reservation(int roomNumber, Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Erro! A data da reserva não pode ser anterior à data atual.");
		} if (checkIn.after(checkOut)) {
			throw new DomainException("Erro! A data de check-out não pode ser anterior à data de check-in."); 
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long numberOfNights() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// throws DomainException propaga a exceção adiante (no caso, para a main);
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Erro! A data da reserva não pode ser anterior à data atual.");
		} if (checkIn.after(checkOut)) {
			throw new DomainException("Erro! A data de check-out não pode ser anterior à data de check-in."); 
		}
	}
	
	
	@Override
	public String toString() {
		return "Room: " 
				+ this.roomNumber 
				+ ", check-in: " 
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(this.checkOut)
				+ " " + numberOfNights()
				+ " nights";
		
	}
	
}
