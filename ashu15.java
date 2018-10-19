import java.util.*;
class Solution
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int c=0;
  if(n==0||n==1)
  {
  System.out.println("no");
  }
  else
  {
  for(int i=2;i<n;i++)
  {
    if(n%i==0)
    {
      c++;
      }
      }
      }
      if(c==0)
      {
      System.out.println("yes");
      }
      else
      {
      System.out.println("no");
      }
      }
      }
