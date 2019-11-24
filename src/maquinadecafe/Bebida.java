
package maquinadecafe;

public abstract class  Bebida 
{
    private int leche;
    private int azucar;
    
   public Bebida(int azucar, int leche)
    {
        this.azucar = azucar;
        this.leche = leche;
    
    } 
   
    
    
    public abstract String tipo();
    public abstract String descripcion();
    public abstract double precio();
    
  
            
            
}            
            