import java.util.Scanner;

public class String
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Name : ");
	String name = scanner.nextLine();

	System.out.println(name);
    }
}