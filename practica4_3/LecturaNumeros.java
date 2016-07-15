/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author SPPDF
 */
public class LecturaNumeros extends BufferedReader implements LecturaService {
    
    public LecturaNumeros(){
        super(new InputStreamReader(System.in));
    }
    
    public LecturaNumeros(Reader in) {
        super(in);
    }
    
    @Override
    public int readInt() throws IOException{
        int input;
        input = Integer.parseInt(super.readLine());
        return input;
    }
    
    public int readInt(String msg) throws IOException{
        System.out.println(msg);
        int input = this.readInt();
        return input;
    }
    
    @Override
    public Integer readInteger () throws IOException{
        Integer input;
        input = new Integer(this.readLine());
        return input;
    }
    
    public Integer readInteger(String msg) throws IOException{
        System.out.println(msg);
        return this.readInteger();
    }
    
    @Override
    public Double readDouble() throws IOException{
        return new Double(super.readLine());
    }
    
    public Double readDouble(String msg) throws IOException{
        System.out.println(msg);
        return this.readDouble();
    }
    
}
