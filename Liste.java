
public class Liste
{
private Knoten anfang;

public Liste()
{
    anfang = null;
 
}
public int laengeGeben()
{
if(anfang == null){
return 0;
}
else {
return anfang.restlaengeGeben();
}
}
public Datenelement suchen(String vergleichen)
{
    if ( anfang == null)
    {
     return null;   
    }
    else {
    return anfang.suchen(vergleichen);
    }
}
public void vorneEinfuegen(Datenelement dneu)
{
    Knoten kneu;
    kneu =  new Knoten(dneu,anfang);
    anfang= kneu;
}
public void hintenEinfuegen(Datenelement d)
{
    if(anfang!= null)
    {
    anfang.hintenEinfuegen(d);
    }
    else {
    vorneEinfuegen(d);
    }
}
public void einfuegenVor(Datenelement dneu, Datenelement vergleichswert)
{
    if(anfang!= null)
    {
        anfang = anfang.einfuegenVor(dneu, vergleichswert);
    }
    else{
        vorneEinfuegen(dneu);
    }
}
}
