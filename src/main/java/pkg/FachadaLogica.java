/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    @Override
    public void guardarResiduo(Residuo residuo) {
        controladorRegistrarResiduo.guardarResiduo(residuo);
    }

    @Override
    public List<Quimico> obtenerTodosLosQuimicos() {
        return controladorRegistrarResiduo.obtenerTodosLosQuimicos();
    }

    @Override
    public List<Solicitud> obtenerTodasLasSolicitudes() {
        return controladorAsignarTraslado.obtenerTodasLasSolicitudes();
    }

    @Override
    public List<Empresa> obtenerTodasLasEmpresas() {
        return controladorAsignarTraslado.obtenerTodasLasEmpresas();
    }

    @Override
    public void guardarSolicitud(Solicitud solicitud) {
        controladorAsignarTraslado.guardarSolicitud(solicitud);
    }

    @Override
    public List<Residuo> obtenerTodosLosResiduosDeProductor(Productor productor) {
        return controladorSolicitarTraslado.obtenerTodosLosResiduosDeProductor(productor);
    }

    @Override
    public int verificarCantidadFecha(Solicitud solicitud) {
        return controladorSolicitarTraslado.verificaCantidadFecha(solicitud);
    }

    @Override
    public boolean haySolicitudFechaProductor(Productor p) {
        return controladorSolicitarTraslado.haySolicitudFechaProductor(p);
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
}
