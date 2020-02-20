public class Question5 {
    int a;
    int b;

    public Question5(int a, int b){
        this.a=a;
        this.b=b;
    }

    public Question5(Question5 ref){
        a=ref.a;
        b=ref.b;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj = new A();
        obj.i=1;
        obj.j=3;

        A obj1=(A)obj.clone();
        obj1.j=9;
        System.out.println(obj.j+ " "+ obj1.j);


        Question5 o = new Question5(4,6);
        Question5 o1= new Question5(o);
        o1.a=10;

        System.out.println(o.a+" "+o1.a);
    }
}
