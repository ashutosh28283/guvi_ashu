import java.util.*;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%4==0)
{
if(a%100==0)
{
  if(a%400==0)
  {
    System.out.println("yes");
  }
  else
  {
    System.out.println("no");
  }
}
 else
  {
    System.out.println("yes");
  }
  }
else
{
  System.out.println("no");
}
  }
  }
  
