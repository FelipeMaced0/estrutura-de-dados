/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Macedo
 */
public class List {
    Anchor head;

    public List() {
    }
    
    public void add(Anchor x){
        x.next = head;
        if(head!=null){
            head.prev = x;
        }
        head = x;
        x.prev = null;
    }
    
    public void sub(Anchor x){
        if(x.prev!=null){
            x.prev.next = x.next;
        }
        else{
            head = x.next;
        }
        if(x.next!=null){
            x.next.prev = x.prev;
        }
    }
    
    public String print(){
        Anchor x = head;
        String s="";
        while(x!=null){
            s+=x;
            x = x.next;
        }
        return s;
    }
}
