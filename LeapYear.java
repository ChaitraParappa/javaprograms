import java.util.Scanner;
class LeapYear
{
     public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the year");
          int yy=sc.nextInt();

          if((yy%4==0 && yy%100!=0) || yy%400==0)
             {
               System.out.println(yy+" is a leap year");
             }
           else
             {
                System.out.println(yy+" is  not a leap year");
             }
        }
}

