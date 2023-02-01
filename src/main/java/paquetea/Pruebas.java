/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    
    
    public static void main(String[] args) {
        Idiomas palabra = new Idiomas();
        
        // Guardar una nueva palabra
        palabra.newPalabra("Clear", new Traductor("Limpio"));
        palabra.newPalabra("Strong", new Traductor("Fuerte"));        
        palabra.newPalabra("Tomorrow", new Traductor("Mañana"));
        palabra.newPalabra("Delete", new Traductor("Eliminar"));
        palabra.newPalabra("Always", new Traductor("Siempre"));
        
        // Mostrar la palabra
        System.out.println("La palabra es" + palabra.getTraductor());
        
        for(Map.Entry<String, Traductor> p1 : palabra.getTraductor().entrySet()){
            String clave = p1.getKey();
            Traductor valor = p1.getValue();
            
            System.out.println("La palabra extranjera es: " + clave + ", y la palabra en Español es: " + valor);
        }
        
        
        // Eliminar palabra
        palabra.eliminarPalabra("Clear");
        System.out.println("La palabra ha sido eliminada");
        
        // Modificar palabra
        palabra.modificarPalabra("Car", new Traductor("Camion"));
        System.out.println("La palabra ha sido modificado");
        for(Map.Entry<String, Traductor> p1 : palabra.getTraductor().entrySet()){
            String clave = p1.getKey();
            Traductor valor = p1.getValue();
            
            System.out.println("La palabra extranjera es: " + clave + ", y la palabra en Español es: " + valor);
        }
        
        System.out.println("-----------------");
        // Obtener palabras extranjeras
        System.out.println("Palabras Extranjeras: ");
        Set<String> listaKey = new HashSet<>();
        listaKey = palabra.getKey();
        listaKey.forEach(System.out :: println);
        
        //System.out.println(palabra.getKey());
        
        System.out.println("-----------------");
        // Obtener palabras españolas
        System.out.println("Palabras Españolas: ");
        Collection<Traductor> listaValor = new HashSet<>();
        listaValor = palabra.getValue();
        listaValor.forEach(System.out :: println);
                
        //System.out.println(palabra.getValue());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
