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
        Insertion<String> insertion = new Insertion();
        List list = new List();
        Anchor IntNum;
        String out="[";
        
        while(!file.isEndOfFile()){
            String line =file.readLine();
            line = line.substring(line.indexOf(" ")+1);
            String temp[] = line.split("LI");
            String arrayLine [][] = new String[temp.length][];
            
            //separa e ordena os números de forma decrescente
            for(int i=0;i<temp.length;i++){
                arrayLine[i] = temp[i].trim().split(" ");
                insertion.sort(arrayLine[i]);
            }
            
            
            //cria e atribuí, a uma âncora do tipo inteiro, satélites do tipo float
            for(int i=0;i<arrayLine[0].length;i++){
                int numInt = Integer.parseInt(arrayLine[0][i]);
                IntNum = new Anchor(numInt,arrayLine[1].length+1);
                for(int j=0;j<arrayLine[1].length;j++){
                    float numFloat = Float.parseFloat(arrayLine[1][j]);
                    float diference = numFloat-numInt;
                    if(diference>=0 && diference<1){
                        IntNum.addSatellite(numFloat);
                    }
                }
                list.add(IntNum);
            }
            String aux = list.print();
            aux  = aux .substring(0,aux.length()-2);
            out = out + aux  +"]\n";
        }
        out = out.substring(0,out.length()-1);
        file.print(out);
        file.close();
    }
}