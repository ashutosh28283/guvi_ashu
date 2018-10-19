import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b)
    {
    System.out.println("invalid");
    }
    else
    {
    for(int i=a+1;i<=b;i++)
    {
      if(i%2!=0)
      {
        System.out.print(i+" ");
       }
      }
      
}
}
      }
