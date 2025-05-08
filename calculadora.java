import java.util.Scanner;
public class calculadora{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("que quieres hacer?");
System.out.println("1 = Suma");
System.out.println("2 = Resta");
System.out.println("3 = multiplicacion");
System.out.println("4 = Division");
int operacion=sc.nextInt();
int num1,num2;
int res;
System.out.println("ingresa tu primer numero");
num1=sc.nextInt();
System.out.println("ingresa tu segundo numero");
num2=sc.nextInt();

}

public double suma(double a, double b){
    double resultado;
    resultado = a + b;
    return resultado;
}

public double resta (double x, double y){
    double res=0;
    res = x-y; 
    return res;
}

public double Multiplicacion(int num1,int num2){
    double res=0;
    res=num1*num2;
    return res;
}

public double division(double a, double b){
    double resultado;
    resultado = a/b;
    return resultado;
}
}