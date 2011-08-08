/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagraciajavabank2;

/**
 *
 * @author joanel
 */
import java.text.*;
public class SavingsAccount extends BankAccount {

    private int accountNo;
    private double accountBalance;
    private double interestRate;

    public SavingsAccount()
    {
        this.accountNo = 0;
        this.accountBalance = 0;
        this.interestRate = 0;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return this.interestRate;
    }


    public void deposit(double deposit)
    {
        super.deposit(deposit);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        if(deposit >= 100)
        {
        this.accountBalance = this.accountBalance + deposit;
        double interest = this.accountBalance * 0.05f;
        this.accountBalance =this.accountBalance + interest;
        
        System.out.println("Account Balance is : PHP " + df.format(getAccountBalance()));
        System.out.println();
        }
        else
        {
             System.out.println("\nDeposit Amount Invalid!\nPls. Try Again");
        }
    }


    public void withdraw(double widthraw)
    {
        super.withdraw(widthraw);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        if(widthraw >= 100&&widthraw<getAccountBalance()&&widthraw<(getAccountBalance()-5000))
        {
            this.accountBalance = this.accountBalance - widthraw;
            System.out.println("\nWidthraw Success!");
            System.out.println("Account Balance is : PHP " + df.format(getAccountBalance()));
            System.out.println();
        }
        else
        {
            System.out.println("\nInvalid Widthrawal Amount!\n Pls. Try Again");
        }
    }


    
}
