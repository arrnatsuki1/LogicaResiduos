/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;


import fachada.Asignacion;
import fachada.Empresa;
import fachada.FabricaDatos;
import fachada.IDatos;
import fachada.Solicitud;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorAsignarTraslado {
    
    public List<Solicitud> obtenerTodasLasSolicitudes() {
        IDatos daodatos = FabricaDatos.getInstance();
        return null;
    }
    
    public List<Empresa> obtenerTodasLasEmpresas() {
        IDatos daodatos = FabricaDatos.getInstance();
        return null;
    }
    
    public void guardarAsignacion(Asignacion asignacion) {
        IDatos daodatos = FabricaDatos.getInstance();
    }
    
}
