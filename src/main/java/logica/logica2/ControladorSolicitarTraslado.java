/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;

import fachada.Productor;
import fachada.Residuo;
import fachada.Solicitud;
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
        return null;
    }
    
    public int verificaCantidadFecha(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
        return -1;
    }
    
    public boolean haySolicitudFechaProductor(Productor p) {
        IDatos daodatos = FabricaDatos.getInstance();
        return false;
    }
    
    public void guardarSolicitud(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
       
    }
    
    
}
