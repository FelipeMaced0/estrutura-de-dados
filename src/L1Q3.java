/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Macedo
 */
public class L1Q3 {
    
    public static Float [] paraArrayFloat(String stringValues[]){
        Float floatValues[] = new Float[stringValues.length] ;
        for(int i=0;i<floatValues.length;i++){
            floatValues[i] = Float.parseFloat(stringValues[i]);
        }
        return floatValues;
    }
    
    public static Integer [] paraArrayInt(String stringValues[]){
        Integer intValues[] = new Integer[stringValues.length] ;
        for(int i=0;i<intValues.length;i++){
            intValues[i] = Integer.parseInt(stringValues[i]);
        }
        return intValues;
    }
    
    
    public static void main(String [] args){
        Arquivo file = new Arquivo("src/L1Q3.in","src/L1Q3.out");
        Insertion insertion = new Insertion();
        List list = new List();
        Anchor IntNum;
        String out="[";
        
        while(!file.isEndOfFile()){
            String line = file.readLine();
            line = line.substring(line.indexOf(" ")+1);
            Integer intValues []={0};
            Float  floatValues []={0f};
            int le=line.indexOf("LE");
            String temp[];
            
            
            if(le==0){
                temp = line.split("LI");
            }
            else{
                temp = line.split("LE");
            }
            
            
            

            try{
                if(le==0){
                    intValues = paraArrayInt(temp[0].trim().split(" "));
                    floatValues = paraArrayFloat(temp[1].trim().split(" "));
                }
                else{
                    intValues = paraArrayInt(temp[1].trim().split(" "));
                    floatValues = paraArrayFloat(temp[0].trim().split(" "));
                }
            }catch(ArrayIndexOutOfBoundsException e){
            
            }
            insertion.reverseSort(intValues);
            insertion.sort(floatValues);
            
            
            
            //cria e atribuí, a uma âncora do tipo inteiro, satélites do tipo float
            for(int i=0;i<intValues.length;i++){
                int numInt = intValues[i];
                IntNum = new Anchor(numInt,floatValues.length+1);
                for(int j=0;j<floatValues.length;j++){
                    float numFloat = floatValues[j];
                    float diference = numFloat-numInt;
                    if(diference>=0 && diference<1){
                        IntNum.addSatellite(numFloat);
                    }
                }
                list.add(IntNum);
            }
            String aux = list.print();
            System.out.println(aux);
            int index = aux.lastIndexOf("->");
            if(index>0){
                aux  = aux .substring(0,index);
            } 
            out = out + aux  +"]\n";
        }
        out = out.substring(0,out.length()-1);
        file.print(out);
        file.close();
    }
}