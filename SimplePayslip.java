/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab3a;

/**
 *
 * @author jmd11631
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class SimplePayslip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Date today = new Date();
        String EmpNo, EmpName;// Employee No, Employee Name, Postion, Pay Grade
        String Position = null;
        String PG = null ;
        float BasicSalary, GP, OTP, NP, WT, Deduc;// Basic Salary Over Time Hours, Gross Pay, OVer Time Pay, Net Pay, WidthHoding Taxes, Deductions
        float tax = 0 ;//Tax Rate
        int OT;
        int SSS = 500;//SSS
        int Ibig = 200;//Pag Ibig
        int PH = 100;//PhilHealth

        System.out.println("Employee Payslip");
        System.out.print("Enter Employee Number : ");
        EmpNo = br.readLine();
        System.out.print("Enter Employee Name : ");
        EmpName = br.readLine();
        System.out.print("Enter Employees' Basic Salary : ");
        BasicSalary = Integer.parseInt(br.readLine());
        System.out.print("Enter Employees' OT Hours : ");
        OT = Integer.parseInt(br.readLine());


        if(BasicSalary >= 8000 && BasicSalary < 12000)
        {
            Position = "Technician";
            tax = 0.10f;

            if(BasicSalary >= 8000 && BasicSalary < 10000)
            {
                PG = "Pay Grade A";
            }
            else if(BasicSalary >= 10000 && BasicSalary < 12000  )
            {
                PG = "Pay Grade B";
            }
        }
        else if(BasicSalary >= 12000 && BasicSalary < 18000)
        {
            Position = "Encoder";
            tax = 0.12f;

                      if(BasicSalary >= 12000 && BasicSalary < 15000)
            {
                PG = "Pay Grade A";
            }
            else if(BasicSalary >= 15000 && BasicSalary < 18000)
            {
                PG = "Pay Grade B";
            }
        }
        else if(BasicSalary >= 18000 && BasicSalary < 25000)
        {
            Position = "Programmer";
            tax = 0.15f;

            if(BasicSalary >= 18000 && BasicSalary < 20000)
            {
                PG = "Pay Grade A";
            }
            else if(BasicSalary >= 20000 && BasicSalary < 25000)
            {
                PG = "Pay Grade B";
            }
        }
        else if(BasicSalary >= 25000 && BasicSalary < 40000)
        {
            Position = "System Analyst";
            tax = 0.18f;
            if(BasicSalary >= 25000 && BasicSalary < 30000)
            {
                PG = "Pay Grade A";
            }
            else if(BasicSalary >= 30000 && BasicSalary < 40000)
            {
                PG = "Pay Grade B";
            }
        }
        else if(BasicSalary >= 40000 && BasicSalary < 60000)
        {
            Position = "Manager";
            tax = 0.20f;

            if(BasicSalary >= 40000 && BasicSalary < 60000)
            {
                PG = "Pay Grade A";
            }
            else if(BasicSalary > 60000)
            {
                PG = "Pay Grade B";
            }

        }

        OTP = (0.01f * BasicSalary)* OT;
        GP = BasicSalary + OTP;
        WT = tax * GP;
        Deduc = WT + SSS + Ibig + PH;
        NP = GP - Deduc;

        System.out.println("\n\nEmployee Payslip");
        System.out.println("Date Generated is " + today);
        System.out.println("Employee Number : " + EmpNo);
        System.out.println("Employee Name : " + EmpName);
        System.out.println("Employee Position And Pay Grade : " + Position + " " + PG);
        System.out.println("Employees' Basic Salary : " + df.format(BasicSalary));
        System.out.println("Employees' OT Hours : " + OT);
        System.out.println("\n\n\nEmployees' Gross Pay : " + df.format(GP));
        System.out.println("Deductions :  Widtholding Tax : " + df.format(WT));
        System.out.println("\t\tSSS : " + df.format(SSS));
        System.out.println("\t\tPag Ibig : " + df.format(Ibig));
        System.out.println("\t\tPhilHealth : " + df.format(PH));
        System.out.println("Employees' Net Pay : " + df.format(NP));
    }









}
