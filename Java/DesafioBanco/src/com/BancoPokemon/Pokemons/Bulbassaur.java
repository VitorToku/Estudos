package com.BancoPokemon.Pokemons;

public class Bulbassaur extends Pokemon{
     //Constructor para ter o nome padrão
    Bulbassaur(){
        this.name = "Bulbassaur";
    }
    //Constructor caso queira definir o nome
    Bulbassaur(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + " used razor leaf!");        
    }
}
