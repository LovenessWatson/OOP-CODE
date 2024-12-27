public class Employee{
    private String firstName;
    private String lastName;
    private int monthlySalary;

    public Employee(String firstName,String lastName,int monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        if(monthlySalary>=0){
            this.monthlySalary=monthlySalary;
        }else{
            monthlySalary=0;
        }
    }

    public int getYearlysalary(){
        return monthlySalary*12;
    }

    public void getRaise(double percent){
         monthlySalary+=monthlySalary*percent/100;
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Amina","Amina",200000);
        Employee emp2 = new Employee("Amina","Amina",100000);
        emp1.getRaise(10);
         emp1.getRaise(10);

        System.out.println("Object1");
        System.out.println("The first year salary:" + emp1.getYearlysalary());
        System.out.println("The percent raise salary:" + emp1.getYearlysalary());

        System.out.println("Object2");
        System.out.println("The first year salary:" + emp2.getYearlysalary());
        System.out.println("The percent raise salary:" + emp2.getYearlysalary());
    }
}