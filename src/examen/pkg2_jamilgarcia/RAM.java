package examen.pkg2_jamilgarcia;

public class RAM extends Parte{
    
    private int tamanioR;
    private String marcaR; 

    public RAM(int tamanioR, String marcaR, int min) {
        super(min);
        this.tamanioR = tamanioR;
        this.marcaR = marcaR;
    }

    public int getTamanioR() {
        return tamanioR;
    }

    public void setTamanioR(int tamanioR) {
        this.tamanioR = tamanioR;
    }

    public String getMarcaR() {
        return marcaR;
    }

    public void setMarcaR(String marcaR) {
        this.marcaR = marcaR;
    }

    @Override
    public String toString() {
        return tamanioR + "GB";
    }
    
    
}
