import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
     long a=sc.nextLong();
      long b=sc.nextLong();
      long k=1;
	if(b==0){
	k=1;
	System.out.println(k);
	}
	else if(a==0)
{
k=0;
System.out.println(k);
}
else
{
      for(int i=0;i<b;i++)
      {
          k=k*a;
       }
       System.out.println(k);
       }
 }
      }
