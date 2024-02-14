package com.BancoPokemon;

import com.BancoPokemon.Pokemons.Trainer;

abstract public class Banco {
    public static void main(String[] args) throws Exception {
        Trainer ash = new Trainer("Ash");
        Trainer misty = new Trainer("Misty");
        ash.capturarPokemon();
        ash.capturarPokemon();
        ash.capturarPokemon();
        ash.mostrarLista();

        misty.capturarPokemon();
        misty.capturarPokemon();
        misty.mostrarLista();
        
    }
}
