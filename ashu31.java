import java.util.*;
class Solution
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
int temp;
  int n=sc.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
  {
  a[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
      if(a[j]>a[j+1])
      {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
      }
    }
    }
    if(n%2==1)
    {
    System.out.println(a[n/2]);
    }
    else
    {
    System.out.println(((a[n/2])+(a[(n/2)+1]))/2);
    }
}
    }
