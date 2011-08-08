/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab7;

/**
 *
 * @author joanel
 */
import java.util.*;
import java.text.*;
import java.io.*;
public class Teller {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Date today = new Date();
        Client cl = new Client();
        int user = 0;
        boolean account = false;

        
        do{
            try{
            do{

            System.out.println("Date : " + today);
            Menu();
            System.out.print("What would you like to do ? >> ");
            user = s.nextInt();

            switch(user)
            {

                case 1:
                {
                    if(cl.getSA().getAccountNo() == 0)
                    {
                        if(newAccount(cl) == true)
                        {
                            account = true;
                        }
                    }
                    else{
                        System.out.println();
                        System.out.println("There is already an exsisting account!");
                        System.out.println();
                    }
                    break;
                }

                case 2:
                {
                    if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            System.out.println();
                            System.out.println("---------- ||Balance Inquiry|| ----------");
                            System.out.println("Account Balance : PHP " + df.format(cl.getSA().getAccountBalance()));
                        }
                        else
                        {
                            System.out.println("Account Number Invalid!");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("Pls. Create and Account First!");
                        System.out.println();
                    }
                    break;
                }

                case 3:
                {
                    if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            System.out.println();
                            System.out.println("---------- ||Account Deposit|| ----------");
                            System.out.println("Deposit Amount should be not less than PHP 100.00");
                            System.out.print("Enter Amount to Deposit >> ");
                            double deposit = s.nextDouble();
                            cl.getSA().deposit(deposit);

                        }
                        else
                        {
                            System.out.println("Account Number Invalid!");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("Pls. Create and Account First!");
                        System.out.println();
                    }
                    break;
                }

                case 4:
                {
                       if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            System.out.println();
                            System.out.println("---------- ||Account Withdrawal|| ----------");
                            System.out.println("Withdrawal Amount should not be :\n 1.Less than PHP 100.00\n 2.Greater than the current Balance\n 3.Should Maintain a Balance of PHP 5,000.00");
                            System.out.print("Enter Amount to Withdraw >> ");
                            double withdraw = s.nextDouble();
                            cl.getSA().withdraw(withdraw);
                        }
                        else
                        {
                            System.out.println("Account Number Invalid!");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("Pls. Create and Account First!");
                        System.out.println();
                    }

                    break;
                }

                case 5:
                {
                    if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            System.out.println();
                            System.out.println("---------- ||Client Profile|| ----------");
                            System.out.println(cl.ClientProfile());
                        }
                        else
                        {
                            System.out.println("Account Number Invalid!");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("Pls. Create and Account First!");
                        System.out.println();
                    }
                    break;
                }

                case 6:
                {
                    if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            System.out.println();
                            System.out.println("---------- ||Close Bank Account|| ----------");
                            System.out.print("\nAre you sure you want to close your account? (y/n) >> ");
                            char choice2 = (char)System.in.read();
                            if(choice2 == 'y' || choice2 == 'Y')
                            {
                                cl.getSA().closeAccount();
                                System.out.println();
                                System.out.println("Thank You for Banking With Us.");
                                System.out.println();

                            }
                            else if(choice2 == 'n' || choice2 == 'N')
                            {
                                System.out.println();
                                break;
                            }
                            else
                            {
                                System.out.println();
                                System.out.println("\nInvalid Answer!");
                                System.out.println();
                            }

                        }
                        else
                        {
                            System.out.println("Account Number Invalid!");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("Pls. Create and Account First!");
                        System.out.println();
                    }
                    break;
                }

                case 7:
                {
                                System.out.println();
                                System.out.println("Thank You for Banking With Us.");
                                System.out.println();
                                account = true;
                                break;
                }

                default:
                {
                                System.out.println();
                                System.out.println("Invalid Entry!");
                                System.out.println();
                }


            }
                



        }while(user!=7);

        }

        catch(InputMismatchException ex1)
                {
                    System.out.println();
                    System.out.println("Enter a Valid Value");
                    System.out.println();
                    account = false;
                }


            catch(NumberFormatException nfe){
                System.out.println();
		  System.out.println("Enter a valid integer!");
                  System.out.println();
                  account=false;
            }

            catch(IOException e){
            System.out.println();
            System.out.println("An IO error occured!");
            System.out.println();
            account=false;
        }
	    finally{
                    System.out.println("I am the finally clause!:-)");
                    System.out.println();
            }

        }while(account!=true);
    }//end of main

    static void Menu()
    {
    System.out.println("---------- ||Java Bank Main Menu|| ----------");
    System.out.println("[1] New Account");
    System.out.println("[2] Balance Inquiry");
    System.out.println("[3] Deposit");
    System.out.println("[4] Withdraw");
    System.out.println("[5] Client Profile");
    System.out.println("[6] Close Account");
    System.out.println("[7] Exit");
    }

    static boolean newAccount(Client cl)
    {
        Scanner s = new Scanner(System.in);
        int acctNo = 0;
        boolean account = false;

        System.out.println();
        System.out.println("---------- ||Create New Account|| ----------");
        System.out.print("Enter Name >> ");
        String name = s.nextLine();
        System.out.print("Enter Address >> ");
        String address = s.nextLine();
        System.out.print("Enter Birth Date >> ");
        String bday = s.nextLine();
        System.out.print("Enter Contact No >> ");
        long contact = s.nextLong();
        System.out.println("Initial Deposit should not be less than PHP 5,000");
        System.out.print("Enter Amount to Deposit >> ");
        double deposit = s.nextDouble();
        
        if(deposit >= 5000)
        {
            cl.setName(name);
            cl.setAddress(address);
            cl.setBday(bday);
            cl.setContact(contact);
            acctNo = (int)(Math.random() * (9999 - 1000))+ 1000;
            cl.getSA().setAccountNo(acctNo);
            cl.getSA().setAccountBalance(deposit);

            System.out.println();
            System.out.println("Created  New Account");
            System.out.println("Account Number : " + acctNo);
            System.out.println();
            account = true;
        }
        else
        {
            System.out.println();
            System.out.println("Deposit is Below the minimum.");
            System.out.println();
        }
        return account;
    }



}//end of class
