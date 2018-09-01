
package student1;
import pack.stud;//importing package
import java.util.Arrays;
import java.util.Scanner;//to get input
public class Student1 {
      
    
          
       //declaring a main function
    public static void main(String[] args) {
        int i,n;
        Scanner p=new Scanner(System.in);
    
      System.out.print("enter the number of students:\n");
      n=p.nextInt();
      stud[] obj=new stud[n];
      for(i=0;i<n;i++)
          obj[i]=new stud();
      for(i=0;i<n;i++)
      {
      obj[i].get();
      }
      for(i=0;i<n;i++)
      {
       obj[i].display();
      }
      for(i=0;i<n;i++)
      {
          obj[i].average();
      }
      for(i=0;i<n;i++)
      {
          obj[i].grading();
      }
     
    }
    
}