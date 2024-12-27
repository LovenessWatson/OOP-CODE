public class Triangle{
    private int newa;
    private int newb;
    private int newc;

    public Triangle(int newa,int newb,int newc){
        this.newa=newa;
        this.newb=newb;
        this.newc=newc;
    }

    public boolean isTriangle(){
        if(newa>0 && newb>0 && newc>0){
            if(newa+newb>newc && newa+newc>newb && newb+newc>newa){
                return true;
            }
            return false;
        }
            return false;
    }

    public double getArea(){
        if(isTriangle()){
            return 0.5 * (newa*newb);
        }else{
            return 0.0;
        }

    }

    public static void main(String[] args){
        Triangle tr = new Triangle(3,5,4);
        System.out.println("Is Triangle:"+tr.isTriangle());
        System.out.println("GetArea:"+tr.getArea());
    }
}