package examen.pkg2_jamilgarcia;

public class Pantalla extends Parte{
    private boolean tactilP; 
    private String tipo; 

    public Pantalla(boolean tactilP, String tipo, int min) {
        super(min);
        this.tactilP = tactilP;
        this.tipo = tipo;
    }

    public boolean isTactilP() {
        return tactilP;
    }

    public void setTactilP(boolean tactilP) {
        this.tactilP = tactilP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tactil:" + tactilP;
    }
    
}
