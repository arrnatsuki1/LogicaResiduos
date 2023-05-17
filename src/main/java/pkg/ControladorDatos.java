/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import Entidades.Quimico;
import Entidades.Residuo;
import fachada.IDatos;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorDatos {
    
    private IDatos fachada;
    
    public ControladorDatos(IDatos fachada) {
        this.fachada = fachada;
    }
    
    public List<Quimico> obtenerTodosLosQuimicos() {
        return fachada.obtenerTodosLosQuimicos();
    }
    
    public List<Residuo> obtenerTodosLosResiduos() {
        return fachada.obtenerTodosLosResiduos();
    }
    
    public boolean comprobarResiduo(Residuo residuo) {
        return fachada.comprobarResiduo(residuo);
    }
    
    public void guardarResiduo(Residuo residuo){
        fachada.guardarResiduo(residuo);
    }
    
}
