
package maquinadecafe;
import java.util.Scanner;

public class MaquinaDeCafe 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        
        
        int bebida;
        int tipoCafe;
        int tipoTe;
        int azucar = 0;
        int leche = 0;
        int totalAzucar = 0;
        int totalLeche = 0;
        double precioTotal = 0;
        double precio = 0;
        String pedidoTotal = "";
        
        System.out.println("Bienvenido a la maquina de Cafe/Te");
        System.out.println("Cuantas bebidas va a llevar?");
        
        Bebida pedido [] = new Bebida [scan.nextInt()];
        
        for(int i = 0; i < pedido.length; i++)
        {
            System.out.println("Que bebida desea? \n1.Cafe \n2.Te");
            bebida = scan.nextInt();
            if (bebida == 1)
            {
                System.out.println("Seleccione el tipo de cafe..\n1.Expresso\n2.Ristretto\n3.Normal");
                tipoCafe = scan.nextInt();
                System.out.println("Indique cantidad de azucar.. 0 a 3");
                azucar = scan.nextInt();
                System.out.println("Indique cantidad de leche.. 0 a 3");
                leche = scan.nextInt();
                if(tipoCafe == 1)
                {
                    pedido [i] = new CafeExpresso(azucar, leche);
                    
                }
                else if(tipoCafe == 2)
                {
                    pedido [i] = new CafeRistretto(azucar, leche);
                    
                }
                else if (tipoCafe == 3)
                {
                    pedido [i] = new CafeNormal(azucar, leche);
                    
                }
                else 
                {
                    System.out.println("Opcion no valida");
                }
            }
            else if (bebida == 2)
            {
                System.out.println("Seleccione el tipo de te..\n1.Verde\n2.Rojo\n3.Negro");
                tipoTe = scan.nextInt();
                System.out.println("Indique cantidad de azucar.. 0 a 3");
                azucar = scan.nextInt();
                System.out.println("Indique cantidad de leche.. 0 a 3");
                leche = scan.nextInt();
                if(tipoTe == 1)
                {
                    pedido[i] = new TeVerde(azucar, leche);
                    
                    
                }
                else if(tipoTe == 2)
                {
                    pedido[i] = new TeRojo(azucar, leche);
                    
                }
                else if (tipoTe == 3)
                {
                    pedido[i] = new TeNegro(azucar, leche);
                    
                }
                else 
                {
                    System.out.println("Opcion no valida");
                }
                
            }
            else 
            {
                System.out.println("Opcion no valida.");
            }
            totalAzucar = totalAzucar + azucar;
            totalLeche = totalLeche + leche;
            precio = precio + pedido[i].precio() + (azucar*5) + (leche*5);
            precioTotal = ((precioTotal + (precio * 21)) / 100)+precio;
            pedidoTotal = pedidoTotal +" "+ pedido[i].descripcion();
            
        }
       
        System.out.println(pedidoTotal+" con "+totalAzucar+" de azucar y "+totalLeche+" de leche");
        System.out.println("SUBTOTAL: "+precio);
        System.out.println("TOTAL: "+precioTotal);
        
        
       
    }
    
}
