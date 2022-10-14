public class Tier {

    protected String name;
    private int alter;
    private String geschlecht;
    private double gewicht;
    private int anzahlBeine;
    private int anzahlJungtiere;

    protected double gesundheitswert;

    public Tier(String name, int alter, String geschlecht, double gewicht, int anzahlBeine, int anzahlJungtiere, double gesundheitswert) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.gewicht = gewicht;
        this.anzahlBeine = anzahlBeine;
        this.anzahlJungtiere = anzahlJungtiere;
        this.gesundheitswert = gesundheitswert;
    }

    public void fressen(double anzahlKilo){
        gewicht = gewicht + anzahlKilo;
        System.out.println("Ich habe " + anzahlKilo + " kg gefressen.");
        System.out.println("Ich wiege nun " + gewicht + " kg.");
        gesundheitswert = gesundheitswert + anzahlKilo * 2;
        if (gesundheitswert > 100){
            gesundheitswert = 100;
        }
        System.out.println("Ich habe einen Gesundheitswert von " + gesundheitswert + ".");
    }

    public void trinken(double anzahlLiter){
        gewicht = gewicht + anzahlLiter;
        System.out.println("Ich habe " + anzahlLiter + " l getrunken.");
        System.out.println("Ich wiege nun " + gewicht + " kg.");
        gesundheitswert = gesundheitswert + anzahlLiter;
        if (gesundheitswert > 100){
            gesundheitswert = 100;
        }
        System.out.println("Ich habe einen Gesundheitswert von " + gesundheitswert + ".");
    }

    public void kacken(double anzahlKilo){
        gewicht = gewicht - anzahlKilo;
        System.out.println("Ich habe " + anzahlKilo + " kg gekackt.");
        System.out.println("Ich wiege nun " + gewicht + " kg.");
    }

    public void pinkeln(double anzahlLiter){
        gewicht = gewicht - anzahlLiter;
        System.out.println("Ich habe " + anzahlLiter + " l gepinkelt.");
        System.out.println("Ich wiege nun " + gewicht + " kg.");
    }

    public void schlafen(double anzahlStunden){
        gesundheitswert = gesundheitswert + anzahlStunden;
        if (gesundheitswert > 100){
            gesundheitswert = 100;
        }
        System.out.println("Ich habe nun " + anzahlStunden + " h geschlafen.");
        System.out.println("Ich habe einen Gesundheitswert von " + gesundheitswert + ".");
    }

    public void sichVorstellen(){
        System.out.println("Ich bin ein Zootier und heisse " + name + ".");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public int getAnzahlJungtiere() {
        return anzahlJungtiere;
    }

    public void setAnzahlJungtiere(int anzahlJungtiere) {
        this.anzahlJungtiere = anzahlJungtiere;
    }

    public double getGesundheitswert() {
        return gesundheitswert;
    }

    public void setGesundheitswert(double gesundheitswert) {
        this.gesundheitswert = gesundheitswert;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " namens " + name + " im Alter von " + alter + " Jahren.";
    }
}
