/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab7;

/**
 *
 * @author joanel
 */
import java.text.*;
public class Client {

    private String name;
    private String address;
    private String bday;
    private long contact;
    private SavingsAccount sa;


    public Client()
    {
        this.name = null;
        this.address = null;
        this.bday = null;
        this. contact = 0;
        this.sa = new SavingsAccount();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setBday(String bday)
    {
        this.bday = bday;
    }

    public void setContact(long contact)
    {
        this.contact = contact;
    }

    public void setSA(SavingsAccount sa)
    {
        this.sa = sa;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getBday()
    {
        return this.bday;
    }

    public long getContact()
    {
        return this.contact;
    }

    public SavingsAccount getSA()
    {
        return this.sa;
    }

    public String ClientProfile()
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        String details = 
                "Name            : " + getName() + "\n" +
                "Address         : " + getAddress() +"\n" +
                "Birthday        : " + getBday() +"\n" +
                "Contact Number  : " + getContact() +"\n" +
                "Account Balance : PHP " + df.format(getSA().getAccountBalance());
        return details;
    }
    
}
