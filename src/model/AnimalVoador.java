package model;

public abstract class AnimalVoador extends AnimalAB {
    private int quantidadeAsas;
    private double envergaduraAsa;

    public AnimalVoador(String nome, int idade, String habitat, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, "Voador", idade, habitat, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public int getQuantidadeAsas() { return quantidadeAsas; }
    public void setQuantidadeAsas(int quantidadeAsas) { this.quantidadeAsas = quantidadeAsas; }

    public double getEnvergaduraAsa() { return envergaduraAsa; }
    public void setEnvergaduraAsa(double envergaduraAsa) { this.envergaduraAsa = envergaduraAsa; }

    public abstract void voar();
}
