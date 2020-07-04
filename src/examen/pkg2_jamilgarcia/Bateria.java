package examen.pkg2_jamilgarcia;

public class Bateria extends Parte{
    
    private int capacidadhorasB; 
    private String material;

    public Bateria(int capacidadhorasB, String material, int min) {
        super(min);
        this.capacidadhorasB = capacidadhorasB;
        this.material = material;
    }

    public int getCapacidadhorasB() {
        return capacidadhorasB;
    }

    public void setCapacidadhorasB(int capacidadhorasB) {
        this.capacidadhorasB = capacidadhorasB;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return " " + capacidadhorasB + "h";
    }
    
    
}
