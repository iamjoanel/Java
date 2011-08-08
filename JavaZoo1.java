/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5;

/**
 *
 * @author jmd11631
 */
public class JavaZoo1 {

    public static final String zooName = "Java Park n Zoo";

    public JavaZoo1()
    {
    }
    public static String getZooName()
    {
        return zooName;
    }


    public static void main(String[] args) {
        ZooAnimal myFirstAnimal = new ZooAnimal();
        Cage firstCage = new Cage();
        ZooKeeper myFirstZooKeeper = new ZooKeeper();

        System.out.println("Welcome to " + zooName + "!");
        //ZooKeeper
        System.out.println("Hello I Will be your ZooKeeper!");
        System.out.println("I am  " + myFirstZooKeeper.getName());
        System.out.println("I am a  " + myFirstZooKeeper.getTitle() + "here.");
        System.out.println("I am paid : " + myFirstZooKeeper.get());
        System.out.println("is the Animal Hungry? " + myFirstAnimal.isHungry());

        //Animal
        System.out.println();
        System.out.println("Animal Name : " + myFirstAnimal.getName());
        System.out.println("Animal Type : " + myFirstAnimal.getType());
        System.out.println("Animal Age : " + myFirstAnimal.getAge());
        System.out.println("is the Animal Hungry? " + myFirstAnimal.isHungry());



    }

}
