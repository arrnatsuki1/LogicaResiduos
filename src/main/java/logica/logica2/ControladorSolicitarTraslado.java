/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.logica2;

import Excepciones.BaseException;
import fachada.Productor;
import fachada.Residuo;
import fachada.Solicitud;
import fachada.FabricaDatos;
import fachada.IDatos;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rosa Rodriguez
 */
class ControladorSolicitarTraslado {
    
    public List<Residuo> obtenerTodosLosResiduosDeProductor(String p) throws BaseException{
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.obtenerTodosLosDeProductor(p);
    }
    
    public long verificaCantidadFecha(Date calendar) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.verificaCantidadFecha(calendar);
    }
    
    public boolean haySolicitudFechaProductor(Solicitud s) {
        IDatos daodatos = FabricaDatos.getInstance();
        return daodatos.haySolicitudFechaProductor(s);
    }
    
    public void guardarSolicitud(Solicitud solicitud) {
        IDatos daodatos = FabricaDatos.getInstance();
        daodatos.guardarSolicitud(solicitud);
    }
    
    
}
