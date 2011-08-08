/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nestedloops;

/**
 *
 * @author jmd11631
 */
import java.io.*;
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,i,j;//Holder for multiplier
        int user;

        do{
        System.out.print("Enter a Number(1 - 10) : ");
        x = Integer.parseInt(br.readLine());
        for(i=1;i<=x;i++)
        {
            for(j=1;j<=x;j++)
            {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }
        System.out.println("[0]Yes");
        System.out.println("[1]No");
        System.out.print("Do You Want To Enter Another Number?(yes/no) : ");
        user = Integer.parseInt(br.readLine());
        }while(user != 1);

    }

}
