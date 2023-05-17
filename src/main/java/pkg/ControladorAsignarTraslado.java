/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import Entidades.Empresa;
import Entidades.Solicitud;
import fachada.FabricaDatos;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorAsignarTraslado {
    
    public List<Solicitud> obtenerTodasLasSolicitudes() {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodasLasSolicitudes();
    }
    
    public List<Empresa> obtenerTodasLasEmpresas() {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodasLasEmpresas();
    }
    
    public void guardarSolicitud(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarSolicitud(solicitud);
    }
    
}
