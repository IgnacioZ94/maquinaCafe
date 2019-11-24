
package maquinadecafe;

public class CafeExpresso extends Cafe
{
    public CafeExpresso(int azucar, int leche) 
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
        return "Cafe Expresso";
    }

    @Override
    public double precio() 
    {
        return 100.00;
    }
}
