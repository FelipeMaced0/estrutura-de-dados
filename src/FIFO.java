
/**
 *
 * @author Felipe Macedo
 */
public class FIFO  {
    Float elements [];
    int head;
    int tail;
    
    public FIFO(int Max){
        elements = new Float[Max];
        head = 0;
        tail = 0;
    }
    
    public FIFO(){
        head = 0;
        tail = 0;
    }
    
    public void setLength(int Max){
        elements = new Float[Max];
    }
    
    public void add(float element){
        if(!this.isFull()){
            elements[tail] = element;
            tail = (tail+1)%elements.length;
        }
    }
    
    public Float sub(){
        if(!this.isEmpty()){
            float x = elements[head];
            head = (head+1)%elements.length;

            return x;
        }
        return null;
    }
    
    public boolean isEmpty(){
        return head == tail;
    }
    
    public boolean isFull(){
        return (tail+1)%elements.length==head;
    }
    
    public String print(){
        String out="";
        int index = head;
        
        while(index!=tail){    
            out += String.valueOf(elements[index])+"->";
            index = (index+1)%elements.length;
        }
        return out;
    }
    
    public static void main(String [] args){
        FIFO c = new FIFO(4);
        
        c.add(1);
        c.add(2);
        c.add(3);
        
    }
}
