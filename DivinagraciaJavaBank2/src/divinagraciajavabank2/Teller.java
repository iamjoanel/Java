/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagraciajavabank2;

/**
 *
 * @author joanel
 */
import java.util.*;
import java.text.*;

public class Teller {

    public static void displayMenu()
    {

        System.out.println("\tJava Bank Main Menu");
        System.out.println("[1] New Account");
        System.out.println("[2] Balance Inquiry");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdraw");
        System.out.println("[5] Client Profile");
        System.out.println("[6] Close Account");
        System.out.println("[7] Exit");
    }

    public static boolean createNewAccount(Client man,SavingsAccount sA)
    {
        int acctNo = 0;
        double deposit;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        boolean account = false;

                System.out.print("Enter Name : ");
                String name = s.nextLine();
                System.out.print("Enter Address : ");
                String address = s.nextLine();
                System.out.print("Enter Birthday : ");
                String bday = s.nextLine();
                System.out.print("Enter Contact No : ");
                long contact = s.nextLong();
                System.out.print("How Much would you like to deposit(Minimum of PHP 5,000)?) : ");
                deposit = s.nextDouble();

                if(deposit >= 5000)
                {
                account = true;
                man.setName(name);
                man.setAddress(address);
                man.setBirthday(bday);
                man.setContactNo(contact);
                acctNo = (int)(Math.random() * (9999 - 1000))+ 1000;
                System.out.println("Account Number : " + acctNo);
                System.out.println();
                sA.setAccountNo(acctNo);
                sA.setAccountBalance(deposit);

                }
                else
                {
                    System.out.println("\nInitial deposit must be minimum of PHP 5,000");
                    System.out.println();
                }
                return account;
    }

    public static void main(String[] args) throws Exception{
        Date today = new Date();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        SavingsAccount sA = new SavingsAccount();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Client man = new Client();

        do{
        System.out.println("Today is : " + today);
        displayMenu();
        System.out.print("Enter Choice : ");
        choice = scan.nextInt();
        switch(choice)
        {
            case 1:
                {
                   if(sA.getAccountNo() == 0)
                   {
                        createNewAccount(man,sA);
                        man.setsA(sA);
                   }
                   else
                   {
                       System.out.println("\nYou already have an existing account.");
                       System.out.println();
                   }
                   break;
                }
                case 2:
                {
                    if(sA.getAccountNo() != 0)
                    {
                        System.out.print("\nEnter Account Number : ");
                        int accountNumber = scan.nextInt();
                        if(accountNumber == sA.getAccountNo())
                        {
                            System.out.println("Account Balance is : PHP " + df.format(sA.getAccountBalance()));
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                            System.out.println();
                        }

                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                        System.out.println();
                    }
                    break;
                }
                case 3:
                {
                    if(sA.getAccountNo() != 0)
                    {
                        System.out.print("\nEnter Account Number : ");
                        int accountNumber = scan.nextInt();
                        if(accountNumber == sA.getAccountNo())
                        {
                            System.out.println("\nDeposit Amount Should not be less than PHP 100.00");
                            System.out.print("Enter Amount to deposit : ");
                            double deposit = scan.nextDouble();
                            sA.deposit(deposit);
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                            System.out.println();
                        }

                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                        System.out.println();
                    }
                    break;
                }
                case 4:
                {
                    if(sA.getAccountNo() != 0)
                    {
                        System.out.print("\nEnter Account Number : ");
                        int accountNumber = scan.nextInt();
                        if(accountNumber == sA.getAccountNo())
                        {
                            System.out.println("\nWidthrawal Amount Should not be below PHP 100.00,\nmust not be greater than current balance,\nand should maintain the maintaining balance of PHP 10,000.00");
                            System.out.print("Enter Amount to Widthraw : ");
                            double withdraw = scan.nextDouble();
                            sA.withdraw(withdraw);

                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                            System.out.println();
                        }
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                        System.out.println();
                    }
                    break;
                }
                case 5:
                {
                    if(sA.getAccountNo() != 0)
                    {
                        System.out.print("\nEnter Account Number : ");
                        int accountNumber = scan.nextInt();
                        if(accountNumber == sA.getAccountNo())
                        {
                            System.out.println(man.details());
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                            System.out.println();
                        }

                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                        System.out.println();
                    }
                    break;
                }
                case 6:
                {

                    if(sA.getAccountNo() != 0)
                    {

                        System.out.print("\nEnter Account Number : ");
                        int accountNumber = scan.nextInt();
                        if(accountNumber == sA.getAccountNo())
                        {
                            System.out.print("\nAre you sure you want to close your account? (y/n): ");
                            char choice2 = (char)System.in.read();
                            if(choice2 == 'y')
                            {
                                sA.setAccountBalance(0);
                                sA.setAccountNo(0);
                                System.out.println("\nAs of : " + today);
                                System.out.println("Account Balance is : PHP " + df.format(sA.getAccountBalance()));
                                System.out.println();


                            }
                            else if(choice2 == 'n')
                            {
                                System.out.println("\nAs of : " + today);
                                System.out.println("Account Balance is : PHP " + df.format(sA.getAccountBalance()));
                                System.out.println();
                                break;
                            }
                            else
                            {
                                System.out.println("\nInvalid Answer!");
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("\nInvalid Account Number!");
                            System.out.println();
                        }
                    }
                    else
                    {
                        System.out.println("\nInvalid!You have no Account!");
                        System.out.println("Create An Account First!");
                        System.out.println();
                    }
                    break;
                }
                case 7:
                {
                    System.out.println("\nThank you!\n");
                    break;
                }
            default:
                System.out.println("\nInvalid Choice!\nPls. Try Again!\n");
        }
        }while(choice != 7);

        
    }

}
