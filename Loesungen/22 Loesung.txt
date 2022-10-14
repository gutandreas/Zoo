public class Mission2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Gehege2d kamelgehege = new Gehege2d(2, 4);
        Kamel kamel1 = new Kamel("Klara", 20, "weiblich", 150, 4, 3, 50, 60);
        Kamel kamel2 = new Kamel("Kleopatra", 10, "weiblich", 200, 4, 1, 80, 70);
        Kamel kamel3 = new Kamel("Klaus", 20, "männlich", 300, 4, 0, 50, 70);
        Kamel kamel4 = new Kamel("Konrad", 25, "männlich", 200, 4, 2, 60, 100);
        kamelgehege.tierEinsperren(kamel1);
        kamelgehege.tierEinsperren(kamel2);
        kamelgehege.tierEinsperren(kamel3);
        kamelgehege.tierEinsperren(kamel4);

        Gehege2d tigergehege = new Gehege2d(3, 2);
        Tiger tiger1 = new Tiger("Thorsten", 10, "männlich", 70, 4, 0, 70, 100);
        Tiger tiger2 = new Tiger("Tamara", 15, "weinlich", 80, 4, 2, 50, 60);
        Tiger tiger3 = new Tiger("Toni", 12, "männlich", 90, 4, 0, 60, 90);
        Tiger tiger4 = new Tiger("Tobi", 17, "männlich", 100, 4, 4, 80, 85);
        tigergehege.tierEinsperren(tiger1);
        tigergehege.tierEinsperren(tiger2);
        tigergehege.tierEinsperren(tiger3);
        tigergehege.tierEinsperren(tiger4);

        Besucher besucher1 = new Besucher("Bernd", 47);
        Besucher besucher2 = new Besucher("Berta", 60);

        //TODO: Aufgabe 1) Suche aus dem Kamelgehege automatisiert das älteste Tier und befreie es
        int zeile = 0;
        int spalte = 0;
        int maxAlter = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (kamelgehege.aufPositionSchauen(i, j) != null) {
                    if (kamelgehege.aufPositionSchauen(i, j).getAlter() > maxAlter) {
                        zeile = i;
                        spalte = j;
                    }
                }
            }
        }
        kamelgehege.tierBefreien(zeile, spalte);

        //TODO: Aufgabe 2) Lass besucher1 solange Tiger aus dem Tigergehege bestaunen, bis er besser gelaunt ist als besucher2
        while (besucher1.getStimmungswert() < besucher2.getStimmungswert()){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (tigergehege.aufPositionSchauen(i, j) != null) {
                        besucher1.tierBestaunen(tigergehege.aufPositionSchauen(i, j));
                    }
                }
            }
        }

        //TODO: Aufgabe 3) Das Kamel auf Position 0/1 soll mit dem Tiger auf Position 1/1 ausgetauscht werden
        Tier befreitesTier = kamelgehege.tierBefreien(0, 1);
        kamelgehege.tierEinsperren(tigergehege.tierBefreien(1, 1), 0, 1);
        tigergehege.tierEinsperren(befreitesTier, 1, 1);

        //TODO: Aufgabe 4) Lass das Kamel auf Position 0/0 solange 1.5 Liter pinkeln, bis sein Gewicht unter 100kg liegt
        while (kamelgehege.aufPositionSchauen(0,0).getGewicht() >= 100){
            kamelgehege.aufPositionSchauen(0,0).pinkeln(1.5);
        }

        //TODO: Aufgabe 5) Füttere den Tiger auf Position 1/1 mit der Hälfte des Körpergewichts von Kamel auf Position 0/0
        double menge = kamelgehege.aufPositionSchauen(0, 0).getGewicht() * 0.5;
        tigergehege.aufPositionSchauen(1, 1).fressen(menge);




        // Korrektur Aufgabe 1
        if (kamelgehege.aufPositionSchauen(0, 3) == null){
            System.out.println(ANSI_GREEN + "Aufgabe 1 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 1 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 2
        if (besucher1.getStimmungswert() == 67){
            System.out.println(ANSI_GREEN + "Aufgabe 2 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 2 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 3
        if (tigergehege.aufPositionSchauen(1, 1) instanceof Kamel
                && kamelgehege.aufPositionSchauen(0, 1) instanceof Tiger){
            System.out.println(ANSI_GREEN + "Aufgabe 3 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 3 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 4
        if (kamelgehege.aufPositionSchauen(0, 0).getGewicht() == 99.0
                && ((Kamel) kamelgehege.aufPositionSchauen(0,0)).getAnzahlLiterWasserImKoerper() == 9.0){
            System.out.println(ANSI_GREEN + "Aufgabe 4 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 4 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 5
        if (tigergehege.aufPositionSchauen(1, 1).getGewicht() == 249.5){
            System.out.println(ANSI_GREEN + "Aufgabe 5 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 5 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }




    }
}
