/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;


import Excepciones.BaseException;
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
    
    public List<Solicitud> obtenerTodasLasSolicitudes() throws BaseException{
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodasLasSolicitudes();
    }
    
    public List<Empresa> obtenerTodasLasEmpresas() throws BaseException{
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodasLasEmpresas();
    }
    
    public void guardarAsignacion(Asignacion asignacion) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarAsignacion(asignacion);
    }
    
}
