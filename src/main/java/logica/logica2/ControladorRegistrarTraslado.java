/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;


import fachada.FabricaDatos;
import fachada.IDatos;
import fachada.Transporte;
import fachada.Traslado;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorRegistrarTraslado {
    
    public List<Traslado> getTrasladosNoAtendidos() {
        IDatos daodatos = FabricaDatos.getInstance();
        return null;
    }
    
    public List<Transporte> getTodosLosVehiculosDisponibles() {
        IDatos daodatos = FabricaDatos.getInstance();
        return null;
    }
    
    public void guardarTraslado(Traslado traslado) {
        IDatos daodatos = FabricaDatos.getInstance();
    }
    
}
