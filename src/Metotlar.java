public class Metotlar {
    public  int addition(int number1, int number2)
    {
        int add=number1+number2;
        return add;
    }
    public int extraction(int number3,int number4)
    {
        int eject=number3-number4;
        return eject;
    }
    public int factorial (int c)
    {
        int f=1;
        for (int i=1;i<c;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args)
    {
     Metotlar m=new Metotlar();
        System.out.println(m.addition(10,20));
        System.out.println(m.extraction(10,20));
        System.out.println(m.factorial(6));
    }
}
