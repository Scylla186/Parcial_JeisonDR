/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Consultores extends Empleado{
    
    
    
    protected int C_Proyectos;
    protected int S_mod;

    public Consultores(int C_Proyectos, int S_mod, String nombre, String apellido, String telefono, String codigo, int T_empleado, int T_Pagar) {
        super(nombre, apellido, telefono, codigo, T_empleado, T_Pagar);
        this.C_Proyectos = C_Proyectos;
        this.S_mod = S_mod;
    }

    public int getC_Proyectos() {
        return C_Proyectos;
    }

    public void setC_Proyectos(int C_Proyectos) {
        this.C_Proyectos = C_Proyectos;
    }

    public int getS_mod() {
        return S_mod;
    }

    public void setS_mod(int S_mod) {
        this.S_mod = S_mod;
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

    public void CalcularT_empleado(int T_empleado) {
        this.T_empleado = T_empleado;
    }

    public int getT_Pagar() {
        return T_Pagar;
    }

    public void CalcularT_Pagar() {
        
    
           
                    T_Pagar += S_mod;
            T_Pagar=T_Pagar;
            this.T_Pagar=T_Pagar;
    }
  
   
   public void addString(){
       arl.add(" nombre: "+nombre+" apellido: "+apellido+" telefono: "+telefono+" codigo: "+codigo+" Total a pagar: "+T_Pagar+" T.Empleado: "+T_empleado+" C.Proyectos: "+C_Proyectos);
   }
    
    public void showString(){
         System.out.println(""+arl);
    }  
    
    
    
  


    
}
