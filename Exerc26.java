import java.util.Scanner;
class Exerc26{
    public static void main(String[]args){
        int x;
        Scanner ler =new Scanner(System.in);
        System.out.print("Informe o valor: ");
        x=ler.nextInt();
        System.out.println("Quadrado: "+(Math.pow(x,2)));
         System.out.println("Cubo: "+(Math.pow(x,3)));
          System.out.println("Raiz Quadrada: "+(Math.sqrt(x)));
           System.out.println("Raiz Cubica:  "+(Math.pow(x,1/3)));
    }
}