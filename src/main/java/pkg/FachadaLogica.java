/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import Entidades.Quimico;
import Entidades.Residuo;
import fachada.FabricaDatos;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class FachadaLogica implements ILogica{

    private ControladorDatos controladorDatos;
    
    public FachadaLogica() {
        controladorDatos = new ControladorDatos(FabricaDatos.getInstance());
    }
    
    @Override
    public List<Residuo> obtenerTodosLosResiduos() {
        return controladorDatos.obtenerTodosLosResiduos();
    }

    @Override
    public boolean comprobarResiduo(Residuo residuo) {
        return controladorDatos.comprobarResiduo(residuo);
    }

    @Override
    public void guardarResiduo(Residuo residuo) {
        controladorDatos.guardarResiduo(residuo);
    }

    @Override
    public List<Quimico> obtenerTodosLosQuimicos() {
        return controladorDatos.obtenerTodosLosQuimicos();  
    }
}
