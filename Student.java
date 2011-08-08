/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demoonclassdeclaration;

/**
 *
 * @author jmd11631
 */
public class Student {
 //Attributes
    private String name;
    private int age;
    private double grade;

    //constructor

    public Student()
    {
        this.name = "";
        this.age = 0;
        this.grade = 0;

    }

    //setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    //getters

    public String getName()
    {
        return this.name;
    }

        public int getAge()
    {
        return this.age;
    }

    public double getGrade()
    {
        return this.grade;
    }
}
