public class FuzzBizz {
    public static void main(String args[])
    {
        int upperRange= 100;
        for ( int i=1; i<=upperRange; i++ )
        {
            if(i%3==0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");
            if (i%3!=0 && i%5!=0)
                System.out.print(i);
            System.out.println();
        }
    }
}
