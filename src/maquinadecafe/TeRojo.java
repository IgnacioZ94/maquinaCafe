
package maquinadecafe;

public class TeRojo extends Te
{
    public TeRojo(int azucar, int leche) 
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
        return "Te Rojo";
    }

    @Override
    public double precio() 
    {
        return 70.00;
    }
}
