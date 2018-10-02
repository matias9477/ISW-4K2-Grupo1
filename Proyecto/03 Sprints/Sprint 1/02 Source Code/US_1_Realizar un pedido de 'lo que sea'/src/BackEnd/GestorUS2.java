package BackEnd;


import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matia
 */
public class GestorUS2 {
    private ValidadorTarjeta validador;
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
    private int montoAPagar; //precio del bien mas el precio de envio
    private int montoPagoEfectivo;
    private Pedido pedido;
    private boolean validacionCredito;
    private boolean validacionEfectivo;
    private boolean entregaInmediata;
       public GestorUS2() {
        validador=new ValidadorTarjeta();
        entregaInmediata=false;

    }
        public void crearNuevoPedido(){
        pedido=new Pedido(descripcion,calleOrigen,numeroCalleOrigen,calleDestino,numeroCalleDestino);
            if (imagen!=null) {
                pedido.setImagen(imagen);
            }
            if (pisoOrigen!=null) {
                pedido.setPisoOrigen(pisoOrigen);
            }
            if (dptoOrigen!=null) {
                pedido.setDptoOrigen(dptoOrigen);
            }
                        if (pisoDestino!=null) {
                pedido.setPisoDestino(pisoDestino);
            }
            if (dptoDestino!=null) {
                pedido.setDptoDestino(dptoDestino);
            }
            if(!entregaInmediata){
                pedido.setHoraEntrega(horaEntrega);
                pedido.setMinutoEntrega(minutoEntrega);
            }
            else{
                pedido.setEntregaInmediata(true);
            }
            
            
            //pago
            if (validacionCredito) {
                pedido.setPrecio(montoAPagar);
                pedido.setPagoTarjeta(true);
            }
            else{
                pedido.setPrecio(montoAPagar);
                pedido.setMontoPagoEfectivo(montoPagoEfectivo);
                pedido.setVueltoPagoEfectivo(montoAPagar-montoPagoEfectivo);
            }
            
    }
    public void marcarComoEntregaInmediata()
    {
        entregaInmediata=true;
    }

    public int getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(int montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    
    public void guardarHoraEnvio(String hora, String minuto){
        horaEntrega=hora;
        minutoEntrega=minuto;
    }
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isValidacionCredito() {
        return validacionCredito;
    }

    public void setValidacionCredito(boolean validacionCredito) {
        this.validacionCredito = validacionCredito;
    }

    public boolean isValidacionEfectivo() {
        return validacionEfectivo;
    }

    public void setValidacionEfectivo(boolean validacionEfectivo) {
        this.validacionEfectivo = validacionEfectivo;
    }
    

 



    public ValidadorTarjeta getValidador() {
        return validador;
    }

    public void setValidador(ValidadorTarjeta validador) {
        this.validador = validador;
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
