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
        validador=new ValidadorTarjeta();
        entregaInmediata=false;
    }
    
    public void guardar(){
            Almacenador.guardarArchivoTexto("Pedido.txt", this.toString());
    }

    @Override
    public String toString() {
        String s;
        s = "Pedido: " + " \r\n "+ "\tDescripcion: " + descripcion + " \r\n " + 
                " \t Origen: \r\n " + 
                " \r\n " + "\t \t Calle origen: " + calleOrigen + " \r\n " + 
                " \r\n " + "\t \t Numero origen: " + numeroCalleOrigen + " \r\n " + 
                " \r\n " + "\t \t Piso origen: " + pisoOrigen + " \r\n " + 
                " \r\n " + "\t \t Dpto origen: " + dptoOrigen + " \r\n " +
                
                " \t Destino: \r\n " + 
                " \r\n " + " \t \t Calle destino: " + calleDestino + " \r\n " + 
                " \r\n " + " \t \t Numero destino: " + numeroCalleDestino + " \r\n " + 
                " \r\n " + " \t \t Piso destino: " + pisoDestino + " \r\n " + 
                " \r\n " + " \t \t Dpto destino: " + dptoDestino + " \r\n " +
                
                " \r\n ";
        if(!entregaInmediata){
            s += " \r\n " + " \t Hora entrega: " + horaEntrega + ":" + 
                 minutoEntrega + " \r\n ";
        }    
        
        s += "\r\n"+ "\tMonto a pagar: " + montoAPagar + '\n';
        if(validacionEfectivo){
           s += "\r\n"+ "\tMonto a pagar efectivo: " + montoPagoEfectivo + "\r\n"; 
        }   
        return s;       
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
