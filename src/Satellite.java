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
public class Satellite<T>{
    T key;
    Satellite next;
    Satellite prev;
    
    public Satellite(T value){
        this.key = value;
    }
    
    public Satellite(T value, Satellite next, Satellite previus){
        this.key = value;
        this.next = next;
        this.prev = previus;
    }
    
    public T getValue(){
        return key;
    }
    
    public void setNext(Satellite next){
        this.next = next;
    }
    
    public void setPrevius(Satellite previus){
        this.prev = previus;
    }
    
    public Satellite getNext(){
        return next;
    }  
    
    public Satellite getPrevius(){
        return prev;
    }
    
    @Override
    public String toString(){
        return String.valueOf(key)+"->";
    }
}