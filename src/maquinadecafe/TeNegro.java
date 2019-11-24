
package maquinadecafe;

public class TeNegro extends Te
{
    public TeNegro(int azucar, int leche) 
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
        return "Te Negro";
    }

    @Override
    public double precio() 
    {
        return 70.00;
    }
}
