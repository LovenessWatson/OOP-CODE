public class Account{
    private int Accountbalance;

    public Account(int Initialbalance){
        if(Initialbalance>=0){
             Accountbalance=Initialbalance;
        }else{
            Accountbalance=0;
            System.out.println("Initial balance is invalid");
        }
    }

    public int getCredit(int amount){
        Accountbalance+=amount;
        return Accountbalance;
    }

    public int getDebit(int amount){
        if(amount>=Accountbalance){
            System.out.println("The amount exeed account balance");
        }else{
            Accountbalance-=amount;
        }
        return Accountbalance;
    }

    public int getBalance(){
        return Accountbalance;
    }

    public static void main(String[] args){
        Account acc1 = new Account(1000);
        Account acc2 = new Account(2000);
        
        acc1.getCredit(6700);
        acc1.getDebit(9000);
        System.out.println("Object1");
        System.out.println(acc1.getBalance());

        acc2.getCredit(9876);
        acc2.getDebit(90000);
        System.out.println("Object2");
        System.out.println(acc2.getBalance());

    }
}