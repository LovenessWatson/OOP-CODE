public class Account{
    private int Accountbalance;

    public Account(int Initialbalance){
        if(Initialbalance>=0){
            Accountbalance=Initialbalance;
        }
        else{
            Accountbalance=0;
            System.out.println("Error,the Initial balance is invalid");
        }
    }

    public void credit(int amount){
        Accountbalance+=amount;
    }

    public void debit(int amount){
        if(amount>Accountbalance){
            System.out.println("Debit amount exeed Account balance");
        }else{
            Accountbalance-=amount;
        }
    }

    public int getBalance(){
        return Accountbalance;
    }

    public static void main(String[] args){
        Account acc1 = new Account(2000);
        Account acc2 = new Account(-1000);

        System.out.println("Object1");
        System.out.println("Initial balance:"+acc1.getBalance());
        acc1.credit(200);
        System.out.println("Initial balance after credit:"+acc1.getBalance());
        acc1.debit(100);
        System.out.println("Initial balance after debit:"+acc1.getBalance());

        System.out.println("Object2");
        System.out.println("Initial balance:"+acc2.getBalance());
        acc1.credit(200);
        System.out.println("Initial balance after credit:"+acc2.getBalance());
        acc1.debit(100);
        System.out.println("Initial balance after debit:"+acc2.getBalance());
    }
}