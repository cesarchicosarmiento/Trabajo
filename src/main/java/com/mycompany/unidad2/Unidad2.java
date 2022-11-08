/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad2;

import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Unidad2 {

    public static void main(String[] args) {
       
        var mauricio = new Dueño("0103667754","Mauricio Ortiz",3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        System.out.println(mauricio.toString());
        
        var mcqueen = new Mascota ("Mcqueen","Perro","Grandanes",5.30,mauricio); 
        
        var atencion1 = new Atencion (LocalDate.now(),"Dra.Polo",25,mcqueen,5);
    }
    
   
}
