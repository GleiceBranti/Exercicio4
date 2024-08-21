package model.terrestre;

import model.AnimalTerrestre;

public class Gato extends AnimalTerrestre {
    public Gato(String nome, int idade, String habitat, double peso) {
        super(nome, idade, habitat, peso, 4);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está miando.");
    }
}
