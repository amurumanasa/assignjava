
package enrollment;//main function of the admis concepts
public class Enrollment {
    public static void main(String[] args) {
        Feescalculate a=new Feescalculate();
        a.setname("manu");
        a.setadno(12);
        a.setfees(1200,13000,15000);
        a.setres("hostel");
        a.calcfees();
        a.display();
    }
    
}
