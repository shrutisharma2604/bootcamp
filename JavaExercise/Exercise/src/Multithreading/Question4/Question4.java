public class Question4
{
    public static void main(String[] args)
    {
        sharedPrinter printer = new sharedPrinter();
        OddThread oddThread = new OddThread(10, printer);
        oddThread.setName("Odd-Thread");
        EvenThread evenThread = new EvenThread(10, printer);
        evenThread.setName("Even-Thread");
        oddThread.start();
        evenThread.start();
    }
}