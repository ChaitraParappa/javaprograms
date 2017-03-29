import java.util.Scanner;

class HarmonicNum
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number for harmonic number");
     int n=sc.nextInt();
     double sum=0;
     for(double i=1;i<=n;i++)
      {
        sum=sum+(1/i);
       System.out.print("1/"+i+" +");
       
       
      }
     System.out.println();
    System.out.println("The nth Harmonic num is "+ sum);
    
    }
}
