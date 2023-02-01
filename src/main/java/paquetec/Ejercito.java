/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ERICK
 */
public class Ejercito {
    
    /*
    PARTE A
    
    Aplica lo estudiado para realizar una nueva clase llamada Ejercito, que contenga un número de 
    soldados N. El constructor debe inicializar la estructura SET (no hay soldados duplicados y el 
    orden no importa). Debe haber métodos para:
    1. Saber el número de soldados que hay.
    2. Alistar a un solado.
    3. Saber si el ejército no tiene soldados.
    4. Saber si un soldado está en el ejército.
    4. Sacar todos los soldados, en forma de ArrayList.
    5. Desmatricular a un soldado del ejército.

    Crea una clase de prueba para tu clase Ejército, donde se hagan uso de los métodos anteriores.  
    */
    
    Set<Soldado> ejercito;
    
    // Método para crear el ejercito
    public Ejercito(){
        this.ejercito = new HashSet();
    }
    
    // Método para obtener los soldados
    public Set<Soldado> getEjercito(){
        return this.ejercito;
    }
        
    // Método para añadir nuevos soldados
    public void nuevoSoldado(Soldado s){ // void ya que no devuelve datos
        this.ejercito.add(s);
    }

    // Método para saber el número de soldados que existen
    public int numeroSoldados(){
        return this.ejercito.size();
    }
    
    public boolean comprobarSiTieneSoldados(){
        return this.ejercito.isEmpty();
    }
    
    // Método para comprobar si un soldado esta en el ejercito
    public boolean comprobarSoldado(Soldado s){
        return this.ejercito.contains(s);
    }
    
    // Método para meter los soldados en una lista
    public ArrayList<Soldado> listaSoldados(){
        ArrayList<Soldado> lista =  new ArrayList<>(this.ejercito);
        
        return lista;
    }
    
    // Método para desmatricular un soldado
    public void desmatricularSoldado(String nif){
        this.ejercito.remove(new Soldado(nif, "", "", "", 0)); // Con proporcionar el NIF es suficiente ya que equals y hashcode usan el nif
        
        System.out.println("El soldado ha sido desmatriculado del ejercito.");
    }
    
    public void mostrarEjercito1(){
        // Está usando un iterator
        for(Soldado s : ejercito){
            System.out.println(s);
        }
    }
    
    // Estructura de datos especial que me permite recorrer un dato (se usa mucho para recorrer ficheros)
    // No permite el duplicado
    public void mostrarEjercito2(){
        // Este es el iterator
        Iterator<Soldado> iterador = ejercito.iterator();
        Soldado aux;
        
        while(iterador.hasNext()){
            aux = iterador.next();
            System.out.println(aux);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
