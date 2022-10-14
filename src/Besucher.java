public class Besucher {

    private String name;
    private int stimmungswert;

    public Besucher(String name, int stimmungswert) {
        this.name = name;
        this.stimmungswert = stimmungswert;
    }

    @Override
    public String toString(){
        return "Besucher namens " + name + " mit Stimmungswert " + stimmungswert;
    }

    public void tierBestaunen(Tier tier){
        System.out.println("Ich betrachte gerade: " + tier);
        stimmungswert = stimmungswert + 5;
        if (stimmungswert > 100){
            stimmungswert = 100;
        }
        System.out.println("Mein Stimmungswert beträgt " + stimmungswert);
    }

    public String getName() {
        return name;
    }

    public int getStimmungswert() {
        return stimmungswert;
    }
}
