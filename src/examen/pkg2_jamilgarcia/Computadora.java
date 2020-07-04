
package examen.pkg2_jamilgarcia;

import java.io.Serializable;

public class Computadora implements Serializable{
    
    private static final long SerialVersionUID = 1L;
    private int numeroSerieC; 
    private int añoC;
    private String Color; 
    private String materialC; 
    private RAM ramC; 
    private DiscoDuro discoduroC; 
    private Bateria bateriaC; 
    private Teclado tecladoC; 
    private Pantalla pantallaC; 
    private Procesador procesadorC; 

    public Computadora(int numeroSerieC, int añoC, String Color, String materialC, RAM ramC, DiscoDuro discoduroC, Bateria bateriaC, Teclado tecladoC, Pantalla pantallaC, Procesador procesadorC) {
        this.numeroSerieC = numeroSerieC;
        this.añoC = añoC;
        this.Color = Color;
        this.materialC = materialC;
        this.ramC = ramC;
        this.discoduroC = discoduroC;
        this.bateriaC = bateriaC;
        this.tecladoC = tecladoC;
        this.pantallaC = pantallaC;
        this.procesadorC = procesadorC;
    }

    public int getNumeroSerieC() {
        return numeroSerieC;
    }

    public void setNumeroSerieC(int numeroSerieC) {
        this.numeroSerieC = numeroSerieC;
    }

    public int getAñoC() {
        return añoC;
    }

    public void setAñoC(int añoC) {
        this.añoC = añoC;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterialC() {
        return materialC;
    }

    public void setMaterialC(String materialC) {
        this.materialC = materialC;
    }

    public RAM getRamC() {
        return ramC;
    }

    public void setRamC(RAM ramC) {
        this.ramC = ramC;
    }

    public DiscoDuro getDiscoduroC() {
        return discoduroC;
    }

    public void setDiscoduroC(DiscoDuro discoduroC) {
        this.discoduroC = discoduroC;
    }

    public Bateria getBateriaC() {
        return bateriaC;
    }

    public void setBateriaC(Bateria bateriaC) {
        this.bateriaC = bateriaC;
    }

    public Teclado getTecladoC() {
        return tecladoC;
    }

    public void setTecladoC(Teclado tecladoC) {
        this.tecladoC = tecladoC;
    }

    public Pantalla getPantallaC() {
        return pantallaC;
    }

    public void setPantallaC(Pantalla pantallaC) {
        this.pantallaC = pantallaC;
    }

    public Procesador getProcesadorC() {
        return procesadorC;
    }

    public void setProcesadorC(Procesador procesadorC) {
        this.procesadorC = procesadorC;
    }

    @Override
    public String toString() {
        return numeroSerieC + " " + añoC + " " + Color + " " + materialC + " " + ramC + " " + discoduroC + " " + bateriaC + " " + tecladoC + " " + pantallaC + " " + procesadorC;
    }
    
    
    
}
