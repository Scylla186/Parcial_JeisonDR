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
public class Planta extends Empleado{
    
    public int Porc_Salud;
    public int Porc_Pension;
    public int S_mod;

    
    public Planta(int Porc_Salud, int Porc_Pension, int S_mod, String nombre, String apellido, String telefono, String codigo, int T_empleado, int T_Pagar) {
        super(nombre, apellido, telefono, codigo, T_empleado, T_Pagar);
        this.Porc_Salud = Porc_Salud;
        this.Porc_Pension = Porc_Pension;
        this.S_mod = S_mod;
    }

    public int getPorc_Salud() {
        return Porc_Salud;
    }

    public void CalcularPorc_Salud() {
        this.Porc_Salud = ((S_mod/100)*4);
    }

    public int getPorc_Pension() {
        return Porc_Pension;
    }

    public void CalcularPorc_Pension() {
        this.Porc_Pension = ((S_mod/100)*8);
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

    public void setT_empleado(int T_empleado) {
        this.T_empleado = T_empleado;
    }

    public int getT_Pagar() {
        return T_Pagar;
    }

    public void CalcularT_Pagar() {
        this.T_Pagar = S_mod-(Porc_Salud+Porc_Pension);
    }


   
   public void addString(){
       arl.add(" nombre: "+ nombre+" apellido: "+apellido+" telefono: "+telefono+" codigo: "+codigo+" T.Pagar: "+T_Pagar+" T.Empleado: "+T_empleado+" % Pension: "+Porc_Pension+" % Salud: "+Porc_Salud);
   }
    public void showString(){
         System.out.println(""+arl);
    }  
}
