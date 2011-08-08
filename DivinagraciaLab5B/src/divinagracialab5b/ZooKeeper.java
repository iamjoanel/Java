/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5b;

/**
 *
 * @author joanel
 */
public class ZooKeeper {
    //attributes
    private String name;
    private String title;
    private double payRate;
    private boolean degree;
    ZooAnimal zA = new ZooAnimal();
    //constructor
    public ZooKeeper()
    {
        this.name = "";
        this.title = "";
        this.payRate = 14.0;
        this.degree = true;
    }

        public ZooKeeper(String name, String title, double payRate, boolean degree)
    {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
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

    public void feedAnimal()
    {

        System.out.println("The Zoo Keeper is Feeding the Animal..");
    }

    public void cleanCage()
    {
        System.out.println("The Zoo Keeper is Cleanning the Cage...");
    }


}

