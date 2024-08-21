package model.marinho;

import model.AnimalMarinho;

public class Peixe extends AnimalMarinho {
    public Peixe(String nome, int idade, String habitat, double peso) {
        super(nome, idade, habitat, peso);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz bolhas.");
    }
}
