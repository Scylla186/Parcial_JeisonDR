/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String Lista;
        int C_empleados;
        String nombre;
        String apellido;
        String telefono;
        String codigo;
        int T_empleado;
        int T_Pagar=0;
        int C_Proyectos=0;
        int S_mod=0;
        int P_Salud=0;
        int P_Pension=0;
        
        JOptionPane.showMessageDialog(null,"Bienvenido a la calculador por tipo de empleado");
        JOptionPane.showMessageDialog(null,"Si desea saber su Salario siga con mis intrucciones");
        String C = JOptionPane.showInputDialog( "De cuantos empleados desea calcular?");
        
         C_empleados = Integer.parseInt(C);
         
         
         
         
         for (int x = 1; x <= C_empleados; x++) {
             System.out.println("Introduzca su nombre");
             nombre = scan.next();
             System.out.println("Introduzca su apellido");
             apellido = scan.next();
             System.out.println("Introduzca su N° de telefono");
             telefono = scan.next();
             System.out.println("Introduzca su numero de empleado");
             codigo = scan.next();
             System.out.println("Que tipo de empleado es?:  (1. Consultor ; 2. Planta)");
             System.out.println("En caso de escribir cualquier otro elemento el programa se cerrara");
             T_empleado = scan.nextInt();
             if (T_empleado == 1) {
             Consultores Consultores = new Consultores(C_Proyectos, S_mod, nombre, apellido, telefono, codigo, T_empleado, T_Pagar);
             Consultores.setNombre(nombre);
             Consultores.setApellido(apellido);
             Consultores.setTelefono(telefono);
             Consultores.setCodigo(codigo);
             
             System.out.println("Usted en cuantos proyectos ha trabajado");
             C_Proyectos = scan.nextInt();
             Consultores.setC_Proyectos(C_Proyectos);
             
             for (int y = 1; y <= C_Proyectos; y++){
                 System.out.println("Cual es el valor de trabajar en el proyecto "+y);
                 S_mod=scan.nextInt();
                 Consultores.setS_mod(S_mod);
                 Consultores.CalcularT_Pagar();
             }
              
                 System.out.println("Su sueldo total es: "+Consultores.getT_Pagar());
                 
                 
        
             } else if (T_empleado == 2){ 
                 Planta Planta = new Planta( P_Salud, P_Pension, S_mod, nombre, apellido, telefono, codigo, T_empleado, T_Pagar);
                Planta.setNombre(nombre);
                Planta.setApellido(apellido);
                Planta.setTelefono(telefono);
                Planta.setCodigo(codigo);
                 
                 System.out.println("Cual es su sueldo");
                 S_mod = scan.nextInt();
                 Planta.setS_mod(S_mod);
                 Planta.CalcularPorc_Pension();
                 Planta.CalcularPorc_Salud();
                 Planta.CalcularT_Pagar();
                 System.out.println("Su sueldo total es: ");
                 System.out.println(""+Planta.getT_Pagar());
                 System.out.println("El valor de pension y salud es; ");
                 System.out.println("Pension: "+Planta.getPorc_Pension());
                 System.out.println("Salud:   "+Planta.getPorc_Salud());
                 
                 
                 
             }
             
             
             
             
         }
     
         
          GUI FRAMES = new GUI();
     FRAMES.setVisible(true);
    
         
         
         
         
    }
    }

 
