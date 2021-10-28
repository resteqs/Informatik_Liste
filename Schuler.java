
public class Schuler implements Datenelement
{
    private String name;
    public Schuler(String s)
    {
        name = s; 
    }
    public void informationAusgeben()
    {
        System.out.println(name);
    }
    public boolean istKleinerAls(Datenelement d){
        boolean b; 
        b = true;
        return b;
    }
    public boolean schluesselIstGleich(String s)
    {
        boolean b; 
        b = name.equals(s);
        return b;
    }
    
}
