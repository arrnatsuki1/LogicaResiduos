/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;


import fachada.FabricaDatos;
import fachada.IDatos;
import fachada.Quimico;
import fachada.Residuo;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorRegistrarResiduo {
    
    public List<Quimico> obtenerTodosLosQuimicos() {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodosLosQuimicos();
    }   
    
    public boolean comprobarResiduo(Residuo residuo) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.comprobarResiduo(residuo);
    }   
    
    public void guardarResiduo(Residuo residuo) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarResiduo(residuo);
    }
    
}
