/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    public static void main(String[] args) {
        CrearRegistros loteria = new CrearRegistros();
        
        loteria.rellenarRegistro();
        
        System.out.println(loteria.getLoteria());
        
        System.out.println("Claves: ");
        Set<String> listaKey = new HashSet<>();
        listaKey = loteria.getKey();
        listaKey.forEach(System.out :: println);
        
        System.out.println("-----------------");
        System.out.println("Valor: ");
        Collection<LoteriaNacional> listaValor = new HashSet<>();
        listaValor = loteria.getValue();
        listaValor.forEach(System.out :: println);
        
        String resultado = JOptionPane.showInputDialog("Introduce el número del décimo: ");
        
        //Set<String> res = new HashSet<>();
        LoteriaNacional aux =  new LoteriaNacional();
        aux = loteria.getResultado(resultado);
        JOptionPane.showMessageDialog(null, aux);
        
        
    }
}
