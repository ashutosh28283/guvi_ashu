import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
      int q=sc.nextInt();
      for(int i=p+1;i<q;i++)
      {
          int t=i;
          int c=0;
          for(int j=2;j<i;j++)
          {
                if(t%j==0)
                {
                    c++;
                   }
            }
            if(c==0)
            {
              System.out.print(i+" ");
              }
           }
           }
           }
