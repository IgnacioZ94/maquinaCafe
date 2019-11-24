
package maquinadecafe;

public class CafeRistretto extends Cafe
{
    public CafeRistretto(int azucar, int leche) 
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
        return "Cafe Ristretto";
    }

    @Override
    public double precio() 
    {
        return 110.00;
    }
}
