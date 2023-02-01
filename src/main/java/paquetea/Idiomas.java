/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ERICK
 */
public class Idiomas {

    // Método para crear el traductor    
    Map<String, Traductor> palabra = new TreeMap<>();
    
    public Idiomas(){
        palabra = new HashMap<>();
    }
    
    // Método para obtener el traductor
    public Map<String, Traductor> getTraductor(){
        return palabra;
    }
    
    // Método para añadir una nueva palabra
    public void newPalabra(String palabraExtranjera, Traductor palabraEspaniol){
        palabra.put(palabraExtranjera, palabraEspaniol);
    }
    
    public void eliminarPalabra(String clave){
        palabra.remove(clave);
    }
    
    public void modificarPalabra(String clave, Traductor modificar){
        palabra.put(clave, modificar);
    } 
    
    public Set<String> getKey(){
        Map<String, Traductor> listaMap = new TreeMap<>(palabra);
        Set<String> lista = new TreeSet();
        
        for(Map.Entry<String, Traductor> p1 : listaMap.entrySet()){
            String clave = p1.getKey();            
            
            lista.add(clave);
            
        }
      return lista;
    }
    
    public Collection<Traductor> getValue(){
        Map<String, Traductor> listaMap = new TreeMap<>(palabra); // Auxililar
        Collection<Traductor> lista = listaMap.values();// Lista para añadir los valores
        
      return lista;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
