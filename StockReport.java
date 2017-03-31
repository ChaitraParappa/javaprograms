import java.util.Scanner;
class StockReport
{
       public static void main(String[] args)
       {
         Scanner sc=new Scanner(System.in);
         int sum=0;
         
         System.out.println("Enter the number of stocks");
         int n=sc.nextInt();
         int a[]=new int[n];
         int i=1;
         while(i<=n)
         {
          System.out.println("Enter the stock "+i+" name");
          String name=sc.next();
          System.out.println("enter the no of share");
          int sh=sc.nextInt();
          System.out.println("Enter the share price");
          int sp=sc.nextInt();
          a[i]=sh*sp;
          i++;
          }
          for(int j=0;j<a.length;j++)
          {
           sum=sum+a[j];
          }
           System.out.println("The stock report "+sum);
        }
}
             
           
