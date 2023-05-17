/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg;

import Entidades.Empresa;
import Entidades.Productor;
import Entidades.Quimico;
import Entidades.Residuo;
import Entidades.Solicitud;
import Entidades.Transporte;
import Entidades.Traslado;
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
}
