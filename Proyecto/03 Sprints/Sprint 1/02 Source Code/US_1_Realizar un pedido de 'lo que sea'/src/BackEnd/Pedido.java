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
    private int ID;
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
    private String horaEntrega;
    private String minutoEntrega;
    private int montoPagoEfectivo;

    public Pedido(String descripcion, File imagen, String calleOrigen, String numeroCalleOrigen, String calleDestino, String numeroCalleDestino) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.calleOrigen = calleOrigen;
        this.numeroCalleOrigen = numeroCalleOrigen;
        this.calleDestino = calleDestino;
        this.numeroCalleDestino = numeroCalleDestino;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    
    
}
