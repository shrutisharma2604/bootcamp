class EvenThread extends Thread
{
    int limit;
    sharedPrinter printer;
    public EvenThread(int limit, sharedPrinter printer)
    {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run()
    {
        int evenNumber = 2;
        while (evenNumber <= limit)
        {
            printer.printEven(evenNumber);
            evenNumber = evenNumber + 2;
        }
    }
}