import java.util.*;
class Solution
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
int k=1;
  int a=sc.nextInt();
  if(a==0||a==1)
  {
    k=1;
    System.out.println(k);
   }
   else
   {
      for(int i=a;i>=1;i--)
      {
      k=k*i;
      }
     System.out.println(k);
     }
     }
     }
