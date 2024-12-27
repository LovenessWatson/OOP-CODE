public class Savingsaccount{
    private static double annualInterestRate;
    private double savingsBalance;

    public Savingsaccount(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }

    public void calculateMonthylInterest(){
        double MonthlyInterest=(savingsBalance*annualInterestRate)/12;
        savingsBalance+=MonthlyInterest;
    }

    public static void modifyInterestRate(double Rate){
        annualInterestRate=Rate;
    }

    public double getsavingsBalance(){
        return savingsBalance;
    }

    public static void main(String[] args){
    Savingsaccount saver1 = new Savingsaccount (2000.00);
    Savingsaccount saver2 = new Savingsaccount (3000.00);

    System.out.println(saver1.getsavingsBalance());
    System.out.println(saver2.getsavingsBalance());
    

    saver1.modifyInterestRate(0.04);
    saver1.calculateMonthylInterest();
    System.out.println(saver1.getsavingsBalance());
    System.out.println(saver2.getsavingsBalance());

    
    saver2.modifyInterestRate(0.05);
    saver2.calculateMonthylInterest();
    System.out.println(saver1.getsavingsBalance());
    System.out.println(saver2.getsavingsBalance());
    }


}