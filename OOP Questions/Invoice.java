public class Invoice{
    private String partNumber;
    private String partDescription;
    private int Quantity;
    private int Price;

    public Invoice(String partNumber,String partDescription, int Quantity,int Price){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.Quantity=Quantity;
        this.Price=Price;

    }

    public void setQuantity(int Quantity){
         if(Quantity>0){
            this.Quantity=Quantity;
        }else{
            this.Quantity=0;
        }
    }

    public int getQuantity(){
        return Quantity;
    }

    public void setPrice(int Price){
        
        if(Price>0){
            this.Price=Price;
        }else{
            this.Price=0;
        }
    }

    public int getPrice(){
        return Price;
    }

    public int getInvoice(){
        return Quantity*Price;
    }

    public static void main(String[] args){
        Invoice inv = new Invoice("T78","Memo",56,70000);
        System.out.println("Quantity:"+inv.getQuantity());
        System.out.println("Price:"+inv.getPrice());
        System.out.println("getInvoice:"+inv.getInvoice());
    }

}