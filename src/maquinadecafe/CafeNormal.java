
package maquinadecafe;

public class CafeNormal extends Cafe
{
    public CafeNormal(int azucar, int leche) 
    {
        super(azucar, leche);
    }
    @Override
    public String tipo() 
    {
        return "Cafe";
    }

    @Override
    public String descripcion() 
    {
        return "Cafe Normal";
    }

    @Override
    public double precio() 
    {
        return 90.00;
    }
}
