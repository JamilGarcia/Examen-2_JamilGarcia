package examen.pkg2_jamilgarcia;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class AdministrarBarra extends Thread{
    
    private JProgressBar barra; 
    private boolean avanzar; 
    private boolean vive;
    private int limit;
    private boolean fallo;

    public AdministrarBarra() {
    }
    
    

    public AdministrarBarra(JProgressBar barra, int limit) {
        this.barra = barra;
        this.limit = limit;
        avanzar = true; 
        vive = true;
    }

    public boolean isFallo() {
        return fallo;
    }

    public void setFallo(boolean fallo) {
        this.fallo = fallo;
    }
    
    public boolean isVive() {
        return vive; 
        
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run(){
        while(vive) {
            if (avanzar){
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue()== limit){
                    vive = false;
                }
                try {
                    Thread.sleep(360);
                } catch (InterruptedException e) {
                }
            }
        }
        barra.setValue(0);
    }
}

