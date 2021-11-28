import java.util.Scanner;
class Exerc21{
public static void main(String[]args){
    float salario,D,A;
    Scanner ler=new Scanner(System.in);
    System.out.print("Informe o seu salario base: ");
    salario=ler.nextFloat();
    D=(salario*7)/100;
    A=(salario*5)/100;
    System.out.print("Salario a receber: "+((salario-D)+A));
}
}