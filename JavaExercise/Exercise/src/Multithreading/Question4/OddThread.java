class OddThread extends Thread
{
    int limit;
    sharedPrinter printer;
    public OddThread(int limit, sharedPrinter printer)
    {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run()
    {
        int oddNumber = 1;
        while (oddNumber <= limit)
        {
            printer.printOdd(oddNumber);
            oddNumber = oddNumber + 2;
        }
    }
}