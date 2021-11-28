import java.util.Scanner;
 class Exerc16{
     public static void main(String[]args){
         int pe;
         Scanner ler=new Scanner(System.in);
         System.out.print("Informe o valor em pé: ");
         pe=ler.nextInt();
         System.out.println("Polegadas: "+(pe*12));
         System.out.println("Jardas: "+((pe)/3));
         System.out.println("Milhas: "+(3*1760));

     }
 }