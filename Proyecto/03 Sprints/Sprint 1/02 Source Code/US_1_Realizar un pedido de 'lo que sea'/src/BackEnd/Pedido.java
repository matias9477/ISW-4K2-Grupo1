/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.File;

/**
 *
 * @author Matia
 */
public class Pedido {

        private String descripcion;
    private File imagen;
    private String calleOrigen;
    private String numeroCalleOrigen;
    private String pisoOrigen;
    private String dptoOrigen;
    private String calleDestino;
    private String numeroCalleDestino;
    private String pisoDestino;
    private String dptoDestino;
    private boolean entregaInmediata;
    private String horaEntrega;
    private String minutoEntrega;
    private int montoPagoEfectivo;
    private int vueltoPagoEfectivo;
    private boolean pagoTarjeta;
    private int precio;

    public Pedido() {
        this.descripcion = "";
        this.calleOrigen = "";
        this.numeroCalleOrigen = "";
        this.pisoOrigen = "";
        this.dptoOrigen = "";
        this.calleDestino = "";
        this.numeroCalleDestino = "";
        this.pisoDestino = "";
        this.dptoDestino = "";
        this.entregaInmediata = true;
        this.horaEntrega = "";
        this.minutoEntrega = "";
        this.montoPagoEfectivo = 0;
        this.vueltoPagoEfectivo = 0;
        this.pagoTarjeta = false;
        this.precio = 0;
    }

    
    public Pedido(String descripcion, String calleOrigen, String numeroCalleOrigen, String calleDestino, String numeroCalleDestino) {
        this();
        this.descripcion = descripcion;

        this.calleOrigen = calleOrigen;
        this.numeroCalleOrigen = numeroCalleOrigen;
        this.calleDestino = calleDestino;
        this.numeroCalleDestino = numeroCalleDestino;
        this.pagoTarjeta=false;
        this.entregaInmediata=false;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEntregaInmediata() {
        return entregaInmediata;
    }

    public int getVueltoPagoEfectivo() {
        return vueltoPagoEfectivo;
    }

    public boolean isPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setEntregaInmediata(boolean entregaInmediata) {
        this.entregaInmediata = entregaInmediata;
    }

    public void setVueltoPagoEfectivo(int vueltoPagoEfectivo) {
        this.vueltoPagoEfectivo = vueltoPagoEfectivo;
    }

    public void setPagoTarjeta(boolean pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }
    
    
    
    public void marcarComoEntregaInmediata(){
        entregaInmediata=true;
    }
    public void marcarComoPagado(){
        pagoTarjeta=true;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public String getCalleOrigen() {
        return calleOrigen;
    }

    public void setCalleOrigen(String calleOrigen) {
        this.calleOrigen = calleOrigen;
    }

    public String getNumeroCalleOrigen() {
        return numeroCalleOrigen;
    }

    public void setNumeroCalleOrigen(String numeroCalleOrigen) {
        this.numeroCalleOrigen = numeroCalleOrigen;
    }

    public String getPisoOrigen() {
        return pisoOrigen;
    }

    public void setPisoOrigen(String pisoOrigen) {
        this.pisoOrigen = pisoOrigen;
    }

    public String getDptoOrigen() {
        return dptoOrigen;
    }

    public void setDptoOrigen(String dptoOrigen) {
        this.dptoOrigen = dptoOrigen;
    }

    public String getCalleDestino() {
        return calleDestino;
    }

    public void setCalleDestino(String calleDestino) {
        this.calleDestino = calleDestino;
    }

    public String getNumeroCalleDestino() {
        return numeroCalleDestino;
    }

    public void setNumeroCalleDestino(String numeroCalleDestino) {
        this.numeroCalleDestino = numeroCalleDestino;
    }

    public String getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(String pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public String getDptoDestino() {
        return dptoDestino;
    }

    public void setDptoDestino(String dptoDestino) {
        this.dptoDestino = dptoDestino;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getMinutoEntrega() {
        return minutoEntrega;
    }

    public void setMinutoEntrega(String minutoEntrega) {
        this.minutoEntrega = minutoEntrega;
    }

    public int getMontoPagoEfectivo() {
        return montoPagoEfectivo;
    }

    public void setMontoPagoEfectivo(int montoPagoEfectivo) {
        this.montoPagoEfectivo = montoPagoEfectivo;
    }

    @Override
    public String toString() {
        String s;
        s = "Pedido: " + "\n"+ "\tDescripcion: " + descripcion + '\n' + 
                "\tOrigen: \n" + 
                "\n"+ "\t\tCalle origen: " + calleOrigen + '\n' + 
                "\n"+ "\t\tNumero origen: " + numeroCalleOrigen + '\n' + 
                "\n"+ "\tPis origen: " + pisoOrigen + '\n' + 
                "\n"+ "\t\tDepto origen: " + dptoOrigen + '\n' +
                
                "\tDestino: \n" + 
                "\n"+ "\t\tCalle destino: " + calleDestino + '\n' + 
                "\n"+ "\t\tNumero destino: " + numeroCalleDestino + '\n' + 
                "\n"+ "\t\tPis destino: " + pisoDestino + '\n' + 
                "\n"+ "\t\tDepto destino: " + dptoDestino + '\n' +
                
                "\n";
        if(!entregaInmediata){
            s += "\n"+ "\tHora entrega: " + horaEntrega + '\n' + 
                "\n"+ "\tMinuto entrega: " + minutoEntrega + '\n';
        }    
        
        s += "\n"+ "\tPrecio: " + precio + '\n';
        if(!pagoTarjeta){
           s += "\n"+ "\tVuelto: " + vueltoPagoEfectivo + '\n'; 
        }   
        return s;         
    }
    
}
