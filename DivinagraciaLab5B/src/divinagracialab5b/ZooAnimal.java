/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5b;

/**
 *
 * @author joanel
 */
public class ZooAnimal {

    //Attributes
    private String name;
    private String type;
    private int age;
    private boolean hungry;

    //Constructor
    public ZooAnimal()
    {
        this.name = "";
        this.type = "";
        this.age = 0;
        this.hungry = false;
    }

    //Constructor to be used in overloading the method
    public ZooAnimal(String name,String type,int age, boolean hungry)
    {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    //setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    //getters

    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean isHungry()
    {
        return this.hungry;
    }

    public void eat()
    {
        if(this.hungry == false)
        {
            System.out.println("It looks like " + getName() + " is full.");
        }
    else{
        System.out.println(getName() + " is Eating!");
        this.hungry = false;
        }
    }

    public void sleep()
    {
        System.out.println(getName() + " is Sleeping!");
        System.out.println(getName() + ": ZZZZZZ~");
        this.hungry = true;
    }


}
