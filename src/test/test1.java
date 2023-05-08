package test;

import dominio.Carro;
import dominio.Factory;
import dominio.Pessoa;

public class test1 {
  public static void main(String[] args) {
    Factory factory1 = new Factory("S5");
    Factory factory2 = new Factory("W3");
    Carro carro1 = new Carro("POLO", factory1);
    Carro carro2 = new Carro("VW", factory1);
    Carro [] carros_Pessoa1= {carro1,carro2};

    Pessoa pessoa1 = new Pessoa("Diogo");
    pessoa1.setCarros(carros_Pessoa1);
    pessoa1.Show();


  }
    
}