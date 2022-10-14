public class Gehege {
    Tier[] array;

    public Gehege(int groesse) {
        this.array = new Tier[groesse];
    }

    public void tierEinsperren(Tier tier){
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = tier;
                System.out.println("Das Tier wurde im Gehege auf Position " + i + " eingesperrt.");
                break;
            }
            if (i == array.length-1){
                System.out.println("Das Gehege ist bereits voll und das Tier konnte nicht eingesperrt werden!");
            }
        }
    }

    public void tierEinsperren(Tier tier, int position){
        if (position > array.length-1){
            System.out.println("Die gewählte Position im Gehege ist zu gross!");
            return;
        }
        if (array[position] != null){
            System.out.println("Die gewählte Position ist bereits besetzt!");
            return;
        }
        array[position] = tier;
        System.out.println("Das Tier wurde auf Position " + position + " eingesperrt.");
    }

    public void inhaltAusgeben(){
        System.out.println("Im Gehege befinden sich folgende Tiere:");
        for (int i = 0; i < array.length; i++){
            if (array[i] != null){
                System.out.println(array[i]);
            }
        }
    }

    public Tier aufPositionSchauen(int position){
        if (position > array.length-1){
            System.out.println("Die gewählte Position im Gehege ist zu gross!");
            return null;
        }
        if (array[position] == null){
            System.out.println("Die gewählte Position ist leer!");
            return null;
        }
        System.out.println(array[position]);
        return array[position];
    }

    public Tier tierBefreien(int position){
        Tier befreitesTier = aufPositionSchauen(position);
        array[position] = null;
        System.out.println("Das folgende Tier wurde befreit: " + befreitesTier);
        return befreitesTier;
    }
}
