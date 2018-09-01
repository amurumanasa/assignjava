
package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    int n;
    public void put(int a[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("elements are:" +a[i]);
        }
      }
    
    public static void main(String[] args) {
        int n;
         Scanner z=new Scanner(System.in);
         Array y=new Array();
    System.out.println("enter n value:");
    n=z.nextInt();
    int a[]=new int[n];
   
System.out.print("enter array elements:\n");
for(int i=0;i<n;i++)
{
    a[i]=z.nextInt();
}
y.put(a);
Arrays.sort(a);//soring of array elements
System.out.println("sorted array is="+Arrays.toString(a));
System.out.print("enter a element to find:\n");
int r=z.nextInt();
 int u=Arrays.binarySearch(a,r);//searching of an element
 System.out.println("the position of finded element is" +u);
 int []c=new int[n];
 System.arraycopy(a,0,c,0,n);//copying of array elements
 System.out.println("copied array is");
 for(int i=0;i<n;i++)
     System.out.println(+c[i]);
 boolean b=Arrays.equals(a,c);//condition of arry elements
 System.out.println(" condition is:\n"+(b?"==":"!="));
 Arrays.fill(a,7);//filling of an array element
 System.out.println("after filled the array is:"+Arrays.toString(a));
    }
    
}
