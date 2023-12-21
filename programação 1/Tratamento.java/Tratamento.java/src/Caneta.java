public class Caneta {
   public String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;


public Caneta(String modelo, float ponta, String cor, boolean tampada){
    this.modelo = modelo;
    this.cor = cor;
    this.setPonta(ponta);
    this.tampar();
    this.cor = cor;
}
public String getModelo() {
    return this.modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public float getPonta() {
    return this.ponta;
}

public void setPonta(float ponta) {
    this.ponta = ponta;
} 

public void tampar(){
    this.tampada = true;
}

public void destampar(){
    this.tampada = false;
}

public void status(){
    System.out.println("Sobre a Caneta: ");
    System.out.println("Modelo: "+ this.getModelo());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tampada: " + this.tampada);
}
   
   
}
