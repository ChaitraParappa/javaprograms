import java.util.Scanner;
class string
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the username");
String name=sc.nextLine();

if(name.length()>3)
System.out.println("HELLO "+name+" , HOW ARE YOU?");
}
}
