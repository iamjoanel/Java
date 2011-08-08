/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab7;

/**
 *
 * @author joanel
 */
public class SavingsAccount extends BankAccount{

    private int accountNo;
    private double accountBalance;
    private double interestrate;


    public SavingsAccount()
    {
        this.accountNo = 0;
        this.accountBalance = 0;
        this.interestrate = 0;
    }

    public int getAccountNo() {
        return this.accountNo;
    }


    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }


    public double getAccountBalance() {
        return this.accountBalance;
    }


    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public double getInterestRate() {
        return this.interestrate;
    }

    public void setInterestRate(double interestrate) {
        this.interestrate = interestrate;
    }
    
    @Override
    public void deposit(double deposit)
        {
        if(deposit>= 100)
        {
        this.accountBalance += deposit;
        double interest = this.accountBalance * 0.05f;
        this.accountBalance += interest;
            System.out.println();
            System.out.println("Deposit Success!");
            System.out.println();
        }
        else
        {
             System.out.println("\nDeposit Amount Invalid!\nPls. Try Again");
        }

        }

    @Override
        public void withdraw(double widthraw)
        {
        if(widthraw >= 100&&widthraw<getAccountBalance()&&widthraw<(getAccountBalance()-5000))
        {

            this.accountBalance -= widthraw;
            System.out.println();
            System.out.println("Withdrawal Success!");
            System.out.println();
        }
        else
        {
            System.out.println("\nInvalid Widthrawal Amount!\n Pls. Try Again");
        }
    }

    
    
    
}
