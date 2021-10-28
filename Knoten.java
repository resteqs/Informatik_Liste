
public class Knoten
{
private Datenelement delement;
private Knoten nachfolger; 

    public Knoten(Datenelement d)
    {
     delement = d;
     

    }
    public Knoten(Datenelement d, Knoten k)
    {
        delement = d;
        nachfolger = k; 
    }
    public int restlaengeGeben()
    {
        if(nachfolger == null)
        {
        return 1;
    }
    else {
    return nachfolger.restlaengeGeben() +1;
    }
    }

}
