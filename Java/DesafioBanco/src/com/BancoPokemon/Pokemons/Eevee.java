package com.BancoPokemon.Pokemons;

public class Eevee extends Pokemon {
    //Constructor para ter o nome padrão
    Eevee(){
        this.name = "Eevee";
    }
    //Constructor caso queira definir o nome
    Eevee(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + " used tackle!");        
    }

}
