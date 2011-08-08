/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2a;

/**
 *
 * @author jmd11631
 */
import java.io.*;
import java.text.*;
public class GradeComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#,##0.00");
        float lq,sq,rec,te,me;//lq = Long Quiz, sq = Short Quiz, rec = Recitation, te = Teachers Evaluation, me = MidTerm Exam
        float mg,cs;//mg = Midterm Grade, cs = Class Standing

        //Program Will Ask for input
        System.out.println("Grade Computation Program");
        System.out.print("Enter MidTerm Exam --> ");
        me = Float.parseFloat(br.readLine());
        System.out.print("Enter Long Quiz --> ");
        lq = Float.parseFloat(br.readLine());
        System.out.print("Enter Short Quiz --> ");
        sq = Float.parseFloat(br.readLine());
        System.out.print("Enter Recitation --> ");
        rec = Float.parseFloat(br.readLine());
        System.out.print("Enter Teachers Evaluation --> ");
        te = Float.parseFloat(br.readLine());

        //Process involved in Grade Computation

        cs = (lq*0.4f) + (sq*0.3f) +(rec*0.25f)+ (te*0.05f);
        mg = (cs*0.6f) + (me*0.4f);

        //Program Output
        System.out.println("Student Class Standing is "+ df.format(cs));
        System.out.println("Student MidTerm Grade is " + df.format(mg));
    }

}
