package com.atos.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TICKET")
public class Tmodel {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TicketId")
    @SequenceGenerator(name = "TicketId", sequenceName = "Ticket_Id_seq", allocationSize = 1)
	private int TicketId;
    private int customerId; 	
	private String Departure;
	private String FROM;
	private String TO;
	private int Numberofpassengers;
	private String insurance;
	private String refundable;
	private Date BookingDate;
	private int TotalAmount;
	
	public Tmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tmodel(int TicketId, int customerId,String Departure, String FROM, String TO, int Numberofpassengers, 
	String insurance,String refundable, Date BookingDate, int TotalAmount) {
		super();
		this.TicketId = TicketId;
		this.customerId = customerId;
		this.Departure = Departure;
		this.FROM = FROM;
		this.TO = TO;
		this.Numberofpassengers = Numberofpassengers;
		this.insurance = insurance;
		this.refundable = refundable;
		this.BookingDate = BookingDate;
		this.TotalAmount = TotalAmount;
	}
	
	public int getTicketID() {
		return TicketId;
	}
	
	public void setTicketId(int TicketId) {
		this.TicketId = TicketId;
	}
	
	public int getcustomerID() {
		return customerId;
	}
	
	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getDeparture() {
		return Departure;
	}
	
	public void setDeparture(String Departure) {
		this.Departure = Departure;
	}
	
	public String getFROM() {
		return FROM;
	}
	
	public void setFROM(String FROM) {
		this.FROM = FROM;
	}
	
	public String getTO() {
		return TO;
	}
	
	public void TO(String TO) {
		this.TO = TO;
	}
	
	public int getNumberofpassengers() {
		return Numberofpassengers;
	}
	
	public void setNumberofpassengers(int Numberofpassengers) {
		this.Numberofpassengers = Numberofpassengers;
	}
	
	public String getinsurance() {
		return insurance;
	}
	
	public void setinsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getrefundable(){
	    return refundable;
	}
	public void setrefundable(String refundable){
	    this.refundable = refundable;
	}
	public Date getBookingDate(){
	    return BookingDate;
	}
	public void setBookingDate(Date BookingDate){
	    this.BookingDate = BookingDate;
	}
	public int getTotalAmount(){
	   return TotalAmount;
	}
	public void setTotalAmount(int TotalAmount){
	    this.TotalAmount = TotalAmount;
	}

	@Override
	public String toString() {
		return "Tmodel [TicketId=" + TicketId + ", customerId=" + customerId + ", Departure=" + Departure + ", FROM="
				+ FROM + ", TO=" + TO + ", Numberofpassengers=" + Numberofpassengers + ", insurance=" + insurance
				+ ", refundable=" + refundable + ", BookingDate=" + BookingDate + ", TotalAmount=" + TotalAmount + "]";
	}
}
	