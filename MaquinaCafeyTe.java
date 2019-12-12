
package maquinacafeyte;
import java.util.Scanner;
public class MaquinaCafeyTe 
{
    public static void main(String[] args) 
    {
        Bebidas[] orden = new Bebidas [20];
        
        boolean otraOrden = true;
        int next = 0;
        
        while (otraOrden) 
        {

            System.out.println("¿Qué quiere tomar?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner entrada = new Scanner(System.in);
            int clase = entrada.nextInt();

            if (clase == 1) 
            {
                
                System.out.println(""
                        + "1-Expresso\n"
                        + "2-Ristretto\n"
                        + "3-Normal\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoCafe = entradacafe.nextInt();            
                switch (tipoCafe) 
                {
                    case 1:
                        orden[next] = new Expresso();
                        break;
                    case 2:
                        orden[next] = new Ristretto();
                        break;
                    case 3:
                        orden[next] = new Normal();
                        break;
                }

                System.out.println("¿Cuantas cucharadas de azucar? 0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradaazucar.nextInt();
                orden[next].setAzucar(azucar);

                System.out.println("¿Cuanto de leche? 0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                orden[next].setLeche(leche);
            }

            if (clase == 2) 
            {
                
                System.out.println(""
                        + "1-Negro\n"
                        + "2-Rojo\n"
                        + "3-Verde\n");
                Scanner entradate = new Scanner(System.in);
                int tipoTe = entradate.nextInt();            
                switch (tipoTe) 
                {
                    case 1:
                        orden[next] = new Negro();
                        break;
                    case 2:
                        orden[next] = new Rojo();
                        break;
                    case 3:
                        orden[next] = new Verde();
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar? 0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradaazucar.nextInt();
                orden[next].setAzucar(azucar);

                System.out.println("¿Cuanto quiere de leche? 0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                orden[next].setLeche(leche);
            }

            System.out.println("¿Desea algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner otroPedido = new Scanner(System.in);
            int otro = otroPedido.nextInt();
            if (otro == 1) 
            {
                next++;
            } else 
            {
                otraOrden = false;
            }

        }
            double subtotal = 0, total = 0;

        for (int i = 0; i < orden.length; i++) 
        {
            
            if (orden[i] != null) 
            {
                System.out.println(orden[i]);
                subtotal = subtotal + orden[i].getPrecio()
                        + orden[i].getAzucar() * 5
                        + orden[i].getLeche() * 5;
                
            }

        }
        
        
        
        total = subtotal * 1.21;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);
        

    }
  
}
