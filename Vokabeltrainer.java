
public class Vokabeltrainer
{
    private Liste liste;
    private Vokabel aktuelleVokabel;

    public Vokabeltrainer()
    {
        liste = new Liste();

    }

    public void woerterEintragen(){
        liste.hintenEinfuegen(new Vokabel("Haus","house"));
        liste.hintenEinfuegen(new Vokabel("Tür","door"));
        liste.hintenEinfuegen(new Vokabel("Tisch","table"));
        liste.hintenEinfuegen(new Vokabel("Stuhl","chair"));
        liste.hintenEinfuegen(new Vokabel("Lampe","lamp"));
        liste.hintenEinfuegen(new Vokabel("Fenster","window"));
    }

    public void wortLaden(){
        aktuelleVokabel = liste.vorneEntnehmen();
    }

    public String englischGeben()    {
        return aktuelleVokabel.getEnglisch();
    }

    public String deutschGeben()    {
        return aktuelleVokabel.getDeutsch();
    }

    public int anzahlGeben() {
        return liste.anzahlGeben();
    }

    public boolean pruefen(String eingabe){
        if (aktuelleVokabel.getEnglisch().equals(eingabe))  {
            return true;
        }
        else{
            liste.hintenEinfuegen(aktuelleVokabel);
            return false;
        }
    }

}
