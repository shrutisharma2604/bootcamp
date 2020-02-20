import java.util.List;

public class User {
    long orderID;
    int amountPaidByUser;
    String status;
    Cashier order=new Cashier();

    public long placeOrderByCashPayment(List<String> listOfItem){

        status="Placing Order";
        orderID=order.acceptOrdweAndPayment(listOfItem,amountPaidByUser);
        status=order.status;
        return orderID;
    }


    public void notification(){
        synchronized (this){
            status=order.status;
        }
//        set status as notification
    }
}