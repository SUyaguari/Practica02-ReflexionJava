/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
        if(validar(objeto)==true){
            return lista.add(objeto);
        }
        return false;
    }
    
    public T read(Predicate<T> id){
        try {
            return lista.stream().filter(id).findFirst().get();
        } catch (Exception e) {
            System.out.println("No se encontro, lo que buscaba "+e);
            return null;
        }
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
    
    public abstract boolean validar(T objeto);
    
    public abstract void ordenarLista();
    
    public int buscarPosicion(T buscar){
        for (int i = 0; i < lista.size(); i++) {
            var objeto = lista.get(i);
            if(objeto.equals(buscar))
                return i;
        }
        return -1;
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
    
    public void imprimirListaReflexion(List lista){
        for (Object object : lista) {
            Method[] metodos = object.getClass().getMethods();
            for(Method m: metodos){
                try{
                    var variable = m.invoke(object, null);
                    
                }catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
                    System.out.println("Error imprimir lista reflexion: "+e);
                }
            }
        }
    }
    
}
