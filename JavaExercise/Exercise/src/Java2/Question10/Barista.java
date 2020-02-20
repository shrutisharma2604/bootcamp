import java.util.ArrayList;
import java.util.List;

public class Barista {

    String status;

    public String prepareOrder(List<String> list) {
        status="In Process";
        return status;
    }

    public String placedOrderComplete(){
        status="Ready";
        return status;
    }

    public static void main(String[] args) {
        Barista obj=new Barista();
        obj.placedOrderComplete();
        obj.prepareOrder();
    }
}