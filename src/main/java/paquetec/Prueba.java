/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ERICK
 */
public class Prueba {
    public static void main(String[] args) {
        
        // Llamada al método para crear el ejercito
        Ejercito ejercitoA = new Ejercito(); // El ejercito es el Set
        EjercitoOrdenado ejercitoB = new EjercitoOrdenado();
        
        
        // Listado de soldados del ejercito A
        Soldado s1 = new Soldado("78309392G", "Josh", "Fernandez", "Stark", 25);
        Soldado s2 = new Soldado("81238272H", "Fernando", "Ritan", "Ales", 88);
        Soldado s3 = new Soldado("38233411I", "Abby", "Martinez", "Rutor", 22);
        Soldado s4 = new Soldado("13892323T", "Tomás", "Dowson", "Hash", 18);
               
        // Soldado con el mismo nif
        Soldado s5 = new Soldado("13892323T", "Tomás", "Dowson", "Hash", 18);

        
        // Añadir los soldados en el ejercito A      
        ejercitoA.nuevoSoldado(s1);
        ejercitoA.nuevoSoldado(s2);
        ejercitoA.nuevoSoldado(s3);
        ejercitoA.nuevoSoldado(s4);
                
        System.out.println("Nuevos soldados:");
        ejercitoA.getEjercito().forEach(System.out :: println);
        System.out.println("--------------------------");
        
        // Número actual de soldados
        System.out.println("Número de soldados: " + ejercitoA.numeroSoldados());
        System.out.println("--------------------------");

        // Alistar un nuevo soldado
        ejercitoA.nuevoSoldado(new Soldado("82323123F", "Darren", "Smith", "Jona", 24));
        System.out.println("El soldado ha sido añadido");
        ejercitoA.getEjercito().forEach(System.out :: println);
        System.out.println("--------------------------");

        
        // Saber si el ejercito tiene soldados
        boolean vacioEjercito = ejercitoA.comprobarSiTieneSoldados();
        if(vacioEjercito){
            System.out.println("El ejercito no tiene soldados");
        }else{
            System.out.println("El ejercito si tiene soldados");
        }
        System.out.println("--------------------------");
        
        // Saber si un soldado esta en el ejercito
        boolean vacioSoldado = ejercitoA.comprobarSoldado(s1);
        if(vacioSoldado){
            System.out.println("El soldado no esta en el ejercito");
        }else{
            System.out.println("El soldado si esta en el ejercito");
        }
        System.out.println("--------------------------");
        
        // Mostrar los soldados en forma de lista
        System.out.println("Lista de soldados: ");
        ArrayList<Soldado> lista = new ArrayList<>();
        lista = ejercitoA.listaSoldados();
        lista.forEach(System.out :: println);
        System.out.println("--------------------------");
        
        // Desmatricular un soldado
        System.out.println("Lista del jercito después de desmatricular un soldado: ");
        ejercitoA.desmatricularSoldado("78309392G");
        ejercitoA.getEjercito().forEach(System.out :: println);

        // Añadir los soldados en el ejercito B
        // El soldado con el mismo nif no se añade
        ejercitoB.ejercito.add(new Soldado("78309392G", "Josh", "Fernandez", "Stark", 25));
        ejercitoB.ejercito.add(new Soldado("81238272H", "Fernando", "Ritan", "Ales", 88));
        ejercitoB.ejercito.add(new Soldado("13892323T", "Tomás", "Dowson", "Hash", 18));
        
        
        
        
        
        // PARTE C
        Map<String, Soldado> ejercitoMap = new TreeMap<>();

        
        
    }
}
