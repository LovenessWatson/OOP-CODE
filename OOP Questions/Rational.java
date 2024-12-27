public class Rational{
    private int Numerator;
    private int Denominator;

    public Rational(int Numerator,int Denominator){
        this.Numerator=Numerator;
        this.Denominator=Denominator;
    }

    public Rational Addrational(Rational numbers){
        return new Rational(this.Numerator*numbers.Denominator+numbers.Numerator*this.Denominator,
        this.Denominator*numbers.Denominator);
    }

    public Rational SubstractRational(Rational numbers){
        return new Rational(this.Numerator*numbers.Denominator-numbers.Numerator*this.Denominator,
        this.Denominator*numbers.Denominator);
    }

    public Rational Multiply(Rational numbers){
        return new Rational(this.Numerator*numbers.Numerator,this.Denominator*numbers.Denominator);
    }

    
    public Rational Divide(Rational numbers){
        return new Rational(this.Numerator*numbers.Numerator,this.Denominator*numbers.Numerator);
    }

    public String toString(){
        return Numerator +" / "+ Denominator;
    }

    public static void main(String[] args){
        Rational rat1 = new Rational(5,9);
        Rational rat2 = new Rational(8,9);

         System.out.println(rat1.toString());
          System.out.println(rat2.toString());
       
        System.out.println(rat1.Addrational(rat2));
        System.out.println(rat1.SubstractRational(rat2));
        System.out.println(rat1.Multiply(rat2));
        System.out.println(rat1.Divide(rat2));
       
    }
}