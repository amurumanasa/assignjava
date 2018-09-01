
package enumno;
import java.util.Scanner;
enum Day//declaration of enum constants
{
    sunday,monday,tuesday,wednesday,thursday,friday,saturday;
}
public class Enumno {
    Day d;
    public Enumno(Day d)
    {
        this.d=d;
    }
    public void select()
    {
        switch(d)
        {
            case sunday:
                System.out.println("holiday\n");
                break;
            case monday:
                System.out.println("first day of the week\n");
                break;
            case saturday:
                System.out.println("last working day of the week\n");
                break;
            default:
                System.out.println("mid days of the week\n");
                break;
        }
    }
    public static void main(String[] args) {
        String a;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a day:\n ");
        a=s.next();
        Enumno t1 = new Enumno(Day.valueOf(a));
        t1.select();
        // TODO code application logic here
    }
    
}
