/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab6;

/**
 *
 * @author joanel
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class Employee {

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
        PaySlip pS = new PaySlip();

        System.out.println("Employee Payslip");
        System.out.print("Enter Employee Number : ");
        EmpNo = br.readLine();
        System.out.print("Enter Employee Name : ");
        EmpName = br.readLine();
        System.out.print("Enter Employees' Basic Salary : ");
        BasicSalary = Integer.parseInt(br.readLine());
        System.out.print("Enter Employees' OT Hours : ");
        OT = Integer.parseInt(br.readLine());


        pS.setEmpNo(EmpNo);
        pS.setEmpName(EmpName);
        pS.setOverTimeHours(OT);
        pS.setBasicSalary(BasicSalary);
        pS.computeOverTimePay(BasicSalary, OT);
        pS.computeGrossPay(BasicSalary);
        pS.computeWidtholdingTax(BasicSalary);
        pS.computeNetPay(SSS, Ibig, PH);

        System.out.println("\n\nEmployee Payslip");
        System.out.println("Date Generated is " + today);
        System.out.println("Employee Number : " + pS.getEmpNo());
        System.out.println("Employee Name : " + pS.getEmpName());
        System.out.println("Employee Position And Pay Grade : " + pS.getPosition() + " " + pS.getPayGrade());
        System.out.println("Employees' Basic Salary : " + df.format(pS.getBasicSalary()));
        System.out.println("Employees' OT Hours : " + pS.getOverTimeHours());
        System.out.println("\nEmployees' Gross Pay : " + df.format(pS.getGrossPay()));
        System.out.println("Deductions :  Widtholding Tax : " + df.format(pS.getWidtholdingTax()));
        System.out.println("\t\tSSS : " + df.format(SSS));
        System.out.println("\t\tPag Ibig : " + df.format(Ibig));
        System.out.println("\t\tPhilHealth : " + df.format(PH));
        System.out.println("Employees' Net Pay : " + df.format(pS.getNetPay()));
    }

}
