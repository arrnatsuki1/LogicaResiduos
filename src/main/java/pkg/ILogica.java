/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg;

import Entidades.Quimico;
import Entidades.Residuo;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
public interface ILogica {
    public List<Residuo> obtenerTodosLosResiduos();
    public boolean comprobarResiduo(Residuo residuo);
    public void guardarResiduo(Residuo residuo);
    public List<Quimico> obtenerTodosLosQuimicos();
}
