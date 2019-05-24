/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondeobjetos;

/**
 *
 * @author avata
 */
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    
    
    
}
