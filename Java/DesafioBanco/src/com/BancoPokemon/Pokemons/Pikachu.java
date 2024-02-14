package com.BancoPokemon.Pokemons;

public class Pikachu extends Pokemon {
    
    //Constructor para ter o nome padrão
    Pikachu(){
        this.name = "Pikachu";
    }
    //Constructor caso queira definir o nome
    Pikachu(String name){
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + " used thundershock!");        
    }

}
