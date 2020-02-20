import java.util.List;

public class Cashier {

    List<String> queue[]=new List[5];
    long orderID;
    int billAmount;
    int size=0;
    int front=0;
    int rear=0;
    String status;
    Barista coffee=new Barista();
    public long acceptOrdweAndPayment(List<String> list,int amountReceived){
        if (size<5) {
            queue[rear%5]=list;
            rear++;
            size++;
            orderID++;
            status=coffee.prepareOrder(list);
        }

        synchronized (this){
            status=coffee.status;
        }

        billAmount=calculateTotalBillingAmount(list);
        if (amountReceived>billAmount) {
            payChangeToUser(amountReceived-billAmount);
        }
        return orderID;
    }


    private void payChangeToUser(int amount) {
//        Business logics
    }

    private int calculateTotalBillingAmount(List<String> list) {
        int totalBillAmount=0;
//        Business logics for calculation
        return totalBillAmount;
    }