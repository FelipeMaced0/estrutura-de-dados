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
public class Utilites <T>{
    
    public void printArray(T array [][]){
        String a ="[";
        for(int i=0;i<array.length;i++){
            a+="[";
            for(int j=0;j<array[i].length;j++){
                a+= String.valueOf(array[i][j]);
                if(j<array[i].length-1){
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
        Integer b [][] = {{1,2,3},{3,2,1}};
        Utilites a = new Utilites();
        a.printArray(b);
    }
}
