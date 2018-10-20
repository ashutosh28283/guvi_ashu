import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
int m=sc.nextInt();
for(int i=n+1;i<m;i++)
{

      int k=i;
int p=i;
      int t=i;
      int c=0;
      int s=0;
      
      int l;
      while(k!=0)
      {
        k=k/10;
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
          if(s==p)
          {
          System.out.print(i+" ");
          }
          }
          }
          }
