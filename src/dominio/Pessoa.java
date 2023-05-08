package dominio;



public class Pessoa {
  private String name;
  private Carro [] carros;


  public Pessoa(String name){
    this.name = name;
  }

  
    
    public void Show(){
      System.out.println("Nome: "+this.name);
      if(carros != null ){
      System.out.println("Carros: ");
      for (Carro carro : carros) {
        System.out.println(carro.getBrand());
        
      }
    }
    }
   
    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }


   
    public Carro [] getCarros() {
        return carros;
    }

   
    public void setCarros(Carro [] carros) {
        this.carros = carros;
    }

}