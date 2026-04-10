package HotelRoomReservation;

import java.util.Scanner;

public class Saludo {

	
	    public static void main(String[] args) {
	        
	        int[][] hotel = new int[7][5]; 

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	           
	            System.out.println("=== HOTEL RESERVATION SYSTEM ===");
	            System.out.println("1. View Rooms");
	            System.out.println("2. Check In");
	            System.out.println("3. Check Out");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                   
	                    viewRooms(hotel);
	                    break;
	                case 2:
	                    
	                    checkIn(hotel, scanner);
	                    break;
	                case 3:
	                    
	                    checkOut(hotel, scanner);
	                    break;
	                case 4:
	                   
	                    System.out.println("Exiting... Thank you!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	        }
	    }

	   
	    public static void viewRooms(int[][] hotel) {
	        System.out.println("\n--- View Rooms ---");
	        for (int i = 0; i < hotel.length; i++) {
	            System.out.print("Floor " + (7 - i) + ": ");
	            for (int j = 0; j < hotel[i].length; j++) {
	                System.out.print(hotel[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	  
	    public static void checkIn(int[][] hotel, Scanner scanner) {
	        System.out.print("\nEnter floor (1-7): ");
	        int floor = scanner.nextInt();
	        System.out.print("Enter room (1-5): ");
	        int room = scanner.nextInt();


	        if (floor < 1 || floor > 7 || room < 1 || room > 5) {
	            System.out.println("Invalid floor or room number.");
	            return;
	        }

	        if (hotel[7 - floor][room - 1] == 0) {

	        	hotel[7 - floor][room - 1] = 1;
	            System.out.println("Check-in successful!");
	        } else {
	            System.out.println("Room already occupied.");
	        }
	    }


	    public static void checkOut(int[][] hotel, Scanner scanner) {
	        System.out.print("\nEnter floor (1-7): ");
	        int floor = scanner.nextInt();
	        System.out.print("Enter room (1-5): ");
	        int room = scanner.nextInt();


	        if (floor < 1 || floor > 7 || room < 1 || room > 5) {
	            System.out.println("Invalid floor or room number.");
	            return;
	        }

	        if (hotel[7 - floor][room - 1] == 1) {

	        	hotel[7 - floor][room - 1] = 0;
	            System.out.println("Check-out successful!");
	        } else {
	            System.out.println("Room already empty.");
	        }
	    }
	    
    }  