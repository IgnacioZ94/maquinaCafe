
package maquinadecafe;

public class TeVerde extends Te
{
    public TeVerde(int azucar, int leche) 
    {
        super(azucar, leche);
    }
 
    @Override
    public String tipo() 
    {
        return "Te";
    }

    @Override
    public String descripcion() 
    {
        return "Te verde";
    }

    @Override
    public double precio() 
    {
        return 75.00;
    }
}
