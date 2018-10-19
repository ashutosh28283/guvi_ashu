import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int l=a;
  int s=0;
  int u;
  while(a!=0)
  {
    u=a%10;
    s=s*10+u;
    a=a/10;
    }
   if(s==l)
   {
   System.out.println("yes");
   }
   else
   {
   System.out.println("no");
   }
   }
   }
