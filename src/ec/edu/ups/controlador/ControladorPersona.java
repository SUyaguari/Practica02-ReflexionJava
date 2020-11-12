/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class ControladorPersona extends AbstractControlador<Persona>{
    
    @Override
    public boolean validar(Persona objeto) {
       if(objeto.getNombre().equals(objeto.getApellido())){
           return false;
       }
       return true;
    }
    
    
    @Override
    public void ordenarLista() {
        List<Persona> lista = getLista();
        for (int i = 0; i < lista.size()-1; i++) {
            for (int j = i+1; j < lista.size(); j++) {
                if(lista.get(i).getApellido().compareTo(lista.get(j).getApellido())>0){
                    var aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        setLista(lista);
    }

    
    public int generarID(){
        List<Persona> lista = getLista();
        if (lista.size()>0)
            return lista.get(lista.size()-1).getId()+1;
        return 1;
    }
}
