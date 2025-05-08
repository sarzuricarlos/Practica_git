public class calculadora{
public static void main(String args[]){

System.out.println("que quieres hacer?");
System.out.println("Suma");
System.out.println("Resta");
System.out.println("multiplicacion");
System.out.println("Division");

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