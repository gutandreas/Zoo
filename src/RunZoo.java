public class RunZoo{
    public static void main(String[] args) {
        Kamel kamel = new Kamel("Klara", 10, "weiblich", 500, 4,5, 50, 200);
        Besucher besucher = new Besucher("Klaus", 50);
        besucher.tierBestaunen(kamel);
    }
}
