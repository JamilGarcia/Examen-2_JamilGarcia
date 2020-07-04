package examen.pkg2_jamilgarcia;

import java.io.Serializable;

public class Parte implements Serializable{
    
    private static final long SerialVersionUID = 2L;
    private int min; 

    public Parte() {
    }

    public Parte(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Parte{" + "min=" + min + '}';
    }
    
    
}
