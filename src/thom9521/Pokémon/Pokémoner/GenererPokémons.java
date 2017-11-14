package thom9521.Pokémon.Pokémoner;

import thom9521.Pokémon.Pokémons;

public class GenererPokémons extends Pokémons {


    public GenererPokémons(String navn, int id, int styrke, String beskrivelse){
            super(navn, id, styrke, beskrivelse); }

            public GenererPokémons(){
        super("Pickachu", 1, 67, "Angriber med lynkilder");
    }


            @Override
            public String toString() {
                return "Pokémon " + getId() +" er dukket op med navnet " + getNavn() + " og har beskrivelsen: " + getBeskrivelse() +
                        ". " + getNavn() + " har en styrke på " + getStyrke() + ".";
            }
        }
