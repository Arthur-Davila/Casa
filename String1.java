package P2;


import java.util.Scanner;


public class String1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String cripto = "";
        int i,tam=frase.length();
       
       
        for(i=0;i<tam;i++){
            char cript = frase.charAt(i);
            if(cript == 'a'){
               cripto = cripto+"@";
            }
            else if(cript == 'e'){
                cripto = cripto+"$";
            }else if(cript == 'i'){
                cripto = cripto+"&";
            }else if(cript == 'o'){
                cripto = cripto+"*";
            }else if(cript == 'u'){
                cripto = cripto+"#";
            }
            else{
                cripto = cripto+frase.charAt(i);
            }
           
           
        }
        System.out.println(cripto);
    }
   
}
