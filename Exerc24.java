import java.util.Scanner;
class Exerc24{
    public static void main(String[]args){
        float salario,D;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o seu salario: ");
        salario=ler.nextFloat();
        D=(salario*10)/100;
        System.out.print("Salario a receber: "+((salario-D)+50));
    }
}