public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int price;

    public Invoice(String partNumber,String partDescription,int quantity,int price){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        if(quantity>0){
            this.quantity=quantity;
        }else{
            this.quantity=0;
        }

        if(price>0){
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int getInvoice(){
        return quantity*price;
    }

    public static void main(String[] args){
        Invoice invoice = new Invoice("T07","High",89,70000);
        System.out.println("The Invoice:"+invoice.getInvoice());
        
    }
}