package model.voador;

import model.AnimalVoador;

public class Pomba extends AnimalVoador {
    public Pomba(String nome, int idade, String habitat, double peso, double envergaduraAsa) {
        super(nome, idade, habitat, peso, 2, envergaduraAsa);
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está fazendo .");
    }
}
