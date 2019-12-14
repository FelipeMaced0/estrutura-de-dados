/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Macedo
 */
public class L1Q1 {
    
    public static String toString(Array Lists[]){
        Array subList;
        int element;
        int count=0;
        String out = "";
        int k;
        for(int i=0;i<Lists.length;i++){
            out = out + "start ";
            subList = Lists[i];
            
            for(int j=0;j<subList.length();j++){
                element=subList.get(j);
                out = out + String.valueOf(element);

                for(k = j;k<subList.length();k++){
                    if(element != subList.get(k)){
                        break;
                    }
                }
                count = k-j;
                if(count>1){
                    out = out +"("+count+") "; 
                }
                else{
                    out = out + " ";
                }
                j = k-1;
            }
        }
        
        return out.trim();
    }
    
    public static Integer [] converterArray(String [] line){
        Integer arrayInt [] = new Integer[line.length];
        
        for(int i=0;i<line.length;i++){
            arrayInt[i] = Integer.parseInt(line[i]);
        }
        return arrayInt;
    }
    
    public static void printArray(Array array []){
        String a ="[";
        for(int i=0;i<array.length;i++){
            a+="[";
            for(int j=0;j<array[i].length();j++){
                a+= String.valueOf(array[i].get(j));
                if(j<array[i].length()-1){
                    a+=",";
                }
            }
            a+="]";
            if(i<array.length-1){
                a+=",";
            }
        }
        a+="]";
        System.out.println(a);
    }
    
    
    public static void main(String [] args){
        Arquivo file = new Arquivo("src/L1Q1.in","src/L1Q1.out");
        Insertion<Integer> integers = new Insertion();
        Insertion<Array> arrays = new Insertion();
        String out ="";
        
        while(!file.isEndOfFile()){
            String line = file.readLine();
            line = line.substring(line.indexOf(" ")+1);
            String arrayLine [] = line.split("start ");
            Array allLists []= new Array[arrayLine.length];
            
            //separa e ordena os elementos das subListas
            for(int i=0;i<arrayLine.length;i++){
                String stringArray [] = arrayLine[i].trim().split(" ");
                Integer subList [] =  converterArray(stringArray);
                integers.reverseSort(subList);
                allLists [i] = new Array(subList);
                
            }
            //Ordena as listas pela soma
            arrays.sort(allLists);
            out += toString(allLists)+"\n";
        }
        out = out.substring(0,out.length()-1);
        file.print(out);
        file.close();
    }
}
