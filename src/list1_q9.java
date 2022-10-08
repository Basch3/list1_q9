import java.util.Scanner;

public class list1_q9 
{
    public static void main(String[] args) throws Exception
    {
        double fahrenheit, celsius;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o valor em Fahrenheit : ");
        fahrenheit = teclado.nextDouble();

        celsius = 5*((fahrenheit-32)/9);
        System.out.print("Em Celsius: " +celsius);
        teclado.close();
    } 

}