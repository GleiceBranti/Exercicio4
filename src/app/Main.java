package app;

import model.terrestre.Cachorro;
import model.terrestre.Gato;
import model.terrestre.Elefante;
import model.terrestre.Leao;
import model.marinho.Peixe;
import model.voador.Pomba;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Mel", 12, "Casa", 30.0);
        Gato gato = new Gato("Shamira", 3, "Casa", 5.0);
        Elefante elefante = new Elefante("Rodolfinho", 10, "Savana", 5000.0);
        Leao leao = new Leao("Bravo", 7, "Savana", 200.0);

        Peixe peixe = new Peixe("Forest", 2, "Mar", 1.0);
        Pomba pomba = new Pomba("Piolho", 4, "Cidade", 0.5, 0.8);

        cachorro.comer(500);
        cachorro.moverse(1000);
        cachorro.dormir(8);
        cachorro.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + cachorro.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrid0: " + cachorro.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + cachorro.getHorasDormidas());

        gato.comer(200);
        gato.moverse(500);
        gato.dormir(12);
        gato.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + gato.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + gato.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + gato.getHorasDormidas());

        elefante.comer(2000);
        elefante.moverse(3000);
        elefante.dormir(6);
        elefante.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + elefante.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + elefante.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + elefante.getHorasDormidas());

        leao.comer(1500);
        leao.moverse(2000);
        leao.dormir(10);
        leao.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + leao.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + leao.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + leao.getHorasDormidas());

        peixe.nadar();
        peixe.comer(50);
        peixe.moverse(0); // Peixes nadam
        peixe.dormir(4);
        peixe.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + peixe.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + peixe.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + peixe.getHorasDormidas());

        pomba.voar();
        pomba.comer(20);
        pomba.moverse(500);
        pomba.dormir(6);
        pomba.fazerSom();
        System.out.println("Quantidade de comida ingerida: " + pomba.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + pomba.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + pomba.getHorasDormidas());
    }
}
