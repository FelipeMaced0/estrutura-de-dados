/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe Macedo
 */
public class Stack {
    String names [];
    int MAX;
    int top;
    
    public Stack(int MAX){
        this.names = new String[MAX];
        this.MAX = MAX;
        top = -1;
    }
    
    public void push(String name){
        if(!this.isFull()){
            top = top+1;
            names[top] = name;
        }
    }
    
    public String pop(){
        if(!this.isEmpaty()){
            top = top-1;
            return names[top+1];
        }
        return null;
    }
   
    public String getAntecedent(){
        if(top>0){
            return names[top-1];
        }
        return null;
    }
    
    public String getTopElement(){
        if(top>=0){
            return names[top];
        }
        return null;
    }
    
    public int getTop(){
        return top;
    }
    
    public boolean isEmpaty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==MAX-1;
    }
    
    public void printTer(){
        for(int i = top; i>=0; i--){
            System.out.println(this.names[i]);
        }
    }
    
    public String print(){
        String a="";
        for(int i = top; i>=0; i--){
            a+= this.names[i]+"\n";
        }
        a += "\n";
        return a;
    }
}
