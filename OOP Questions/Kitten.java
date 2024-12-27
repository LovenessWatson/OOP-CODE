public class Kitten{
    private String Name;
    private String Owner;
    private int Age;

    public Kitten(String Name,String Owner){
        this.Name=Name;
        this.Owner=Owner;
        this.Age=0;
    }

    public int getAge(){
        return Age;
    }

    public int havebirthday(){
        return Age++;
    }

    public String toString(){
        return Name + " is " + Age + " and belongs to " + Owner;
    }

    public static void main(String[] args){
        Kitten kit = new Kitten("Ammy","Sngo");
        System.out.println(kit.toString());
        kit.havebirthday();

      
        System.out.println(kit.toString());
        kit.havebirthday();

        
        System.out.println(kit.toString());
        kit.havebirthday();
    }
    }
