import java.util.Scanner;

class Factors
{
    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the  nth number");
     int n=sc.nextInt();
    
      for(int j=2;j<=n;j++)
       {
      if(isPrime(j))
        {
         if(n%j==0 && j*j<=n)
        System.out.println(j);
         }
        

        }
      }        
         
      static boolean isPrime(int num)
        {
          int i=2;
          while(i<=num/2)
          {
            if(num%i==0)
            return false;
            i++;
          }
         return true;
        }
}

     
