import java.util.Scanner;
class Anagram
{
     public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
         
          if(isAnagram())
            System.out.println("Anagram");
          else
            System.out.println("Not Anagram");
       }
        
      static boolean isAnagram()
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the  first string");
          String st=sc.nextLine();
          System.out.println("Enter the  second string");
          String st1=sc.nextLine();
          st=removeSpace(st);
          st1=removeSpace(st1);
           if(st.length()!=st1.length())
               return false;
           else
             {
               st=lowerCase(st);
               st1=lowerCase(st1);
             }
             boolean b=check(st,st1);
                 return b;
        }
       
       static String removeSpace(String s1)
         {
            char ch[]=s1.toCharArray();
            s1="";
            for(int i=0;i<ch.length;i++)
              {
                if((i==0 && ch[i]!=' ') || ch[i]!=' ')
                  {
                     s1=s1+ch[i];
                  }
               }
             return s1;
          }
       static String lowerCase(String s1)
          {
            char ch[]=s1.toCharArray();
            s1="";
            for(int i=0;i<ch.length;i++)
               {  
                 if(ch[i]>='A' && ch[i]<='Z')
                   {
                     s1=s1+(char)(ch[i]+32);
                   }
                  else
                     s1=s1+ch[i];
                }
            return s1;
           }
        static boolean check(String s1,String s2)
           {
              char c1[]=s1.toCharArray();
              char c2[]=s2.toCharArray();
               c1=sort(c1);
               c2=sort(c2);
               for(int i=0;i<c1.length;i++)
                {
                   if(c1[i]!=c2[i])
                    return false;
                }
                 return true;
            }

         static char[] sort(char c[])
            {
               for(int i=0;i<c.length;i++)
                 {
                 for(int j=i+1;j<c.length;j++)
                   {
                      if(c[i]>c[j])
                        {
                          char temp=c[i];
                               c[i]=c[j];
                               c[j]=temp;
                         }
                    }
                  }
                 return c;
              }
}

















  
            




























   
    
      
