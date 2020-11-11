/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public abstract class AbstractControlador<T> {
    
    private List<T> lista;

    public AbstractControlador() {
        lista = new ArrayList<>();
    }
    
    public boolean create(T objeto){
        return lista.add(objeto);
    }
    
    public T read(T id){
        return lista.stream().filter(ob -> ob.equals(id)).findFirst().get();
    }

    public boolean update(T objeto){
        int posicion = buscarPosicion(objeto);
        if(posicion >=0){
            lista.set(posicion, objeto);
            return true;
        }        
        return false;
    }
    
    public boolean delite(T objeto){
        return (lista.contains(objeto))? lista.remove(objeto): false;
    }
    
    public int buscarPosicion(T buscar){
        for (int i = 0; i < lista.size(); i++) {
            var objeto = lista.get(i);
            if(objeto.equals(buscar))
                return i;
        }
        return -1;
    }
}
