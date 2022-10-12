// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double monthlyRate = (annualRate/100) / 12;
        double numMonths = numYears * 12;
        double numerator = monthlyRate * Math.pow((1 + monthlyRate),numMonths);
        double denominator = Math.pow((1 + monthlyRate), numMonths) - 1;
        double monthlyPay = (numerator/denominator) * principal;
        double totalPayments = monthlyPay * numMonths;
        double TotalInterest = totalPayments - principal;



        monthlyPay = monthlyPay * 100;
        monthlyPay = Math.round(monthlyPay);
        monthlyPay = monthlyPay / 100;

        totalPayments = totalPayments * 100;
        totalPayments = Math.round(totalPayments);
        totalPayments = totalPayments / 100;

        TotalInterest = TotalInterest * 100;
        TotalInterest = Math.round(TotalInterest);
        TotalInterest = TotalInterest/100;


        System.out.println("Principal:\t\t\t" + "$" + principal);
        System.out.println("AnnualRate:\t\t\t" + annualRate + "%");
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t" + "$" + monthlyPay);
        System.out.println("Total Payments:\t\t" + "$" + totalPayments);
        System.out.println("Total Interest: \t" + "$" + TotalInterest);







        System.out.println();
    }
}


