enum House{
    ONEBHK(40),
    TWOBHK(60),
    THREEBHK(80);
    private int price;
    House (int p){
        price=p;
    }
    int getPrice(){
        return price;
    }
}
public class JavaExercise8{
    public static void main(String[] args) {
        System.out.println("All House prices:");
        for (House h : House.values())
            System.out.println(h + " costs " + h.getPrice() + " lacs.");
    }
}