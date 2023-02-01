/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ERICK
 */
public class EjercitoOrdenado {
    Set<Soldado> ejercito;
    
    // Método para crear el ejercito
    public EjercitoOrdenado(){
        this.ejercito = new TreeSet();
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
    
}
