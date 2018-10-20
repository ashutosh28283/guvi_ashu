import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=n;
      int t=n;
      int c=0;
      int s=0;
      
      int l;
      while(n!=0)
      {
        n=n/10;
        c++;
        }
        while(t!=0)
        {
        int u=1;
          l=t%10;
          t=t/10;
          for(int j=1;j<=c;j++)
          {
              u=u*l;
             }
             s=s+u;
            }
          if(s==k)
          {
          System.out.println("yes");
          }
          else
          {
          System.out.println("no");
          }
          }
          }
