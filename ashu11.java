import java.util.*;
class Solution
{
public static void main(String[] args)
{
int s=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
 }
 for(int i=0;i<k;i++)
 {
 s=s+a[i];
 }
 System.out.println(s);
 }
 }
