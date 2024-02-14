package com.BancoPokemon.Pokemons;

class Pokemon {
    protected String name;
    protected String trainerName;

    void attack(){      
    };
    void sound(){
        System.out.println(this.name + "!");
    };

    void setTrainer(String trainerName){
        this.trainerName = trainerName;
    }
} 
    