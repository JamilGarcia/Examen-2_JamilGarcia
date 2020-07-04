package examen.pkg2_jamilgarcia;

public class Teclado extends Parte{
    
    private String materialT; 
    private String colorT;

    public Teclado(String materialT, String colorT, int min) {
        super(min);
        this.materialT = materialT;
        this.colorT = colorT;
    }

    public String getMaterialT() {
        return materialT;
    }

    public void setMaterialT(String materialT) {
        this.materialT = materialT;
    }

    public String getColorT() {
        return colorT;
    }

    public void setColorT(String colorT) {
        this.colorT = colorT;
    }

    @Override
    public String toString() {
        return "Teclado: " + colorT;
    }
    
    
    
}
