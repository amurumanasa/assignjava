/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

import java.util.Scanner;

/**
 *
 * @author Unique
 */
import java.util.Scanner;
public class Stud {
 String name;
        int m1,m2,m3,tot;
        float avg;
        public final int roll=10;
        Stud()
                {
                    System.out.println("the details of particular student\n");
                }
                
        static
        {
             Stud st=new Stud();
              Scanner s2=new Scanner(System.in);
            System.out.print("enter name: ");
        st.name=s2.nextLine();
        }
      
      public int calculate()
      {
          tot=m1+m2+m3;
          return tot;
      }
      public void average()
      {
          tot=m1+m2+m3;
          avg=tot/3;
          System.out.println("average is " +avg);
      }
      public void display()
      {
           System.out.println("name:\n"+name );
        System.out.println("rollno:\n" +roll);
        System.out.println("marks\n"+m1+"\t" +m2+ "\t" +m3);
        System.out.println("total marks \n"+calculate());
          
      }
   
    
}
