import java.util.*;
class Exerc12{
    public static void main(String[]args){
    float base,altura;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe a base:  ");
        base=ler.nextFloat();
        System.out.print("Informe a altura ");
        altura=ler.nextFloat();
        System.out.print("Area = "+(base*altura)/2);
    }
}