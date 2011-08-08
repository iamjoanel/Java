/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5;

/**
 *
 * @author jmd11631
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

    
}
