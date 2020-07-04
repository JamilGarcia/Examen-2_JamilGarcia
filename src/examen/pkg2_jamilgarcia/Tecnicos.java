package examen.pkg2_jamilgarcia;

import java.io.Serializable;

public class Tecnicos implements Serializable{
    
    private static final long SerialVersionUID = 3L;
    private String nombreT; 
    private int edadT; 
    private String genero; 
    private int computadorasT; 

    public Tecnicos(String nombreT, int edadT, String genero) {
        this.nombreT = nombreT;
        this.edadT = edadT;
        this.genero = genero;
        computadorasT = 0;
    }

    
    public Tecnicos(String nombreT, int edadT) {
        this.nombreT = nombreT;
        this.edadT = edadT;
        computadorasT = 0;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public int getEdadT() {
        return edadT;
    }

    public void setEdadT(int edadT) {
        this.edadT = edadT;
    }

    public int getComputadorasT() {
        return computadorasT;
    }

    public void setComputadorasT(int computadorasT) {
        this.computadorasT = computadorasT;
    }

    @Override
    public String toString() {
        return nombreT + " " + edadT + " " + computadorasT;
    }
    
    
}
