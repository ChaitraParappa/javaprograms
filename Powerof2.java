class Powerof2
{
     public static void main(String[] args)
      {
         int n=Integer.parseInt(args[0]);
         int p=2;
         for(int i=0;i<n;i++)
          {
            System.out.println(p);
            p=p*2;
           }
       }
}
