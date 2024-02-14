package com.BancoPokemon.Pokemons;

import java.util.concurrent.ThreadLocalRandom;

public class Trainer {
    private String name;
    private Pokemon[] listaPokemons = {};

    public Trainer(String name){
        this.name = name;
       }


    public void capturarPokemon(){        
        Pokemon pokemonCapturado = gerarPokemon();

        System.out.println("O pokémon " + pokemonCapturado.name + " foi capturado!");
        
        adiconarNaLista(pokemonCapturado);
       
    }

    private Pokemon gerarPokemon(){
        int seletor = ThreadLocalRandom.current().nextInt(0,4);
        Pokemon pokemonCapturado = new Pokemon();

        switch (seletor) {
            case 0:
                pokemonCapturado = new Pikachu();
                break;
            case 1:
                pokemonCapturado = new Charmander();
                break;
            case 2:
                pokemonCapturado = new Squirtle();
                break;            
            case 3:
                pokemonCapturado = new Eevee();
                break;            
            case 4:
                pokemonCapturado = new Bulbassaur();
                break;                        
        }
        return pokemonCapturado;
    }

    private void adiconarNaLista(Pokemon pokemonCapturado){
        Pokemon[] novaLista = new Pokemon[listaPokemons.length + 1];

        for (int i = 0; i < listaPokemons.length ; i++) {
            novaLista[i] = listaPokemons[i];
        }

        novaLista[novaLista.length -1] = pokemonCapturado;

        this.listaPokemons = new Pokemon[novaLista.length];

        for (int i = 0; i < listaPokemons.length ; i++) {
            this.listaPokemons[i] = novaLista[i];
        }
    }

    public void mostrarLista(){
        System.out.println("--------------");
        System.out.println("Treinador: " + this.name);
        for (Pokemon pokemon : listaPokemons) {
            System.out.println(pokemon.name);
        }
        System.out.println("--------------");
    }

    public void trocarPokemon(Trainer outroTreinador, Pokemon meuPokemon, Pokemon pokemonDele){
        Pokemon[] listDele = outroTreinador.getListaPokemons();
        Pokemon[] minhaLista = this.listaPokemons;

        //TODO: finalizar lógica de troca de pokemons
        
    }

    private int acharIndexNaLista(Pokemon[] lista, Pokemon procurado){
        for(int i = 0; i< lista.length; i++){
            if (lista[i] == procurado){
                return i;
            }
        }
        return -1;
    }

    public Pokemon[] getListaPokemons() {
        return listaPokemons;
    }
}
