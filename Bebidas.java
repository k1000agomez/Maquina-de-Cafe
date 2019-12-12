
package maquinacafeyte;

public abstract class Bebidas 
{
    private int azucar;
    private int leche;
    
   public int getAzucar() 
    {
        return azucar;
    }

    public int getLeche() 
    {
        return leche;
    }

    public void setAzucar(int azucar) 
    {
        this.azucar = azucar;
    }

    public void setLeche(int leche) 
    {
        this.leche = leche;
    }

    @Override
    public String toString() 
    {
        return getClase() 
                +","+getDescripcion()+
                ",azúcar x"+getAzucar()+
                ",leche x"+getLeche();
    }
   
    
    public abstract String getDescripcion();
    
    public abstract double getPrecio();
    
    public abstract String getClase();
}
