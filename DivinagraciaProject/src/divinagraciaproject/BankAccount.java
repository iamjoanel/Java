/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagraciaproject;

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

    public double getAccountNo()
    {
        return this.accountNo;
    }

    public double getAccountBalance()
    {
        return this.accountBalance;
    }


    public void newAccount(double deposit)
    {
        setAccountBalance(deposit);
    }

    public void balanceInquiry(int accountNo)
    {
    int ctr = 0;
        do{
            if(accountNo == this.accountNo)
            {
                getAccountBalance();
                ctr = 3;
            }
            ctr++;
            }while(ctr != 3);

        }
    public void deposit(double deposit)
    {

        this.accountBalance += deposit;
        double interest = this.accountBalance * 0.01f;
        this.accountBalance += interest;
    }
    public void widthraw(double widthraw)
    {
        this.accountBalance -= widthraw;
    }

}

