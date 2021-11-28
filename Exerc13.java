import java.util.*;
 class Exerc13{
     public static void main(String[]args){
         int anoN,anoact;
         Scanner ler=new Scanner(System.in);
         System.out.print("Ano de nascimento: ");
         anoN=ler.nextInt();
         System.out.print("Informe o ano actual: ");
         anoact=ler.nextInt();
         System.out.println("Idade actual:"+(anoact-anoN));
         System.out.print("sua idade em 2050: "+((anoact-anoN)+50));
     }
 }