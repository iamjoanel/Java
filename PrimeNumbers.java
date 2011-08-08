/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab3b;

/**
 *
 * @author joanel
*/
import java.io.*;
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0,n,n2,ctr=0;
        String con = null;
        
        menu:
        do{
        System.out.println("\t\tMENU - Prime Numbers");
        System.out.println("[1] Prime or Composite");
        System.out.println("[2] All Prime Numbers");
        System.out.println("[3] Exit");
        System.out.print("Enter Choice : ");
        choice = Integer.parseInt(br.readLine());


        switch(choice)
        {
            case 1:
  
                System.out.print("Enter Number : ");
                n = Integer.parseInt(br.readLine());

                if(n == 1 || n == 0)
                {
                    System.out.println("\n" + n + " is not a Prime or Composite Number\n");
                }
                else if(n<0 && n < -1){
                       System.out.println(n + " is a Composite Number.");
                }
                
                else{
                for(int a=1;a<=n;a++)
                {
                    if((n%a) == 0)
                    {ctr++;}
                }
               
                if(ctr > 2)
                {
                    System.out.println("\n" +n +" " + "is a Composite Number\n" );
                }
                else
                {
                    System.out.println("\n" + n+" "+ "is a Prime Number\n");
                }
                ctr = 0;
                }
                break;
                
            case 2:
             System.out.print("Enter First Number : ");
                n = Integer.parseInt(br.readLine());
                System.out.print("Enter Second Number : ");
                n2 = Integer.parseInt(br.readLine());

                if(n>n2)
                {
                    int c = n;
                    n = n2;
                    n2 = c;
                }
                System.out.print("\nThe Prime Numbers Between " + n + " and " + n2 + " are : ");
                if(n<0 || n2<0)
                {
                    System.out.print("-1 ");
                }
                for(int a=n;a<=n2;a++)
                {
                    for(int b=1;b<=a;b++)
                    {
                        if((a%b) == 0)
                        {
                            ctr++;
                        }
                    }
                    if(ctr==2)
                    {
                        System.out.print(a + " ");
                        }
                    ctr = 0;
                }
                
                System.out.println();
                break;

            case 3:
            {
                System.out.print("Do you really want to exit???(yes/no) : ");
                con = br.readLine();
                if(con.equals("yes"))
                {
                    break menu;
                }
                else if(con.equals("no")){
                    continue menu;
                }
                break;
            }
            default:
            {
                System.out.println("Invalid input!");
            }
            }
        }while(choice !=3);
        }

}
