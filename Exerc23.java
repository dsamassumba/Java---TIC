import java.util.Scanner;
class Exerc23{
    public static void main(String[]args){
        float peso;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o seu peso: ");
        peso=ler.nextFloat();
        System.out.println("O novo peso se engordar: "+(((peso*15)/100)+peso));
          System.out.println("O novo peso se emagrecer: "+(peso-((peso*20)/100)));
    }
}