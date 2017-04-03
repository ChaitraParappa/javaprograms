class Parentheses
{
	public static void main(String[] args)
	 {
		String st="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3";
		Stack s=new Stack(st.length());
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='(')
			{
		         s.push(ch[i]);
			}
                    else
			{
			 switch(ch[i])
			  {
			   case ')':s.pop();
                                 break;
                           default:
				 break;
			   }
                          }
		}
               if(s.isEmpty())
              System.out.println("balenced");
	      else
	      System.out.println("not balenced");
	 }
}
class Stack
{
	int cp=0;
	Object ob[];
        int top=-1;
	Stack(int cp)
	{
	  this.cp=cp;
          ob=new Object[cp];
	}

	void push(Object obj)
	{
	  if(top==cp-1)
           {
		System.out.println("stack overflow");
	    }
            top++;
           ob[top]=obj;
	}

	Object pop()
	{
	  if(top==-1)
	   {
		System.out.println("stack underflow");
	    }
	   return ob[top--];
	}
	
	boolean isEmpty()
	{
	  return top==-1;
        }
}
	  
           























                     
