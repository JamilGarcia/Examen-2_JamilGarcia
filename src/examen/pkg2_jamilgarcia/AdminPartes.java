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
public class AdminPartes {
    
     private ArrayList listaP = new ArrayList();
    private File archivo = null;
    
    public AdminPartes(String path) {
        archivo = new File(path);
    }

    public ArrayList getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList listaP) {
        this.listaP = listaP;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "lista=" + listaP;
    }

    //extra mutador
    public void setPartes(Parte p) {
        this.listaP.add(p);
    }

    public void cargarArchivo() {
         try {            
            listaP = new ArrayList();
            Parte temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Parte) objeto.readObject()) != null) {
                        listaP.add(temp);
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
            for (Iterator it = listaP.iterator(); it.hasNext();) {
                Parte t = (Parte) it.next();
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

