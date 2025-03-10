package BTBKS;
import java.util.Scanner; //Import Scanner class for taking user Input

//Main class to execute the Bus Ticket System
public class BusTicketBookingSystem {
	
	//define a method to display the menu of options
	public static void displayMenu() 
	{
		System.out.println("\n\t===+++====++++====++++====++++====++++===++++====WELCOME TO BUS TICKET BOOKING SYSTEN===+++====++++====++++====++++====++++===++++====");
		System.out.println("\n\t1. Book Ticket");
		System.out.println("\t2. View Available Ticket");
		System.out.println("\t3. Exit");
	}
	
	// define a method to handle ticket booking
	public static void bookTicket(int[] tickets) {
		Scanner scanner=new Scanner(System.in);
		
		//Ask User for the bus number
		System.out.print("Enter Bus Number (0 to 4):");
		int busNumber=scanner.nextInt();
		
		//Validate bus number and check availability
		
		if(busNumber >=0 && busNumber <=4) {
			if(tickets[busNumber] >0) {
				System.out.println("Booking Successful Ticket booked for Bus :- "+(busNumber +1));
				tickets[busNumber]--; //decrease available tickets
			}else {
				System.out.println("Sorry,no available tickets for Bus -: "+(busNumber +1));
			}
		}else {
			System.out.println("Invalid bus number! Please choose between 0 to 4.");
		}
	}
	
	//Method to display available tickets
	public static void viewAvailableTickets(int[] tickets) {
		System.out.println("Available tickets for each bus:");
		for(int i=0;i<tickets.length;i++) {
			System.out.println("Bus "+(i+1)+ "-: "+tickets[i] + " tickets available");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		BusTicketBookingSystem btbs=new BusTicketBookingSystem();
		
		int[] tickets= {5,5,5,5,5};//Initial tickets for each bus
	
		while(true) {
			displayMenu();
			System.out.print("Enter Your Choice --:  ");
			int choice=scanner.nextInt();
			
			switch(choice) {
				case 1:
					bookTicket(tickets);
					break;
				case 2:
					viewAvailableTickets(tickets);
					break;
				case 3:
					System.out.println("Thank you for using the Bus Ticket Booking System!");
					return;
				default:
					System.out.println("Invalid choice! Please enter a valid option.");
			}
		}
		

	}

}