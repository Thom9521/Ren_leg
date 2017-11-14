package thom9521.Pokémon;

public class Pokémons {

    //Datafields
    private String navn;
    private int id;
    private int styrke;
    private String beskrivelse;

    //No-arg constructor
    public Pokémons(){}

    //Constructor with all the datafields
    public Pokémons(String navn, int id, int styrke, String beskrivelse){
        this.navn = navn;
        this.id = id;
        this.styrke = styrke;
        this.beskrivelse = beskrivelse;
    }

    //Getters and setters

    public String getNavn() { return navn; }

    public void setNavn(String navn) { this.navn = navn; }

    public int getId() {return id; }

    public void setId(int id){this.id = id; }

    public int getStyrke(){return styrke;}

    public void setStyrke(int styrke){this.styrke = styrke;}

    public String getBeskrivelse() { return beskrivelse; }

    public void setBeskrivelse(String beskrivelse) { this.beskrivelse = beskrivelse; }


}
