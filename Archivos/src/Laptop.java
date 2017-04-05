



public class Laptop {
    private String marca;
    private String modelo;


    public Laptop(String marca, String modelo)
    {
        this.marca = marca;
        this.marca = modelo;

    }
    @Override
    public String toString()
    {
        return "Laptop de marca: " + marca + "y modelo " + modelo;
    }
}

