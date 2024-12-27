public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        setlength(length);
        setwidth(width);
    }

    public void setlength(double length){
        if(length>=0.0 && length<=20.0){
            this.length=length;
        }else{
            this.length=1;
        }
    }

    public double getlength(){
        return length;
    }

    public void setwidth(double width){
        if(width>=0.0 && width<=20.0){
            this.width=width;
        }else{
            this.width=1;
        }
    }

    public double getwidth(){
        return width;
    }

    public double getpermiter(){
        return 2*(length+width);
    }

    public double getArea(){
        return length*width;
    }

    public static void main(String[] arg){
        Rectangle rect = new Rectangle(3.3,4.4);
        System.out.println("The length:"+rect.getlength());
        System.out.println("The width:"+rect.getwidth());
        System.out.println("The perimeter:"+rect.getpermiter());
        System.out.println("The Area:"+rect.getArea());
    }
}