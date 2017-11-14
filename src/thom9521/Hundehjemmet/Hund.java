package thom9521.Hundehjemmet;

public class Hund {



    String navn = "";
    int alder = 0;
    String race = "";


    Hund (String hundensNavn){
        navn = hundensNavn;
        System.out.println("Hundens navn er " + navn);
    }

    public void setAlderDreng(int hundensAlderDreng){
        alder = hundensAlderDreng;
        System.out.println("Og han er " + hundensAlderDreng + " år gammel");
    }

    public void setAlderPige (int hundensAlderPige){
        alder = hundensAlderPige;
        System.out.println("Og hun er " + hundensAlderPige + " år gammel");
    }

    public void setRace (String hundensRace) {
        race = hundensRace;
        System.out.println(navn + " er en " + hundensRace);

    }
    public void hop(){
        System.out.println(navn + " hopper");
    }

    public void spis(){
        System.out.println(navn + " spiser hundemad");
    }

    public void leg() {
        System.out.println(navn + " leger med sit hundelegetøj");
    }

}


