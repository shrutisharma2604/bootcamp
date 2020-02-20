class Book extends Books{
    public int bookid;
    public String bookname;
    public String bookAuth;
    public String yearofpub;
    public float price;

    public Book(int bookid,String bookname, String bookAauth, String yearofpub, float price) {
        this.bookid=bookid;
        this.bookname=bookname;
        this.bookAuth=bookAauth;
        this.yearofpub=yearofpub;
        this.price=price;
    }

    @Override
    void addNewBooks(String bookname, String bookAauth, String yearofpub, float price) {
        int id=1;
        new Book(id++,bookname,bookAauth,yearofpub,price);
    }

    @Override
    void deleteBooks() {

    }

    @Override
    void displayBookDetails() {
        System.out.println("Book ID:"+bookid+" Book Name:"+bookname+" Book Author:"+bookAuth+" Year of Publish"
                +yearofpub+" Book Price:"+price);
    }


    @Override
    void inquiryBook() {

    }
}