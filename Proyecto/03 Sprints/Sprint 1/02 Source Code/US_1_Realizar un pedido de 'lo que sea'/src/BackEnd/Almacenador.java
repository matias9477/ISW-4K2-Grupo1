/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani
 */
public class Almacenador {
    
    public static void guardarArchivoTexto (String nombreArchivo, String archivo){
        try (PrintWriter out = new PrintWriter(nombreArchivo)) {
            out.println(archivo);
        } catch (FileNotFoundException ex) {
            System.out.println("Error en el grabado");;
        }
    }
    
}
