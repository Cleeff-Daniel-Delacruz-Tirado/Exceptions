/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import exepcionesPersonalizadas.MiExcepcionNumerica;
import exepcionesPersonalizadas.MiExcepcionGenerica;

/**
 *
 * @author Estudiante
 */
public class Utilitario {  
    
    
    /*Esta funcion permite convertir un texto en numero y controlar los errores
    que se pueden controlar apartir de ello
    numeroEnTexto el numero a convertir
    devuelve el numero entero
    */
    public static int convertir(String numeroEnTexto)
            throws MiExcepcionNumerica,
            MiExcepcionGenerica {
        try{
        return Integer.parseInt(numeroEnTexto);
        }catch (NumberFormatException s){
            throw new MiExcepcionNumerica();
        }catch(Exception ex){
            throw new MiExcepcionGenerica();
       
       }
        
    }
}

