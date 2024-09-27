/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */

abstract public class Empleado {
    
    ArrayList<String>  arl = new ArrayList<String>();
    
    
    public String nombre;
    public String apellido;
    public String telefono;
    public String codigo;
    public int T_empleado;
    public int T_Pagar;
    

    public Empleado(String nombre, String apellido, String telefono, String codigo, int T_empleado, int T_Pagar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.codigo = codigo;
        this.T_empleado = T_empleado;
        this.T_Pagar = T_Pagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getT_empleado() {
        return T_empleado;
    }

    public void setT_empleado(int T_empleado) {
        this.T_empleado = T_empleado;
    }

    public int getT_Pagar() {
        return T_Pagar;
    }

   public abstract void CalcularT_Pagar();

   public abstract void addString();
   
   public abstract void showString();
       
   
    
    
  
    
    
    
    
    }


    

    
    

