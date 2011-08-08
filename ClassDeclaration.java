/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demoonclassdeclaration;

/**
 *
 * @author jmd11631
 */
import java.io.*;
public class ClassDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Student stud1 = new Student();

        System.out.println("Name : " + stud1.getName());
        System.out.println("Age :" + stud1.getAge());
        System.out.println("Grade : " + stud1.getGrade());

        Student stud2 = new Student();
        String name;
        int age;
        double grade;


        System.out.print("Enter Name --> ");
        name = b.readLine();
        System.out.print("Enter Age --> ");
        age = Integer.parseInt(b.readLine());
        System.out.print("Enter Grade --> ");
        grade = Double.parseDouble(b.readLine());

        stud2.setName(name);
        stud2.setAge(age);
        stud2.setGrade(grade);
        
        System.out.println("Name : " + stud2.getName());
        System.out.println("Age :" + stud2.getAge());
        System.out.println("Grade : " + stud2.getGrade());

    }

}
