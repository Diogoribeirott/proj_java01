package dominio;

public class Carro {
  private String brand;
  private Pessoa owner;
  private Factory factory;


  public Carro(String brand, Factory factory){
    this.brand = brand;
    this.factory = factory;

  }
  

    

   
    public String getBrand() {
        return brand;
    }

  
    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    public Pessoa getOwner() {
        return owner;
    }

   
    public void setOwner(Pessoa owner) {
        this.owner = owner;
    }

 
    public Factory getFactory() {
        return factory;
    }

   
    public void setFactory(Factory factory) {
        this.factory = factory;
    }

}