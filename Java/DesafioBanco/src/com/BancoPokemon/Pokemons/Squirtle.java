package com.BancoPokemon.Pokemons;

public class Squirtle extends Pokemon {
    //Constructor para ter o nome padrão
    Squirtle(){
        this.name = "Squirtle";
    }
    //Constructor caso queira definir o nome
    Squirtle(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + " used water gun!");        
    }

}
