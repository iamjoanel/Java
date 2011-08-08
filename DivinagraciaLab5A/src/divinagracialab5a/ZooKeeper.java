/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5;

/**
 *
 * @author jmd11631
 */
public class ZooKeeper {
    //attributes
    private String name;
    private String title;
    private double payRate;
    private boolean degree;

    //constructor
    public ZooKeeper()
    {
        this.name = "";
        this.title = "";
        this.payRate = 14.0;
        this.degree = true;
    }

    //setters

    public void setName(String name)
    {
        this.name = name;
    }
    public void setTitle(String type)
    {
        this.title = type;
    }
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public void setDegree(boolean degree)
    {
        this.degree = degree;
    }

    //getters
    public String getName()
    {
        return this.name;
    }

    public String getTitle()
    {
        return this.title;
    }

    public double getPayRate()
    {
        return this.payRate;
    }

    public boolean hasDegree()
    {
        return this.degree;
    }


}
