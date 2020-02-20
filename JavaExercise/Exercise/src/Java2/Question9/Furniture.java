abstract class Furniture{
    private String wchair;
    private String wtable;
    private String mchair;
    private String mtable;


    public void wood(String chair,String table){
        this.wchair=chair;
        this.wtable=table;
        System.out.println("Wooden chair is : "+wchair+ " Wooden Table is : "+wtable);
    }

    public void metal(String chair,String table){
        this.mtable=table;
        this.mchair=chair;
        System.out.println("Wooden chair is : "+wchair+ " Wooden Table is : "+wtable);
    }

    public abstract void wItemStressTest(int stressLevel);
    public abstract void wItemFireTest(int firePoint);
    public abstract void mItemStressTest(int stressLevel);
    public abstract void mItemFireTest(int firePoint);
}
