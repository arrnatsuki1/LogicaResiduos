/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;

import Excepciones.BaseException;
import Excepciones.ExcedeCantidadTrasladoException;
import Excepciones.MalformedResiduo;
import Excepciones.MalformedSolicitud;
import Excepciones.ResiduoExistenteException;
import Excepciones.SolicitudExistenteException;
import logica.logica2.ILogica;
import fachada.Asignacion;
import fachada.Empresa;
import fachada.Productor;
import fachada.Quimico;
import fachada.Residuo;
import fachada.Solicitud;
import fachada.Transporte;
import fachada.Traslado;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class FachadaLogica implements ILogica {

    private ControladorAsignarTraslado controladorAsignarTraslado;
    private ControladorSolicitarTraslado controladorSolicitarTraslado;
    private ControladorRegistrarResiduo controladorRegistrarResiduo;
    private ControladorRegistrarTraslado controladorRegistrarTraslado;

    public FachadaLogica() {
        controladorAsignarTraslado = new ControladorAsignarTraslado();
        controladorSolicitarTraslado = new ControladorSolicitarTraslado();
        controladorRegistrarResiduo = new ControladorRegistrarResiduo();
        controladorRegistrarTraslado = new ControladorRegistrarTraslado();
    }

    @Override
    public boolean comprobarResiduo(Residuo residuo) {
        return controladorRegistrarResiduo.comprobarResiduo(residuo);
    }

    
    //LISTO
    @Override
    public void guardarResiduo(Residuo residuo) throws MalformedResiduo, ResiduoExistenteException{
        //Comprueba la integridad del residuo
        residuo.verificar();
        //Comprueba que no exista antes
        if(controladorRegistrarResiduo.comprobarResiduo(residuo)) {
            throw new ResiduoExistenteException("El residuo ya existe");
        }
        //Guarda el residuo
        controladorRegistrarResiduo.guardarResiduo(residuo);
    }

    @Override
    public List<Quimico> obtenerTodosLosQuimicos()  throws BaseException{
        return controladorRegistrarResiduo.obtenerTodosLosQuimicos();
    }

    @Override
    public List<Solicitud> obtenerTodasLasSolicitudes() throws BaseException {
        return controladorAsignarTraslado.obtenerTodasLasSolicitudes();
    }

    @Override
    public List<Empresa> obtenerTodasLasEmpresas() throws BaseException{
        return controladorAsignarTraslado.obtenerTodasLasEmpresas();
    }

    @Override
    public void guardarSolicitud(Solicitud solicitud) {
        controladorSolicitarTraslado.guardarSolicitud(solicitud);
    }

    @Override
    public List<Residuo> obtenerTodosLosResiduosDeProductor(String productor) throws BaseException{
        return controladorSolicitarTraslado.obtenerTodosLosResiduosDeProductor(productor);
    }

    @Override
    public boolean haySolicitudFechaProductor(Solicitud s) {
        return controladorSolicitarTraslado.haySolicitudFechaProductor(s);
    }

    @Override
    public List<Traslado> getTrasladosNoAtendidos() {
        return controladorRegistrarTraslado.getTrasladosNoAtendidos();
    }

    @Override
    public List<Transporte> getTodosLosVehiculosDisponibles() {
        return controladorRegistrarTraslado.getTodosLosVehiculosDisponibles();
    }

    @Override
    public void guardarTraslado(Traslado traslado) {
        controladorRegistrarTraslado.guardarTraslado(traslado);
    }
    
    @Override
    public void guardarAsignacion(Asignacion asignacion){
        controladorAsignarTraslado.guardarAsignacion(asignacion);
    }

    @Override
    public void solicitarTraslado(Solicitud solicitud) throws MalformedSolicitud, ExcedeCantidadTrasladoException, SolicitudExistenteException {
        //Se verifica
        solicitud.verificar();
        //Verifica que no haya mas de 5 traslados
        
        
        //Hay solicitud para esa fecha
        if( this.haySolicitudFechaProductor(solicitud) ) {
            throw new SolicitudExistenteException("Ya hay una solicitud del mismo productor y con los mismos residuos para esta fecha");
        }
        
        if(verificaCantidadFecha(solicitud.getFechaSalida())>=5){
            throw new ExcedeCantidadTrasladoException("Ya hay 5 o mas traslados para ese dia");
        }
        
        this.guardarSolicitud(solicitud);
        
    }
    
    @Override
    public long verificaCantidadFecha(Date dia){
        return controladorSolicitarTraslado.verificaCantidadFecha(dia);
    };

    @Override
    public void asignarTraslado(Asignacion s) {
        s.asignaEnPartesIguales();
        controladorAsignarTraslado.guardarAsignacion(s);
    }
    
}
