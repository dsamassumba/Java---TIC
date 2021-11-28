import java.util.Scanner;
class Exerc28{
    public static void main(String[]args){
        float salario;
        int horas;
        Scanner ler =new Scanner(System.in);
        System.out.print("Informe o salario minimo: ");
        salario=ler.nextFloat();
        System.out.print("Informe horas trabalhadas: ");
        horas=ler.nextInt();
        float horastraba=salario/2;
        float salariob=horastraba*horas;
        float imposto=(salariob*3)/100;
        System.out.print("Salario a receber: "+(salariob-((salario*3)/100)));
    }
}