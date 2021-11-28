import java.util.*;
class Exerc11{
    public static void main(String[]args){
        float salariof,salariom;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o salario do foncionario: ");
        salariof=ler.nextFloat();
        System.out.print("Informe o salario minimo: ");
        salariom=ler.nextFloat();
        System.out.print("Salarios minimos= "+(salariof/salariom));
    }
}