/**
 *
 * @author Felipe Macedo
 * @param <T>
 */
public class Insertion <T extends Comparable>{
    
    
    
    public void sort(T elements []){
        
        for(int i=1;i<elements.length;i++){
            T key = elements[i];
            int j = i-1;
            while(j>=0 && elements[j].compareTo(key)>0){
                elements[j+1] = elements[j];
                j=j-1;
            }
            elements[j+1] = key;
        }
    }
    
    public void reverseSort(T elements []){
        
        for(int i=1;i<elements.length;i++){
            T key = elements[i];
            int j = i-1;
            while(j>=0 && elements[j].compareTo(key)<0){
                elements[j+1] = elements[j];
                j=j-1;
            }
            elements[j+1] = key;
        }
    }
    
    public void printArray(T elements []){
        
        String array="[";
        for(int i=0;i<elements.length;i++){
            if(i<elements.length-1){
                array += elements[i]+", ";
            }
            else{
                array += elements[i]+"]";
            }
        }
        System.out.println(array);
    }
}