package com.aprendendo;

public class Calcular {
  public static void soma(Double numero01, Double numero02){
    Double resultado = numero01 + numero02;
      System.out.println("a soma de "+ numero01+" "+numero02 + " e igual a "+ resultado);
  }
  public static void subtracao(Double numero01, Double numero02){
    Double resultado = numero01 - numero02;
    System.out.println("a subtração de "+ numero01+" "+numero02 + " e igual a "+ resultado);
  }
  public static void divisao(Double numero01, Double numero02){
    Double resultado = numero01 / numero02;
    System.out.println("a divisao de "+ numero01+" "+numero02 + " e igual a "+ resultado);
  }
  public static void multiplicacao(Double numero01, Double numero02){
    Double resultado = numero01 * numero02;
    System.out.println("a multiplicacao de "+ numero01+" "+numero02 + " e igual a "+ resultado);
  }
  
}
