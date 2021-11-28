import java.util.*;
class Exerc19{
    public static void main(String[]args){
        int pezo;
        Scanner ler =new Scanner(System.in);
        System.out.print("Informeo seu peso: ");
        pezo=ler.nextInt();
        System.out.print("Peso em gramas: "+(pezo*1000));
    }
}