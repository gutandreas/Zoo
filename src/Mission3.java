public class Mission3 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        String[] namen = {"Karl", "Kyrill", "Kunigunde"};
        int[] alter = {15, 20, 30};
        String[] geschlecht = {"männlich", "männlich", "weiblich"};
        double[] gewicht = {200, 400, 300};
        int[] anzahlBeine = {4, 4, 4};
        int[] anzahlJungtiere = {2, 1, 4};
        double[] gesundheitswert = {60, 80, 40};
        double[] anzahlLiterWasserImKoerper = {25, 60, 20};

        Gehege2d kamelgehege1 = new Gehege2d(1, 3);
        Gehege2d kamelgehege2 = new Gehege2d(3, 1);



        Besucher besucher1 = new Besucher("Bernd", 47);
        Besucher besucher2 = new Besucher("Berta", 60);

        //TODO: Aufgabe 1) Zu Beginn der Klasse stehen verschiedene Arrays mit Angaben bereit.
        // Erstelle damit in einem Loop 3 Kamele und sperre sie ins kamelgehege1.
        for (int i = 0; i < 3; i++){
            Kamel kamel = new Kamel(namen[i], alter[i], geschlecht[i], gewicht[i], anzahlBeine[i],
                    anzahlJungtiere[i], gesundheitswert[i], anzahlLiterWasserImKoerper[i]);
            kamelgehege1.tierEinsperren(kamel);
        }


        // TODO: Aufgabe 2) Erstelle den Tiger tiger mit Gewicht 50, Gesundheitswert 23 und 60 Streifen (restliche Angaben deiner Wahl).
        //  Lasse ihn fauchen, bis er mindestens einen Gesundheitswert von 80 erreicht.
        //  Lasse ihn Happen von 3kg essen, bis er mindestens 70kg erreicht hat.
        Tiger tiger = new Tiger("Theo", 10, "männlich", 50, 4, 0, 23, 60);
        while (tiger.getGesundheitswert() < 80){
            tiger.fauchen();
        }
        while (tiger.getGewicht() < 70){
            tiger.fressen(3);
        }




        //TODO: Aufgabe 3) Lasse die beiden Besucher den Tiger so oft bestaunen, bis beide einen Stimmungswert von 100 haben
        while (besucher1.getStimmungswert() < 100 || besucher2.getStimmungswert() < 100){
            besucher1.tierBestaunen(tiger);
            besucher2.tierBestaunen(tiger);
        }


        //TODO: Aufgabe 4) Verdopple die Anzahl Streifen des Tigers 3 mal
        for (int i = 0; i  < 3; i++){
            tiger.setAnzahlStreifen(tiger.getAnzahlStreifen()*2);
        }


        //TODO: Aufgabe 5) Siedle alle Kamele von kamelgehege1 ins kamelgehege2 um
        for (int i = 0; i < 3; i++){
            Tier zuVersetzendesTier = kamelgehege1.aufPositionSchauen(0, i);
            kamelgehege2.tierEinsperren(zuVersetzendesTier);
        }





        // Korrektur Aufgabe 1
        if (kamelgehege1.aufPositionSchauen(0, 2) != null
                && kamelgehege1.aufPositionSchauen(0, 2).getName().equals("Kunigunde")){
            System.out.println(ANSI_GREEN + "Aufgabe 1 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 1 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 2
        if (tiger.getGesundheitswert() == 100 && tiger.getGewicht() == 71){
            System.out.println(ANSI_GREEN + "Aufgabe 2 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 2 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 3
        if (besucher1.getStimmungswert() == 100 && besucher2.getStimmungswert() == 100){
            System.out.println(ANSI_GREEN + "Aufgabe 3 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 3 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 4
        if (tiger.getAnzahlStreifen() == 480){
            System.out.println(ANSI_GREEN + "Aufgabe 4 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 4 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }

        // Korrektur Aufgabe 5
        if (kamelgehege2.aufPositionSchauen(2, 0) != null
                && kamelgehege2.aufPositionSchauen(2, 0).getName().equals("Kunigunde")){
            System.out.println(ANSI_GREEN + "Aufgabe 5 wurde korrekt gelöst!" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_RED + "Aufgabe 5 wurde noch nicht korrekt gelöst!" + ANSI_RESET);
        }


    }
}