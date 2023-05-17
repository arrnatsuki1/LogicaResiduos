/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import Entidades.Transporte;
import Entidades.Traslado;
import fachada.FabricaDatos;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorRegistrarTraslado {
    
    public List<Traslado> getTrasladosNoAtendidos() {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.getTrasladosNoAtendidos();
    }
    
    public List<Transporte> getTodosLosVehiculosDisponibles() {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.getTodosLosVehiculosDisponibles();
    }
    
    public void guardarTraslado(Traslado traslado) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarTraslado(traslado);
    }
    
}
