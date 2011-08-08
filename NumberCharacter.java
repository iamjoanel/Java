import java.io.*;
public class NumberCharacter
{
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	int [] numbers = new int[5];
	int i,pass = 1, pass2 = 1;


	//To populate the string for numbers
	for(i=0;i<numbers.length;i++)
	    {
		System.out.print("Enter Number : ");
		numbers[i] = Integer.parseInt(br.readLine());
	    }
	//Ask for a string then converts it to a Character Array by means of the
	System.out.print("Enter String : ");
	str = br.readLine();
	
	char charStr[] = new char[str.length()];
	
	for(i=0;i<str.length();i++)
	    {
		charStr[i] = str.charAt(i);
	    }

       //for sorting the numbers by descending order
		while(pass<5)
		    {
			for(i=0;i<(5-pass);i++)
			    {
				if(numbers[i]<numbers[i+1])
				    {
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				    }
			    }
			pass++;
		    }

		//for sorting the elements in the input string
		while(pass2<str.length())
		    {
			for(i=0;i<(str.length()-pass2);i++)
			    {
				if(charStr[i] < charStr[i+1])
				    {
					char temp2 = charStr[i];
					charStr[i] = charStr[i+1];
					charStr[i+1] = temp2;
				    }
			    }
			pass2++;
		    }

		//to display the elements of numbers
		System.out.print("\n\nEntered Numbers are : ");
		for(i=0;i<numbers.length;i++)
		    {
			System.out.print(numbers[i] + " ");
		    }
		System.out.println();
	       

		//Displaying String elements
			System.out.print("String is : ");
			for(i=0;i<charStr.length;i++)
			    {
			System.out.print(charStr[i] + " ");
			}
			System.out.println();
}						  
}