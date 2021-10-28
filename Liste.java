
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
}
