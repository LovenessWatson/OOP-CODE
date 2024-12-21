public class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int calculateperimeter(){
        return 2*(length+width);
    }

    public int calculateArea(){
        return length*width;
    }

    public static void main(String[] args){
        Rectangle rect = new Rectangle(3,4);
        System.out.println("The perimeter:"+rect.calculateperimeter());
        System.out.println("The area:"+rect.calculateArea());
    }
}