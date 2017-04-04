import java.util.*;
import java.io.*;
class UnOrderedList
{
	static Scanner sc=null;
	public static void main(String[] args)
	{
	     unorder u=new unorder();
             String st=null;


	  try{
              sc=new Scanner(new File("f1.txt"));
               st=sc.nextLine();
	      }catch(Exception e)
              {
		System.out.println("file not found");
	      }

      
            String s[]=st.split(",");
            for(int i=0;i<s.length;i++)
            {
           u.add(s[i]);
	    }

            u.display();




           System.out.println("Enter the word to search");
            sc=new Scanner(System.in);
           String s1=sc.next();
           boolean b=u.search(s1);
           //  u.display();
           if(b==true)
           {
              System.out.println("word found");
             u.remove(s1);
           }else
           {
              System.out.println("word not found");
              u.add(s1);
           }
            
           u.display();

	}
}
class unorder
{
	Node head=null;
	void add(Object ob)
	{
        	Node n1=new Node(ob);
        	if(head==null)
        	{
		   head=n1;
                    return;
                   
        	}

         	Node t=head;
		while(t.link!=null)
                 {
                   t=t.link;
                 }
		t.link=n1;
                return;
	}
         
	void display()
	{
		Node t=head;
		while(t!=null)
		{
		       System.out.print(t.data+"->");
		       t=t.link;
                }
                System.out.println();
	}

	boolean search(String ob)                         
	{
	
		Node t=head;
		while(t!=null)
		{
                       if(((String)t.data).equalsIgnoreCase(ob))
                       {
                           return true;
                       }
		           t=t.link;
                       
                }
                   return false;
         }

	void remove(String ob)
	{
		Node t=head;
		Node prev=null;
                if(((String)t.data).equals(ob))
                 {
                   head=head.link;
                  }
		while(t!=null && !((String)t.data).equalsIgnoreCase(ob))
		{
			   prev=t;
                            t=t.link;
                 }
                     prev.link=t.link;
		    
                   
               
         }




}

class Node
{
	 Object data;
	 Node link;
	Node(Object data)
	{
	  this.data=data;
          this.link=null;
        }
	 
}
	               
              
       
           
            









              




















            








                
	
		
		
	  
