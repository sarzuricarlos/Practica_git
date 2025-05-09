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
double num1,num2;
double res;
System.out.println("ingresa tu primer numero");
num1=sc.nextInt();
System.out.println("ingresa tu segundo numero");
num2=sc.nextInt();
switch(operacion){
case 1:
res=suma(num1,num2);
System.out.println("Tu resultado es : "+res);
break;
case 2:
res=resta(num1,num2);
System.out.println("Tu resultado es : "+res);
break;
case 3:
res=Multiplicacion(num1,num2);
System.out.println("Tu resultado es : "+res);
break;
case 4:
res=division(num1,num2);
System.out.println("Tu resultado es : "+res);
break;
}
}

public static double suma(double a, double b){
    double resultado;
    resultado = a + b;
    return resultado;
}

public static double resta (double x, double y){
    double res=0;
    res = x-y; 
    return res;
}

public static double Multiplicacion(double num1,double num2){
    double res=0;
    res=num1*num2;
    return res;
}

public static double division(double a, double b){
    double resultado;
    resultado = a/b;
    return resultado;
}
}