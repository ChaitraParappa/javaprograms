import java.util.*;
class CouponNum
{
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Coupon");
         int n=sc.nextInt();
         int count=0;
         
         int a[]=new int[n];
          for(int i=0;i<a.length;i++)
          {
            Random r = new Random();
            int rn = (r.nextInt(n)+1);
            System.out.println("random "+rn);
             count++;
            a[i]=rn;
           for(int j=0;j<i;j++)
             {
               if(a[j]==rn)
                 {
                   i--;
                  break;
                  }
              }
           }
          for(int k=0;k<a.length;k++)
            {
             System.out.print(a[k]+" ");
            }
            System.out.println();
            System.out.println("Count "+count);
          
       }
  
       
}        

