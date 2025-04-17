import java.util.*;
public class Main{
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);
 int n=in.nextInt();
         int size=in.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=in.nextInt();
         }
         int arr1[]=new int[size];
         int count=0;
         for(int i=size-n;i<size;i++)
         {
             arr1[count]=arr[i];
             count++;
         }
         int count1=0;
         for(int i=n;i<size;i++)
         {
             arr1[i]=arr[count1];
             count1++;
         }
         for(int i=0;i<size;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
         for(int i=0;i<size;i++)
         {
             System.out.print(arr1[i]+" ");
        }}}