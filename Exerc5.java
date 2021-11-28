import java.util.*;
class Exerc5{
    public static void main(String[]args){
        int a,b,c;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o primeiro nota: ");
        a=ler.nextFloat();
        System.out.print("Informe o segunda nota: ");
        b=ler.nextFloat();
        System.out.print("Informe o terceiro nota: ");
        c=ler.nextFloat();
        System.out.print("Media: "+((a+b+c)/3));
    }
}