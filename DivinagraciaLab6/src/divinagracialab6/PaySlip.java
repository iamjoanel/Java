/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab6;

/**
 *
 * @author joanel
 */
public class PaySlip {
    private String empNo;
    private String empName;
    private String position;
    private String payGrade;
    private double basicSalary;
    private double grossPay;
    private double netPay;
    private double overTimePay;
    private double overTimeHours;
    private double widtholdingTax;

    public PaySlip()
    {
        this.empNo = null;
        this.empName = null;
        this.position = null;
        this.payGrade = null;
        this.basicSalary = 0;
        this.grossPay = 0;
        this.netPay = 0;
        this.overTimePay = 0;
        this.overTimeHours = 0;
        this.widtholdingTax = 0;
    }

    public void setEmpNo(String empNo)
    {
        this.empNo = empNo;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    public void setBasicSalary(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }

    public void setOverTimeHours(double overTimeHours)
    {
        this.overTimeHours = overTimeHours;
    }

    public String getEmpNo()
    {
        return this.empNo;
    }

    public String getEmpName()
    {
        return this.empName;
    }
    public String getPosition()
    {
        return this.position;
    }
    public String getPayGrade()
    {
        return this.payGrade;
    }


    public double getBasicSalary()
    {
        return this.basicSalary;
    }

    public double getGrossPay()
    {
        return this.grossPay;
    }
    public double getNetPay()
    {
        return this.netPay;
    }
    public double getOverTimeHours()
    {
        return this.overTimeHours;
    }
    public double getWidtholdingTax()
    {
        return this.widtholdingTax;
    }

    public void computeOverTimePay(double basicSalary, double overTimeHours)
    {
        this.overTimePay = (0.01f * basicSalary)*overTimeHours;
    }

    public void computeGrossPay(double basicSalary)
    {
        this.grossPay = this.basicSalary + this.overTimePay;
    }

    public void computeWidtholdingTax(double basicSalary)
    {
        double tax = 0;

        if(basicSalary >= 8000 && basicSalary < 12000)
        {
            this.position = "Technician";
            tax = 0.10f;

            if(basicSalary >= 8000 && basicSalary < 10000)
            {
                this.payGrade = "Pay Grade A";
            }
            else if(basicSalary >= 10000 && basicSalary < 12000  )
            {
                this.payGrade = "Pay Grade B";
            }
        }
        else if(basicSalary >= 12000 && basicSalary < 18000)
        {
            this.position = "Encoder";
            tax = 0.12f;

            if(basicSalary >= 12000 && basicSalary < 15000)
            {
                this.payGrade = "Pay Grade A";
            }
            else if(basicSalary >= 15000 && basicSalary < 18000)
            {
                this.payGrade = "Pay Grade B";
            }
        }
        else if(basicSalary >= 18000 && basicSalary < 25000)
        {
            this.position = "Programmer";
            tax = 0.15f;

            if(basicSalary >= 18000 && basicSalary < 20000)
            {
                this.payGrade = "Pay Grade A";
            }
            else if(basicSalary >= 20000 && basicSalary < 25000)
            {
                this.payGrade = "Pay Grade B";
            }
        }
        else if(basicSalary >= 25000 && basicSalary < 40000)
        {
            this.position = "System Analyst";
            tax = 0.18f;
            if(basicSalary >= 25000 && basicSalary < 30000)
            {
                this.payGrade = "Pay Grade A";
            }
            else if(basicSalary >= 30000 && basicSalary < 40000)
            {
                this.payGrade = "Pay Grade B";
            }
        }
        else if(basicSalary >= 40000 && basicSalary <= 60000)
        {
            this.position = "Manager";
            tax = 0.20f;

            if(basicSalary >= 40000 && basicSalary < 60000)
            {
                this.payGrade = "Pay Grade A";
            }
            else if(basicSalary == 60000)
            {
                this.payGrade = "Pay Grade B";
            }
        }
        this.widtholdingTax = tax * this.grossPay;
    }


   public void computeNetPay(int SSS, int Ibig, int PH)
   {
        double deduc = 0;
        deduc = this.widtholdingTax + SSS + Ibig + PH;
        this.netPay = this.grossPay - deduc;
   }




}
