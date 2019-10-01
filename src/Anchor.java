/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Macedo
 * @param <T>
 */
public class Anchor<T>{
    T key;
    Anchor next;
    Anchor prev;
    circularList satellites;
    
    public Anchor(T value, int Max){
        this.key = value;
        satellites = new circularList(Max);
    }
    
    public Anchor(T value, Anchor next, Anchor previus){
        this.key = value;
        this.next = next;
        this.prev = previus;
    }
    
    public T getValue(){
        return key;
    }
    
    public void setNext(Anchor next){
        this.next = next;
    }
    
    public void setPrevius(Anchor previus){
        this.prev = previus;
    }
    
    public Anchor getNext(){
        return next;
    }  
    
    public Anchor getPrevius(){
        return prev;
    }
    
   public void addSatellite(Float x){
        satellites.add(x);
    }
    
    public void subSatellite(){
        satellites.sub();
    }
    
    @Override
    public String toString(){
        String satellRepre = satellites.print();
        if(satellRepre.length()>=2){
            satellRepre = "("+satellRepre.substring(0,satellRepre.length()-2)+")";
        }
        
        System.out.println(key);
        return String.valueOf(key)+satellRepre+"->";
   }
}