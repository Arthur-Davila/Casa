import java.util.Scanner;


public class ContaBancaria {
    public static char charToInt(int num){
        char car;
        car=num+'0';
        return car;
    }
    public static boolean valid(String conta){
        int i, bool = 0;
        int tam = conta.length();
       
        for(i=0;i<tam;i++){
            char temp = conta.charAt(i);


            if(Character.isDigit(temp)){
                bool++;


            }
        }
        if(bool !=6){
            return false;
        }
        else{
            return true;
           
        }
    }
    public static boolean calculate(String conta,char dig){
        int i,conf=0;
        char resto;
        int tam = conta.length();
        if('0'<=dig-'0'&&dig-'0'<='9'){
        conf = dig-'0';}
        int aux;
        char[] temp1 = new char[tam];
        int soma =0;
        for(i=0;i<tam;i++){
            temp1[i] = conta.charAt(i);
            
            soma = (temp1[i] *(int) Math.pow(2,i)+soma);
         
        }
        double rest = (soma%11);
        if(rest>=0&&rest<=9){
         resto = charToInt(rest);
        }
        else {
           
           resto = 'x';
           
        }
        if(resto == dig){
            return true;
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros da conta: ");
        String conta = sc.nextLine();
        System.out.println("Digite o digito verificador da conta: ");
        char dig = sc.next().charAt(0);
        boolean valid1 = valid(conta);
        boolean calculate1 = calculate(conta, dig);
        if(valid1){
            if(calculate1){
                System.out.println("Conta/digito verificador válido.");
            }
            else{
                System.out.println("Conta/digito verificador inválido.");
            }


    }else{
    System.out.println("Conta inválida.");
}
}
}
