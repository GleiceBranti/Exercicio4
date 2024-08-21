package model;

public abstract class AnimalMarinho extends AnimalAB {
    public AnimalMarinho(String nome, int idade, String habitat, double peso) {
        super(nome, "Marinho", idade, habitat, peso);
    }

    public abstract void nadar();
}
