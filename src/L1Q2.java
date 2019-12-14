/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Macedo
 */
public class L1Q2 {
    
    
    public static void main(String [] args){
        Arquivo file = new Arquivo("src/L1Q2.in","src/L1Q2.out");
        String out="";
        
        while(!file.isEndOfFile()){
            String names [] = file.readLine().split(" ");
            Stack stackNames = new Stack(names.length);
            Stack temp = new Stack(names.length);
            
            for(int i=0;i<names.length;i++){
                int count = 0;
                
                while(!stackNames.isEmpaty()&&stackNames.getTopElement().compareTo(names[i])>0){
                    temp.push(stackNames.pop());
                    count = count+1;
                }
                
                if(count>0){
                    out = out + count + "x-pop ";
                }
                
                stackNames.push(names[i]);
                out = out + "push-" + names[i] + " ";
                
                for(int j=0;j<count;j++){
                    String name = temp.pop();
                    out = out+ "push-" + name + " ";
                    stackNames.push(name);
                } 
            }
            out = out.trim() + "\n";
            
        }
        out = out.substring(0,out.length()-1);
        file.print(out);
        file.close();
    }
}