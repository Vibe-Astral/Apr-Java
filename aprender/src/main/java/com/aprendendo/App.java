package com.aprendendo;

public class App {
    public static void main(String[] args) {
        System.out.println("---aritimética---");
        Calcular.soma(12.0, 10.0);
        Calcular.subtracao(21.0, 8.0);
        Calcular.divisao(10.0, 5.0);
        Calcular.multiplicacao(3.0, 3.0);
        System.out.println("\n---Caneta---");
        Caneta azul = new Caneta("bic", "azul", 0.5, true);
        System.out.println(azul);
        azul.destampar();
        azul.desenhar();
        System.out.println("\nManipulando datas e tempo");
        ManipulandoDate.manupulando();

    }

}
