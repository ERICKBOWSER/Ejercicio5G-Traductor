/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Objects;

/**
 *
 * @author ERICK
 */
public class LoteriaNacional implements Comparable<LoteriaNacional>{
    private String numero;
    private String premio;

    public LoteriaNacional(String numero, String premio) {
        this.numero = numero;
        this.premio = premio;
    }

    public LoteriaNacional() {
    }

    public String getNumero() {
        return numero;
    }

    public String getPremio() {
        return premio;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoteriaNacional other = (LoteriaNacional) obj;
        return this.numero == other.numero;
    }

    @Override
    public String toString() {
        return "LoteriaNacional{" + "numero=" + numero + ", premio=" + premio + '}';
    }

    @Override
    public int compareTo(LoteriaNacional o) {
        return this.numero.compareToIgnoreCase(o.numero);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


