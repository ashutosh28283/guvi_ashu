import java.util.*;
class Solution
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a=sc.nextInt();
  int d=sc.nextInt();
if(a==0)
{
System.out.println("invalid");
}
else
{
  int s=(n*(2*a+(n-1)*d))/2;
  System.out.println(s);
  }
}
  }
