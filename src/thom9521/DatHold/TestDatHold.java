package thom9521.DatHold;

public class TestDatHold {
    public static void main(String[] args) {


        DatHold elev1 = new DatHold("Elev1", 21, 164);
        elev1.lavLektier();

        System.out.println();

        DatHold elev2 = new DatHold();
        elev2.setNavn("Elev2");
        System.out.println("Elevens navn er " + elev2.getNavn());

        DatHold elev3 = new DatHold("Elev3",27);
        elev3.setIq(200);
        System.out.println(elev3.getNavn() + " har en IQ på " + elev3.getIq());

    }
}
