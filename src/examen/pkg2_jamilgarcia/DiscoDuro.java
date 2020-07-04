package examen.pkg2_jamilgarcia;

public class DiscoDuro extends Parte{
    
    private int tamanioDD; 
    private String marcaDD;
    
    public DiscoDuro(int min) {
        super(min);
    }

    public DiscoDuro(int tamanioDD, String marcaDD, int min) {
        super(min);
        this.tamanioDD = tamanioDD;
        this.marcaDD = marcaDD;
    }

    public int getTamanioDD() {
        return tamanioDD;
    }

    public void setTamanioDD(int tamanioDD) {
        this.tamanioDD = tamanioDD;
    }

    public String getMarcaDD() {
        return marcaDD;
    }

    public void setMarcaDD(String marcaDD) {
        this.marcaDD = marcaDD;
    }

    @Override
    public String toString() {
        return tamanioDD + "GB";
    }
    
    
}
