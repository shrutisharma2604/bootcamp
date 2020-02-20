public class A  implements Cloneable {
    int i;
    int j;
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}