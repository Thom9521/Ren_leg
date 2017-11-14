package thom9521.DatHold;

public class DatHold {

    //Datafields
    private String navn = "";
    private int alder = 0;
    private int iq = 0;

    public DatHold(){ //No arg constructor
        System.out.println("En studerende er blevet tilføjet til klassen.");
    }

    public DatHold(String navn){
        this.navn = navn;
    }

    public DatHold(String elevensNavn,int elevensAlder){
        navn = elevensNavn;
        alder =  elevensAlder;
        System.out.println(navn + " er blevet tilføjet til datamatikerholdet, og han er " + alder + " år gammel.");
    }

    public DatHold(String elevensNavn, int elevensAlder, int elevensIQ){
        navn = elevensNavn;
        alder = elevensAlder;
        iq = elevensIQ;
        System.out.println(navn + " med en alder på " + alder + " er blevet tilføjet til klassen og han har en IQ " +
                "på " + iq + ".");
    }
    //Getters and setter
    public String getNavn(){ return navn; }

    public void setNavn(String navn){ this.navn = navn; }

    public int getAlder(){ return alder; }

    public void setAlder(int alder){ this.alder = alder; }

    public int getIq(){ return iq; }

    public void setIq(int iq){ this.iq = iq; }


    //Flere metoder
    public void lavLektier(){
        System.out.println(navn + " laver sine lektier til tiden.");
    }




}
