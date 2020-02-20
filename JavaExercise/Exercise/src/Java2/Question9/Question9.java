class Question9 extends Furniture{

    @Override
    public void wItemStressTest(int stressLevel) {
        if(stressLevel>500){
            System.out.println("Stress test fails");
        }
        else
            System.out.println("Stress test passed");
    }

    @Override
    public void wItemFireTest(int firePoint) {
        if (firePoint>20) {
            System.out.println("Fire test fails");
        }
        else{
            System.out.println("Fire test passed");
        }
    }

    @Override
    public void mItemStressTest(int stressLevel) {
        if(stressLevel>2000){
            System.out.println("Stress test fails");
        }
        else
            System.out.println("Stress test passed");
    }

    @Override
    public void mItemFireTest(int firePoint) {
        if (firePoint>1000) {
            System.out.println("Fire test fails");
        }
        else{
            System.out.println("Fire test passed");
        }
    }


    public static void main(String[] args) {
        Furniture fur=new Question9();
        fur.metal("Shofa","Mordan light table");
        fur.wood("Shinnig shisham", "Glass with wood");

        fur.mItemFireTest(2000);
        fur.mItemStressTest(2000);
        fur.wItemFireTest(150);
        fur.mItemStressTest(300);
    }
}