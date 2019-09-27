
/**
 *
 * @author Felipe Macedo
 */
public class Array implements Comparable<Array>{
    private final Integer elements[];
    private int sum;
    
    public Array(Integer elements[]){
        this.elements = elements;
        this.Sum();
    }
    
    public void set(int index, Integer element){
        elements[index] = element;
    }
    
    public int get(int index){
        return elements[index];
    }
    
    public int getSum(){
        return sum;
    }
    
    public int length(){
        return elements.length;
    }
    
    public final void Sum(){
        for(int i=0;i<elements.length;i++){
            if(elements[i]>0){
                sum += elements[i];
            }
        }
    }
    
    @Override
    public int compareTo(Array A) {
        return this.getSum()-A.getSum();
    }
}
