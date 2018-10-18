import java.util.*;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char c=a.charAt(0);
if(a.length()>1)
{
System.out.println("No");
}
else if(((int)a>=65&&(int)a<=90)||((int)a>=97&&(int)a<=122))
{
System.out.println("Alphabet");
}
else
{
System.out.println("No");
}
}
}
