/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_3;

import java.io.IOException;

/**
 *
 * @author SPPDF
 */
public interface LecturaService {
    
    int readInt() throws IOException;
    
    Integer readInteger() throws IOException;
    
    Double readDouble() throws IOException;
    
}
