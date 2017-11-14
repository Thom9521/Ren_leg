package thom9521.Hundehjemmet;

public class Hundehjemmet_main {
    public static void main(String[] args) {

        Hund hund1;
        hund1 = new Hund ("Laban");
        hund1.setAlderDreng(1);
        hund1.setRace("Yorkshire Terrier");
        hund1.hop();

        System.out.println(" ");

        Hund hund2;
        hund2 = new Hund ("Mille");
        hund2.setAlderPige(12);
        hund2.setRace("West Highland White Terrier");
        hund2.spis();

        System.out.println(" ");

        Hund hund3;
        hund3 = new Hund("Daisy");
        hund3.setAlderPige(4);
        hund3.setRace("Labrador");
        hund3.leg();
    }
}
