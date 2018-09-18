
public class Liste
{
    private Vokabel[] vokabeln;
    private int anzahl;
    private int maxAnzahl;

    public Liste(){
        maxAnzahl = 10;
        vokabeln = new Vokabel[maxAnzahl];
        anzahl = 0;
    }

    public Vokabel vorneEntnehmen(){

        if (anzahl > 0){
            Vokabel vok = vokabeln[0];
            for (int i = 0; i < anzahl-1; i++)
            {
                vokabeln[i] = vokabeln[i+1];
            }
            vokabeln[anzahl-1] = null;
            anzahl--;
            return vok;

        }
        return null;
    }

    public void hintenEinfuegen(Vokabel vokabel)
    {
        if (anzahl < maxAnzahl)
        {
            vokabeln[anzahl] = vokabel;
            anzahl++;
        }

    }

    public boolean istLeer()
    {
        if (anzahl == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int anzahlGeben()
    {
        return anzahl;
    }

}
