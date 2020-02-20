public interface Librarians {
    Book searchBook(String name);
    boolean verifyMember(int id);
    void orderBooks();
    void sellBook();
}