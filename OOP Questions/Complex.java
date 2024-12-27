public class Complex{
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }

    public Complex(){
        this.realPart=1.0;
        this.imaginaryPart=1.0;
    }

    public Complex Addcomplex(Complex numbers){
        return new Complex(this.realPart+numbers.realPart,this.imaginaryPart+numbers.imaginaryPart);
    }

    public Complex Substractcomplex(Complex numbers){
        return new Complex(this.realPart-numbers.realPart,this.imaginaryPart-numbers.imaginaryPart);
    }

    public String toString(){
        return "("+ realPart + " , "+ imaginaryPart+ ")";
    }

    public static void main(String[ ] args){
        Complex comp = new Complex(5.6,4.7);
        System.out.println(comp.toString());
    }
}