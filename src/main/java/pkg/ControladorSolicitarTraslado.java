/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import Entidades.Productor;
import Entidades.Residuo;
import Entidades.Solicitud;
import fachada.FabricaDatos;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorSolicitarTraslado {
    
    public List<Residuo> obtenerTodosLosResiduosDeProductor(Productor p ) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodosLosResiduosDeProductor(p);
    }
    
    public int verificaCantidadFecha(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.verificarCantidadFecha(solicitud);
    }
    
    public boolean haySolicitudFechaProductor(Productor p) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.haySolicitudFechaProductor(p);
    }
    
    public void guardarSolicitud(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarSolicitud(solicitud);
    }
    
    
}
