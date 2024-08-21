package model.terrestre;

import model.AnimalTerrestre;

public class Cachorro extends AnimalTerrestre {
    public Cachorro(String nome, int idade, String habitat, double peso) {
        super(nome, idade, habitat, peso, 4);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo.");
    }
}

