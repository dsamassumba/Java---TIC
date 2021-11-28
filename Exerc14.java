import java.util.*;
class Exerc14{
    public static void main(String []args){
        int anodenascimento,anoactual;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o ano actual: ");
        anoactual=ler.nextInt();
        System.out.print("Informe o ano de nascimento: ");
        anodenascimento=ler.nextInt();
        System.out.println("A sua idade em anos:"+(anoactual-anodenascimento));  
        System.out.println("A sua idade em meses: "+((anoactual-anodenascimento)*12));
        System.out.println("A sua idade em dias: "+((anoactual-anodenascimento)*365)); 
        System.out.println("A sua idade em semanas: "+((anoactual-anodenascimento)*12*4));    
    }
}