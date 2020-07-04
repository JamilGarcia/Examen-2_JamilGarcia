/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JamilGarcía
 */
public class AdminComputadora {
     private ArrayList listaC = new ArrayList();
    private File archivo = null;
    
    public AdminComputadora(String path) {
        archivo = new File(path);
    }

    public ArrayList getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList listaC) {
        this.listaC= listaC;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "lista=" + listaC;
    }

    //extra mutador
    public void setComp(Computadora p) {
        this.listaC.add(p);
    }

    public void cargarArchivo() {
         try {            
            listaC = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        listaC.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Iterator it = listaC.iterator(); it.hasNext();) {
                Computadora t = (Computadora) it.next();
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}