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


    public static void main(String[] args) throws Exception{
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
                        newAccount(cl);
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
                        boolean ok = true;
                        double deposit =0;
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            do{
                            try{

                            System.out.println();
                            System.out.println("---------- ||Account Deposit|| ----------");
                            System.out.println("Deposit Amount should be not less than PHP 100.00");
                            System.out.print("Enter Amount to Deposit >> ");
                            deposit = s.nextDouble();
                            }

                                 catch(InputMismatchException ex1)
                                {
                                   System.out.println();
                                     System.out.println("Enter a Valid Input!");
                                    System.out.println();
                                    ok = true;
                                }


                                catch(NumberFormatException nfe){
                                System.out.println();
                                System.out.println("Enter a valid integer!");
                                System.out.println();
                                ok = true;
                                }
                            }while(!ok);

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
                    boolean ok = false;
                       if(cl.getSA().getAccountNo() != 0)
                    {
                        System.out.println();
                        System.out.print("Enter Account Number >> ");
                        int accountN = s.nextInt();
                        if(cl.getSA().validateAccount(accountN) == true)
                        {
                            do{
                            try{
                            System.out.println();
                            System.out.println("---------- ||Account Withdrawal|| ----------");
                            System.out.println("Withdrawal Amount should not be :\n 1.Less than PHP 100.00\n 2.Greater than the current Balance\n 3.Should Maintain a Balance of PHP 5,000.00");
                            System.out.print("Enter Amount to Withdraw >> ");
                            double withdraw = s.nextDouble();
                            cl.getSA().withdraw(withdraw);
                            ok = false;
                            }

                                 catch(InputMismatchException ex1)
                                {
                                   System.out.println();
                                     System.out.println("Enter a Valid Input!");
                                    System.out.println();
                                    ok = true;
                                }


                                catch(NumberFormatException nfe){
                                System.out.println();
                                System.out.println("Enter a valid integer!");
                                System.out.println();
                                ok = true;
                                }
                            }while(ok);
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
                            boolean ch = true;
                            do{
                                try{
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
                            }

                                catch(NumberFormatException nf)
                            {
                                 System.out.println();
                              System.out.println("Number Format Error!");
                               System.out.println();
                              ch = false;
                            }
                            catch(InputMismatchException eq)
                            {
                                 System.out.println();
                              System.out.println("Input Error!");
                               System.out.println();
                              ch = false;
                            }

                            }while(ch != false);
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
                                break;
                }
            }

        }while(user!=7);
                }

                                catch(NumberFormatException nf)
                            {
                                 System.out.println();
                              System.out.println("Number Format Error!");
                               System.out.println();
                              account = false;
                            }
                            catch(InputMismatchException eq)
                            {
                                 System.out.println();
                              System.out.println("Input Mismatch Error!");
                               System.out.println();
                              account = false;
                            }
                            catch(IOException eq)
                            {
                                 System.out.println();
                              System.out.println("IO Error!");
                               System.out.println();
                              account = false;
                            }

            }while(!account);
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

    static void newAccount(Client cl)
    {
        Scanner s = new Scanner(System.in);
        int acctNo = 0;
        double deposit = 0;
        String name = null;
        String address = null;
        String bday = null;
        long contact = 0;

        System.out.println();
        System.out.println("---------- ||Create New Account|| ----------");
        System.out.print("Enter Name >> ");
        name = s.nextLine();
        System.out.print("Enter Address >> ");
        address = s.nextLine();
        System.out.print("Enter Birth Date >> ");
        bday = s.nextLine();
        System.out.print("Enter Contact No >> ");
        contact = s.nextLong();
        System.out.println("Initial Deposit should not be less than PHP 5,000");
        System.out.print("Enter Amount to Deposit >> ");
        deposit = s.nextDouble();
           
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
        }
        else
        {
            System.out.println();
            System.out.println("Deposit is Below the minimum.");
            System.out.println();
        }

    }



}//end of class
