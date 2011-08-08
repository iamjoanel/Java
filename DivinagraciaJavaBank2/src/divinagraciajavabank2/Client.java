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
public class Client {
    private String name;
    private String address;
    private String birthday;
    private long contactNo;
    private SavingsAccount sA;

    public Client()
    {
        this.name = null;
        this.address = null;
        this.birthday = null;
        this.contactNo = 0;
        this.sA = null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the contactNo
     */
    public long getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the sA
     */
    public SavingsAccount getsA() {
        return sA;
    }

    /**
     * @param sA the sA to set
     */
    public void setsA(SavingsAccount sA) {
        this.sA = sA;
    }
    
    public String details()
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String Details =
                "\nName                      : " + getName() +
                "\n" + "Address                   : " + getAddress() +
                "\n" + "Birthday                  : " + getBirthday() +
                "\n" + "Contact Number            : " + getContactNo() +
                "\n" + "Savings Account Balance   : PHP " + df.format(sA.getAccountBalance());
                return Details;
    }
}
