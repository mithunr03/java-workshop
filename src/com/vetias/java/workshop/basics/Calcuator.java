public class Calcuator {
    public int  division(int a ,int b)
    {
     try{
        if(b==0)
        {
            throw new ArithmeticException("Divided by zero is not possible");
            return 0;
        }
    
        return a/b;
     }
    
     catch (ArithmeticException e)
     {
        System.out.println(e.getMessage());
        return 0;                                                                                               

     }
    
     public int addition(int a,int b)
     {
        return a+b;
     }
     public int subtraction( int a ,int b)
     {
        return a-b;
     }
     public static void main(String[] args)
      {
        Calcuator calcuator=new Calcuator();
        System.out.println("addition"+calcuator.addition(5,6));
        System.out.println("subtraction"+calcuator.subtraction(5,6));
        System.out.println("division"+calcuator.division(5,0));
     }
    
}
}

