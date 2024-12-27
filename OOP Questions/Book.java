public class Book{
    private String Name;
    private String ISBN;
    private String Author;
    private String Publisher;

    public Book(String Name,String ISBN,String Author,String Publisher){
        this.Name=Name;
        this.ISBN=ISBN;
        this.Author=Author;
        this.Publisher=Publisher;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    public void setAuthor(String Author){
        this.Author=Author;
    }

    public void setPublisher(String Publisher){
        this.Publisher=Publisher;
    }

    public String getName(){
        return Name;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getAuthor(){
        return Author;
    }

    public String getPublisher(){
        return Publisher;
    }   

    public String getBookInfo(){
        return "Name: "+ Name + " Isbn: " + ISBN + " Author: "+ Author+ " Publisher: "+Publisher;
    }

    public static void main(String[] args){
        Book bk1 = new Book("Account one","B-08","Jack","International Library");
        Book bk2 = new Book("Economy one","B-08","Jack","International Library");
        
        System.out.println(bk1.getBookInfo());
        System.out.println(bk1.getBookInfo());
    }
}