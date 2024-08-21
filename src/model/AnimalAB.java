package model;

public abstract class AnimalAB implements AnimalIF {
    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private double peso;

    private int quantidadeComidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipoAnimal() { return tipoAnimal; }
    public void setTipoAnimal(String tipoAnimal) { this.tipoAnimal = tipoAnimal; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getQuantidadeComidaIngerida() { return quantidadeComidaIngerida; }
    public int getCaminhoPercorrido() { return caminhoPercorrido; }
    public int getHorasDormidas() { return horasDormidas; }

    @Override
    public void comer(int quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
    }

    public abstract void fazerSom();
}

