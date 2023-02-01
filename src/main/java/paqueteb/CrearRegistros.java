/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.lang3.RandomStringUtils;
import paquetea.Traductor;

/**
 *
 * @author ERICK
 */
public class CrearRegistros {
    Map<String, LoteriaNacional> registro = new HashMap<>(1000);
    
    public CrearRegistros(){
        registro = new HashMap<>(1000);
    }
    
    public void rellenarRegistro(){
        int contador = 0;
                
        do{
            String key = RandomStringUtils.randomNumeric(5);
            String value = RandomStringUtils.randomNumeric(7);
            
            registro.put(key, new LoteriaNacional(key, value));
            contador++;
        }while(contador < 100); // No se puede usar size() ya que devuelve 1 a pesar de que la capacidad es de 1000
    }
    
    public Map<String, LoteriaNacional> getLoteria(){
        return registro;
    }
    
    public Set<String> getKey(){
        Map<String, LoteriaNacional> listaMap = new TreeMap<>(registro); // Auxililar
        Set<String> lista = new TreeSet();// Lista para añadir los valores
        
        for(Map.Entry<String, LoteriaNacional> p1 : listaMap.entrySet()){
            String clave = p1.getKey();            
            
            lista.add(clave);
            
        }
        
      return lista;
    }
    
    
    public Collection<LoteriaNacional> getValue(){
        Map<String, LoteriaNacional> listaMap = new TreeMap<>(registro); // Auxililar
        Collection<LoteriaNacional> lista = listaMap.values();// Lista para añadir los valores
        
      return lista;
    }
    
    public LoteriaNacional getResultado(String s){
        Map<String, LoteriaNacional> listaMap = new TreeMap<>(registro); // Auxililar
        //Set<String> lista = listaMap.keySet();//
        
        LoteriaNacional aux = listaMap.get(s);
        
      return aux;
    }
}
