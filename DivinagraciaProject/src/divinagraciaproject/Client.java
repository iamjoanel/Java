/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagraciaproject;

/**
 *
 * @author joanel
 */
import java.util.*;
import java.text.*;
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Date today = new Date();
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        BankAccount bA = new BankAccount();
        Random g = new Random();
        boolean account = false;

        menu:
        do{
            System.out.println();
            System.out.println("Today is : " + today);
            System.out.println("  Java Bank Main Menu");
            System.out.println("[1] New Account");
            System.out.println("[2] Balance Inquiry");
            System.out.println("[3] Deposit");
            System.out.println("[4] Withdraw");
            System.out.println("[5] Close Account");
            System.out.println("[6] Exit");
            
            System.out.print("\nWhat would you like to do? --> ");
            user = scanner.nextInt();
            switch(user)
            {
                case 1:
                {
                   if(account == false)
                   {
                    account = true;
                    boolean ok = false;
                    do{
                    System.out.println("Initial Deposit Should not be Less than PHP 10,000");
                    System.out.print("Enter Amount : ");
                    double initialDeposit = scanner.nextDouble();
                    if(initialDeposit >= 10000)
                    {
                        bA.newAccount(initialDeposit);
                        System.out.println("Deposit Success!");
                        int r = g.nextInt(9999);
                        System.out.println("Account No : " + r);
                        bA.setAccountNo(r);
                        System.out.println("Do not forget your Account Number!");
                        System.out.println("Thank You!");
                        ok = true;

                    }
                    else
                    {
                        System.out.println("\nInitial Deposit is Below Minimum.");
                        System.out.println("Pls. Try Again");
                    }
                    }while(ok != true);
                   }
                   else
                   {
                       System.out.println("\nYou already have an existing account.");
                   }
                   break;
                }
                case 2:
                {
                    if(account == true)
                    {
                        
                        System.out.print("Enter Account Number : ");
                        int accountNumber = scanner.nextInt();
                        if(accountNumber == bA.getAccountNo())
                        {
                            System.out.println("As of : " + today);
                            System.out.println("Account Balance is : PHP " + df.format(bA.getAccountBalance()));
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                        }
                       
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                    }
                    break;
                }
                case 3:
                {
                    if(account == true)
                    {
                        System.out.print("Enter Account Number : ");
                        int accountNumber = scanner.nextInt();
                        if(accountNumber == bA.getAccountNo())
                        {
                            System.out.println("Deposit Amount Should not be below PHP 1.00");
                            System.out.print("Enter Amount to deposit : ");
                            double deposit = scanner.nextDouble();
                            if(deposit > 1)
                            {
                            bA.deposit(deposit);
                            System.out.println("\nAs of : " + today);
                            System.out.println("Account Balance is : PHP " + df.format(bA.getAccountBalance()));
                            }
                            else
                            {
                                System.out.println("Deposit Amount Invalid!\nPls. Try Again");
                            }
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                        }
                        
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                    }
                    break;
                }
                case 4:
                {
                    if(account == true)
                    {
                        System.out.print("Enter Account Number : ");
                        int accountNumber = scanner.nextInt();
                        if(accountNumber == bA.getAccountNo())
                        {
                            System.out.println("Widthrawal Amount Should not be below PHP 1.00,\nmust not be greater than current balance,\nand should maintain the maintaining balance of PHP 10,000.00");
                            System.out.print("Enter Amount to Widthraw : ");
                            double widthraw = scanner.nextDouble();
                            if(widthraw > 1&&widthraw<bA.getAccountBalance()&&widthraw<(bA.getAccountBalance()-10000))
                            {
                                bA.widthraw(widthraw);
                                System.out.println("\nWidthraw Success!");
                                System.out.println("As of : " + today);
                                System.out.println("Account Balance is : PHP " + df.format(bA.getAccountBalance()));
                            }
                            else
                            {
                                System.out.println("Invalid Widthrawal Amount!\n Pls. Try Again");
                            }

                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                        }
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                    }
                    break;
                }
                case 5:
                {
                   
                    if(account == true)
                    {
                        
                        System.out.print("Enter Account Number : ");
                        int accountNumber = scanner.nextInt();
                        if(accountNumber == bA.getAccountNo())
                        {
                            System.out.print("Are you sure you want to close your account? (y/n): ");
                            char choice = (char)System.in.read();
                            if(choice == 'y')
                            {
                                bA.setAccountBalance(0);
                                System.out.println("\nAs of : " + today);
                                System.out.println("Account Balance is : PHP " + df.format(bA.getAccountBalance()));
                                
                            }
                            else if(choice == 'n')
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("\nInvalid Answer!");
                            }
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                        }
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Thank you!\n");
                    break;
                }
                default:
                {
                    System.out.println("\nInvalid Entry!\n");
                    break;
                }
            }
        }while(user!=6);
        
    }

}