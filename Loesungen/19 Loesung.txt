public class Gehege2d {
    Tier[][] array;
    int zeilen;
    int spalten;

    public Gehege2d(int zeilen, int spalten) {
        this.array = new Tier[zeilen][spalten];
        this.zeilen = zeilen;
        this.spalten = spalten;
    }

    public void tierEinsperren(Tier tier){
        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                if (array[i][j] == null){
                    array[i][j] = tier;
                    System.out.println("Das Tier wurde auf Position " + i + "/" + j + " eingesperrt");
                    return;
                }
            }
        }
        System.out.println("Das Gehege ist bereits voll und das Tier konnte nicht eingesperrt werden!");
    }

    public void tierEinsperren(Tier tier, int zeile, int spalte){

        if (zeile > zeilen-1 || spalte > spalten-1){
            System.out.println("Die gewählte Position im Gehege ist zu gross!");
            return;
        }
        if (array[zeile][spalte] != null){
            System.out.println("Die gewählte Position ist bereits besetzt!");
            return;
        }
        array[zeile][spalte] = tier;
        System.out.println("Das Tier wurde auf Position " + zeile + "/" + spalte + " eingesperrt");
    }

    public void inhaltAusgeben(){
        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                if (array[i][j] != null){
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    public Tier aufPositionSchauen(int zeile, int spalte){
        if (zeile > zeilen-1 || spalte > spalten-1){
            System.out.println("Die gewählte Position im Gehege ist zu gross!");
            return null;
        }
        if (array[zeile][spalte] == null){
            System.out.println("Die gewählte Position ist leer!");
            return null;
        }
        System.out.println(array[zeile][spalte]);
        return array[zeile][spalte];
    }

    public Tier tierBefreien(int zeile, int spalte){
        Tier befreitesTier = aufPositionSchauen(zeile, spalte);
        array[zeile][spalte] = null;
        System.out.println("Das folgende Tier wurde befreit: " + befreitesTier);
        return befreitesTier;
    }
}
