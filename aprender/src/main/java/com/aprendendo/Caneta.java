package com.aprendendo;

public class Caneta {
  public String marca = "generica";
  public String cor = "Azul";
  public double ponta = 1.0;
  public boolean tampada = true;

  public Caneta(String marca, String cor, double ponta, boolean tampada) {
    marca = this.marca;
    cor = this.cor;
    ponta = this.ponta;
    tampada = this.tampada;
  }

  public String destampar() {
    String menssagem;
    if(tampada == true){
      tampada = false;
      menssagem = "Destampada com sucesso";
    }else{
      menssagem = "ja esta destampada";
    }
    return menssagem;
  }

  public void tampar(){
      if(tampada == false){
        tampada = true;
      }else{
        tampada = false;
      }
  }

  public void desenhar() {
    if (tampada == true) {
      System.out.println("A tampa esta fechada retire para desenhar");
    } else {
      System.out.println("desenhando");
    }
  }

}