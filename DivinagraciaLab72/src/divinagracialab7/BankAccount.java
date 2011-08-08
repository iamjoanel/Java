/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab7;

/**
 *
 * @author joanel
 */
public class BankAccount {

    private int accountNo;
    private double accountBalance;


public BankAccount()
    {
        this.accountNo = 0;
        this.accountBalance = 0;
    }

    public void setAccountNo(int accountNo)
    {
        this.accountNo = accountNo;
    }
    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public int getAccountNo()
    {
        return this.accountNo;
    }

    public double getAccountBalance()
    {
        return this.accountBalance;
    }

    public void deposit(double deposit)
    {
        if(deposit>= 1)
        {
        this.accountBalance += deposit;
        double interest = this.accountBalance * 0.01f;
        this.accountBalance += interest;
        }
        else
        {
             System.out.println("\nDeposit Amount Invalid!\nPls. Try Again");
        }

    }

    public void withdraw(double widthraw)
    {
        if(widthraw > 1&&widthraw<getAccountBalance()&&widthraw<(getAccountBalance()-10000))
        {
            this.accountBalance -= widthraw;
        }
        else
        {
            System.out.println("\nInvalid Widthrawal Amount!\n Pls. Try Again");
        }
    }
    
    public void balanceInquiry()
    {
        getAccountBalance();
    }

    public void closeAccount()
    {
        setAccountBalance(0);
        setAccountNo(0);
    }

    public boolean validateAccount(int accountNo)
    {
        boolean bool = false;
        if(accountNo == getAccountNo())
        {
            bool = true;
        }
        return bool;
    }
    
}
