/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica.logica2;

import fachada.Asignacion;
import fachada.Empresa;
import fachada.Productor;
import fachada.Quimico;
import fachada.Residuo;
import fachada.Solicitud;
import fachada.Transporte;
import fachada.Traslado;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
public interface ILogica {
    public boolean comprobarResiduo(Residuo residuo);
    public void guardarResiduo(Residuo residuo);
    public List<Quimico> obtenerTodosLosQuimicos();
    public List<Solicitud> obtenerTodasLasSolicitudes();
    public List<Empresa> obtenerTodasLasEmpresas();
    public void guardarSolicitud(Solicitud solicitud);
    public List<Residuo> obtenerTodosLosResiduosDeProductor(Productor productor);
    public int verificarCantidadFecha(Solicitud solicitud);
    public boolean haySolicitudFechaProductor(Productor productor);
    public List<Traslado> getTrasladosNoAtendidos();
    public List<Transporte> getTodosLosVehiculosDisponibles();
    public void guardarTraslado(Traslado traslado);
    public void guardarAsignacion(Asignacion asignacion);
}
