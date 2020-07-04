package examen.pkg2_jamilgarcia;

public class Procesador extends Parte{
    private int numeroNucleosP; 
    private double velocidad;

    public Procesador(int numeroNucleosP, double velocidad, int min) {
        super(min);
        this.numeroNucleosP = numeroNucleosP;
        this.velocidad = velocidad;
    }

    public int getNumeroNucleosP() {
        return numeroNucleosP;
    }

    public void setNumeroNucleosP(int numeroNucleosP) {
        this.numeroNucleosP = numeroNucleosP;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return numeroNucleosP + " " + velocidad;
    }
    
    
}
