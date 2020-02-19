import java.util.Scanner;
class Main13
{
        public static void main(String[] args)throws Question13 {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            try
            {
                if(a==0)
                {
                    throw new Question13("This is my exception");
                }
            }
            catch(Question13 e)
            {
                System.out.println(e.getMessage());
            }
        }
}