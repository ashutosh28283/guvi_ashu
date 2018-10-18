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
System.out.println("invalid");
}
else if(c=="a"||c=="e"||c=="i"||c=="o"||c=="u"||c=="A"||c=="E"||c=="I"||c=="O"||c=="U")
{
System.out.println("Vowel");
}
else if(((int)a>=65&&(int)a<=90)||((int)a>=97&&(int)a<=122))
{
System.out.println("Consonant");
}
else
{
System.out.println("invalid");
}
}
}
