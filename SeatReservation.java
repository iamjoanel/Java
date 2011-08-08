import java.io.*;
import java.util.*;
public class SeatReservation
{
    public static void main(String args[]) throws Exception
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Date today = new Date();
	int[][] seats = new int[7][5];
	int num = 1, match = 0;
	int i=0,j=0,choice;
	char user = 'y';



	//Populate the Array
	for(i=0;i<7;i++)
	    {
		for(j=0;j<5;j++)
		    {
			seats[i][j] = num++;
		    }
	    }

	
	do{
	    match = 0;
	System.out.println("Available Seats are : ");
	//Display Populated Array
	for(i=0;i<7;i++)
	    {
		System.out.println();
		for(j=0;j<5;j++)
		    {
			if(seats[i][j]>0)
			    {
				System.out.print(seats[i][j] + "\t");
			    }
			else
			    {
				System.out.print("X" + "\t");
			    }
		    }
		System.out.println();
	    }
	System.out.println("*Seats Marked With X is Already Reserved.\n");


	//prompt that will ask User which Seat Number to take
	 System.out.println("Today is : " + today);
	 System.out.print("What Seat Number Would you like to Reserve ? : ");
		choice = Integer.parseInt(br.readLine());
		if(choice <= 35)
		    {
		for(i = 0; i<7;i++)
		    {
			for(j=0;j<5;j++)
			    {
				if(seats[i][j] == choice)
				    {
					seats[i][j] = 0;
					match = 1;
				    }
			    }
		    }
		if(match > 0)
		    {
			System.out.println("Seat ["+choice+"] Reserved ! Thank You");
		    }
		else
		    {
			System.out.println("Sorry, Seat is Reserved.");
		    }
		    }
		else
		    {
			System.out.println("There is no Seat # "+choice);
			System.out.println("Pls. Try Again.");
		    }
   		System.out.print("Reserve Another Seat?? (y/n) : ");
		user = (char) System.in.read();
		System.in.read();
	}while(user != 'n');		
    }
}