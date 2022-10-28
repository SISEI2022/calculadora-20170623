package miPaquete;
import java.util.Scanner;
import java.lang.Math;
public class Principal
{
    public static void main(String[] args)
    {
        
            
          Scanner leer=new Scanner(System.in);
         System.out.println("Inserte el valor de x");
          int x = leer.nextInt();
         System.out.println("Inserte el valor de y");
          int y = leer.nextInt();

        Calculadora c = new Calculadora();
        System.out.println("MI CALCULADORA");
        System.out.println("==============");

        System.out.println("Valor de x, "+ x +", Valor de y, "+ y + " su suma =" + c.suma(x, y));
        System.out.println("Valor de x, "+ x +", Valor de y, "+ y + " su resta =" + c.resta(x, y));
        System.out.println("Valor de x, "+ x +", Valor de y, "+ y + " su multipicacion =" + c.multiplica(x, y));
        System.out.println("Valor de x, "+ x +", Valor de y, "+ y + " su divicion =" + c.divide(x, y));
        System.out.println("Valor de x, "+ x +", Valor de y, "+ y + " su modulo =" + c.modulo(x, y));
    } 
}