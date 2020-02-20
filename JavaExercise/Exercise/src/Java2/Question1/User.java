public class User implements Users {
    int userID;
    String userName;
    String userAddress;
    int phoneno;

    public User(int userID,String userName,String userAddress,int phoneno){
        this.userID=userID;
        this.userName=userName;
        this.userAddress=userAddress;
        this.phoneno=phoneno;
    }

    @Override
    public Book returnBooks() {
        return null;
    }

    @Override
    public void addNewUser() {
        new User(userID,userName,userAddress,phoneno);
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void updateDetails() {

    }

    @Override
    public void bookPurchase() {

    }
}