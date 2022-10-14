public class Tiger extends Tier{

    private int anzahlStreifen;

    public Tiger(String name, int alter, String geschlecht, double gewicht, int anzahlBeine, int anzahlJungtiere, double gesundheitswert, int anzahlStreifen) {
        super(name, alter, geschlecht, gewicht, anzahlBeine, anzahlJungtiere, gesundheitswert);
        this.anzahlStreifen = anzahlStreifen;
    }

    public void fauchen(){
        System.out.println("Faaaauuuuuuch!");
        gesundheitswert = gesundheitswert + 1;
        System.out.println("Das tut gut! Mein neuer Gesundheitswert liegt bei: " + gesundheitswert);
    }

    @Override
    public void sichVorstellen(){
        System.out.println("Ich bin ein Tiger und heisse " + name + ".");
    }

    public int getAnzahlStreifen() {
        return anzahlStreifen;
    }

    public void setAnzahlStreifen(int anzahlStreifen) {
        this.anzahlStreifen = anzahlStreifen;
    }

}
