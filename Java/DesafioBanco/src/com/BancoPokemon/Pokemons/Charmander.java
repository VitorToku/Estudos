package com.BancoPokemon.Pokemons;

public class Charmander extends Pokemon {
     //Constructor para ter o nome padrão
     Charmander(){
        this.name = "Charmander";
    }
    //Constructor caso queira definir o nome
    Charmander(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + " used ember!");        
    }

}
