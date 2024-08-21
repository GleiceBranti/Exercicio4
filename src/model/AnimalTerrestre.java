package model;

public abstract class AnimalTerrestre extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestre(String nome, int idade, String habitat, double peso, int quantidadePatas) {
        super(nome, "Terrestre", idade, habitat, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() { return quantidadePatas; }
    public void setQuantidadePatas(int quantidadePatas) { this.quantidadePatas = quantidadePatas; }
}
