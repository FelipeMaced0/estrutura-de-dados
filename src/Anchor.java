/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 * @param <T>
 */ 
public class Anchor <T> extends Satellite{

    List satellites;
    
    public Anchor(T value){
        super(value);
        satellites = new List();
    }
    
    public Anchor(T value, Satellite next, Satellite previus){
        super(value,next,previus);
    }
    
    public void addSatellite(Satellite x){
        satellites.add(x);
    }
    
    public void subSatellite(Satellite x){
        satellites.sub(x);
    }
    
    @Override
    public String toString(){
        String satellRepre = satellites.print();
        satellRepre = satellRepre.substring(0,satellRepre.length()-2);
        return String.valueOf(key)+"("+satellRepre+")->";
   }
}