public class Mission1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Gehege2d kamelgehege = new Gehege2d(2,4);
        Kamel kamel1 = new Kamel("Klara", 20, "weiblich", 150, 4, 3, 50, 50);
        Kamel kamel2 = new Kamel("Kleopatra", 10, "weiblich", 200, 4, 1, 80, 70);
        Kamel kamel3 = new Kamel("Klaus", 20, "männlich", 300, 4, 0, 50, 70);
        Kamel kamel4 = new Kamel("Konrad", 25, "männlich", 200, 4, 2, 60, 100);
        kamelgehege.tierEinsperren(kamel1);
        kamelgehege.tierEinsperren(kamel2);
        kamelgehege.tierEinsperren(kamel3);
        kamelgehege.tierEinsperren(kamel4);

        //TODO: Aufgabe 1) Füge ein neues Kamel mit folgenden Angaben zum Kamelgehege hinzu: "Köbi", 35, "männlich", 350, 4, 0, 30, 120
        Kamel kamel5 = new Kamel("Köbi", 35, "männlich", 350, 4, 0, 30, 120);
        kamelgehege.tierEinsperren(kamel5);

        //TODO: Aufgabe 2) Lass das Kamel auf Gehegeposition 0/3 50 Liter Wasser trinken
        kamelgehege.aufPositionSchauen(0, 3).trinken(50);

        //TODO: Aufgabe 3) Tausche die Plätze der Kamele auf den Positionen 0/0 und 0/1
        Tier befreitesTier = kamelgehege.tierBefreien(0,0);
        kamelgehege.tierEinsperren(kamelgehege.tierBefreien(0,1), 0,0);
        kamelgehege.tierEinsperren(befreitesTier, 0, 1);

        //TODO: Aufgabe 4) Werte automatisch aus, wie alt alle Kamele im Gehege zusammen sind (filtere leere Plätze aus) und speichere die Summe in der Variable resultat
        int alterssumme = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                if (kamelgehege.aufPositionSchauen(i, j) != null){
                    alterssumme = alterssumme + kamelgehege.aufPositionSchauen(i, j).getAlter();
                }
            }
        }
        int resultat = alterssumme;

        //TODO: Aufgabe 5) Fütterungszeit! Füttere alle Tiere automatisiert mit 5% ihres Köpergewichts.
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                if (kamelgehege.aufPositionSchauen(i, j) != null){
                    double menge = kamelgehege.aufPositionSchauen(i, j).getGewicht() * 0.05;
                    kamelgehege.aufPositionSchauen(i, j).fressen(menge);
                }
            }
        }




        //Korrektur Aufgabe 1
        Tier tierAufgabe1 = kamelgehege.aufPositionSchauen(1, 0);
        if (tierAufgabe1 != null
                && tierAufgabe1 instanceof Kamel
                && tierAufgabe1.getName().equals("Köbi")
                && tierAufgabe1.getAlter() == 35
                && tierAufgabe1.getGeschlecht().equals("männlich")
                && tierAufgabe1.getAnzahlBeine() == 4
                && tierAufgabe1.getAnzahlJungtiere() == 0
                && ((Kamel) tierAufgabe1).getAnzahlLiterWasserImKoerper() == 120){
            System.out.println(ANSI_GREEN + "Aufgabe 1 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 1 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 2
        Tier tierAufgabe2 = kamelgehege.aufPositionSchauen(0, 3);
        if (tierAufgabe2 != null
                && tierAufgabe2 instanceof Kamel
                && ((Kamel) tierAufgabe2).getAnzahlLiterWasserImKoerper() == 150){
            System.out.println(ANSI_GREEN + "Aufgabe 2 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 2 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 3
        Tier tierAufgabe3a = kamelgehege.aufPositionSchauen(0, 0);
        Tier tierAufgabe3b = kamelgehege.aufPositionSchauen(0, 1);
        if (tierAufgabe3a != null && tierAufgabe3b != null
                && tierAufgabe3a instanceof Kamel && tierAufgabe3b instanceof Kamel
                && tierAufgabe3a.getName().equals("Kleopatra")
                && tierAufgabe3b.getName().equals("Klara")){
            System.out.println(ANSI_GREEN + "Aufgabe 3 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 3 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 4
        if (resultat == 110){
            System.out.println(ANSI_GREEN + "Aufgabe 4 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 4 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 5
        double totalGewicht = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                if (kamelgehege.aufPositionSchauen(i, j) != null){
                    totalGewicht += kamelgehege.aufPositionSchauen(i, j).getGewicht();
                }
            }
        }
        if (totalGewicht == 1312.5){
            System.out.println(ANSI_GREEN + "Aufgabe 5 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 5 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

    }

}
