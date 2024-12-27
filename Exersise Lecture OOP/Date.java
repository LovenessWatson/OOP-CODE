public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month,int day,int year){
        if(month>=1 && month<=12){
            this.month=month;
        }else{
            this.month=1;
        }

        this.day=day;
        this.year=year;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args){
        Date date = new Date(9, 12, 2003);
        System.out.println("Date:");
        date.displayDate();
    }
}