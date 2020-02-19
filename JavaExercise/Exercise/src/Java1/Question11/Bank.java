public class Bank{
    String name;
    int rateofinterest;
    public void getDetails(){
        name="bank";
        rateofinterest=5;
        System.out.println("Bank Details: Name of Bank="+name+" rateofinterest="+rateofinterest);
    }
    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.getDetails();
        Bank obj1=new SBI();
        obj1.getDetails();
        Bank obj2=new BOI();
        obj2.getDetails();
        Bank obj3=new ICICI();
        obj3.getDetails();
    }
}
class SBI extends Bank{
    String name;
    int rateofinterest;
    public void getDetails(){
        name="SBI";
        rateofinterest=15;
        System.out.println("Bank Details: Name of Bank="+name+" rateofinterest="+rateofinterest);
    }
}
class BOI extends Bank{
    String name;
    int rateofinterest;
    public void getDetails(){
        name="BOI";
        rateofinterest=25;
        System.out.println("Bank Details: Name of Bank="+name+" rateofinterest="+rateofinterest);
    }
}
class ICICI extends Bank{
    String name;
    int rateofinterest;
    public void getDetails(){
        name="ICICI";
        rateofinterest=10;
        System.out.println("Bank Details: Name of Bank="+name+" rateofinterest="+rateofinterest);
    }
}
