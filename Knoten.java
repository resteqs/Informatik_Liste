
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
    
    public void hintenEinfuegen(Datenelement dneu)
    {
        if(nachfolger != dneu)
        {
            nachfolger.hintenEinfuegen(dneu);
        }
        else
        {
            Knoten kneu;
            kneu = new Knoten(dneu, null);
            nachfolger = kneu; 
        }
    }
    public Knoten einfuegenVor(Datenelement dneu, Datenelement vergleichswert)
    {
        if(delement!= vergleichswert)
        {
            if(nachfolger !=null)
            {
                nachfolger = nachfolger.einfuegenVor(dneu,vergleichswert);
            }
            else{
                hintenEinfuegen(dneu);
            }
            return this;
        }
        else{
        Knoten kneu;
        kneu = new Knoten(dneu, this);
        return kneu;
        }
    }

    public Datenelement suchen(String vergleichen)
    {
        if (delement.schluesselIstGleich(vergleichen))
        {
            return delement;
        }
        else {
            if (nachfolger != null)
            {
                return nachfolger.suchen(vergleichen);
            }
            else 
            {
                return null;
            }
        }
    }

}
