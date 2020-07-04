package examen.pkg2_jamilgarcia;

public class OrdenEnsamblaje {
    
    private Computadora computadoraO; 
    private Tecnicos tecnicoO; 

    public OrdenEnsamblaje(Computadora computadoraO, Tecnicos tecnicoO) {
        this.computadoraO = computadoraO;
        this.tecnicoO = tecnicoO;
    }

    public Computadora getComputadoraO() {
        return computadoraO;
    }

    public void setComputadoraO(Computadora computadoraO) {
        this.computadoraO = computadoraO;
    }

    public Tecnicos getTecnicoO() {
        return tecnicoO;
    }

    public void setTecnicoO(Tecnicos tecnicoO) {
        this.tecnicoO = tecnicoO;
    }

    @Override
    public String toString() {
        return "OrdenEnsamblaje{" + "computadoraO=" + computadoraO + ", tecnicoO=" + tecnicoO + '}';
    }
    
    
}
