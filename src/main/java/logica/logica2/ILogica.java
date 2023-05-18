/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica.logica2;

import Excepciones.BaseException;
import Excepciones.ExcedeCantidadTrasladoException;
import Excepciones.MalformedResiduo;
import Excepciones.MalformedSolicitud;
import Excepciones.ResiduoExistenteException;
import Excepciones.SolicitudExistenteException;
import fachada.Asignacion;
import fachada.Empresa;
import fachada.Productor;
import fachada.Quimico;
import fachada.Residuo;
import fachada.Solicitud;
import fachada.Transporte;
import fachada.Traslado;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
public interface ILogica {
    public boolean comprobarResiduo(Residuo residuo);
    public void guardarResiduo(Residuo residuo) throws MalformedResiduo, ResiduoExistenteException;
    public List<Quimico> obtenerTodosLosQuimicos() throws BaseException;
    public List<Solicitud> obtenerTodasLasSolicitudes();
    public List<Empresa> obtenerTodasLasEmpresas();
    public void guardarSolicitud(Solicitud solicitud);
    public List<Residuo> obtenerTodosLosResiduosDeProductor(String productor) throws BaseException;
    public boolean haySolicitudFechaProductor(Solicitud s);
    public List<Traslado> getTrasladosNoAtendidos();
    public List<Transporte> getTodosLosVehiculosDisponibles();
    public void guardarTraslado(Traslado traslado);
    public void guardarAsignacion(Asignacion asignacion);
    public void solicitarTraslado(Solicitud solicitud) throws MalformedSolicitud, ExcedeCantidadTrasladoException, SolicitudExistenteException;
    public long verificaCantidadFecha(Date dia);
}
