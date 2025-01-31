public class Table
{
    public static void main(String[] args)
    {
        int n = 5;
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }
        //reverse order
//        for(int i=10;i>=1;i--)
//        {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        //sum of table
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
