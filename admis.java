
package enrollment;
    interface Collegefees//interface function
{
    
    public void display();
}
abstract class admis implements Collegefees//abstract class concept
{
String name;
int adno;
public void setname(String name)
{
 
this.name=name;
}
public String getname()
{
return name;
}
public void setadno(int adno)
{
this.adno=adno;
}
public int getadno()
{
return adno;
}
}
class Feescalculate extends admis //inheritance concept
{
String residence;
int libfee,medfee,ivfee,hstfee,totfee;
public void setfees(int libfee,int medfee,int ivfee)
{
 this.libfee=libfee;
this.medfee=medfee;
this.ivfee=ivfee;
}
public int getlibfee()
{
return libfee;
}
public int getmedfee()
{
return medfee;
}
public int getivfee()
{
return ivfee;
}
    public void setres(String residence)
    {
        this.residence=residence;
    }
    public String getres()
    {
        return residence;
    }
    public void calcfees()
    {
        if(residence=="hostel")
        {
            hstfee=12000;
            totfee=libfee+medfee+ivfee+hstfee;
        }
        else
        {
            totfee=libfee+medfee+ivfee;
        }
    }
    public void display()
    {
        System.out.println("the details of student admission is:\nname:\n"+getname()+"admission no:\n"+getadno()+"totalfees:\n"+totfee);
    }   
}
