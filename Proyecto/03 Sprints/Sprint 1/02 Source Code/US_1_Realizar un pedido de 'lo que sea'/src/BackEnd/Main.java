package BackEnd;


import GUI.UIPedido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        GestorUS2 gestor=new GestorUS2();
        UIPedido windows = new UIPedido(gestor);
        windows.show();
        String card="4770539000089000";
        ValidadorTarjeta v=new ValidadorTarjeta();
        if(v.validarTarjeta(card))
        {
            System.out.println("es valida");
        }
    }
    
}
