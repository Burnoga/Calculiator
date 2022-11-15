import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String calc(String input) throws Ex {
        System.out.println("Input ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.println("Output");
        Perevod perevod1=new Perevod();
        int a=0 , b=0, res=0;
        String  c = null;
        String [] array1 = {"I","II", "III","IV","V","VI","VII","VIII","IX","X"};

        String[] array2 = input.split("/|-|\\*|\\+");
        String[] array3 = input.split("/|-|\\*|\\+");

        if (array2.length ==2)  {
            if ((Arrays.asList(array1).contains(array2[0]) == true)&& (Arrays.asList(array1).contains(array3[1]) == true)) {
           // for (int i = 0; i < array1.length; i++) {
             //   if ((array2[0].equals(array1[i])) && (array2[0].equals(array1[i]))) {

                        Rome rome = Rome.valueOf(array2[0]);
                        array2[0] = rome.getTransformation();
                        Rome rome1 = Rome.valueOf(array2[1]);
                        array2[1] = rome1.getTransformation();}

          try {  a = Integer.parseInt(array2[0].trim());} catch (NumberFormatException e) {System.out.println("Доступны только числа одной системы счисления от 1 до 10 "); System.exit(1);}
          try {  b = Integer.parseInt(array2[1].trim());} catch (NumberFormatException e) {System.out.println("Доступны только числа одной системы счисления от 1 до 10"); System.exit(1);}

            if ((a > 0) && (a < 11) && (b > 0) && (b < 11)) {
                if (input.contains("/") == true) {
                    res = a / b;
                } else if (input.contains("-") == true) {
                    res = a - b;
                } else if (input.contains("*") == true) {
                    res = a * b;
                } else if (input.contains("+") == true) {
                    res = a + b;}

                }
            else  try{  throw new Ex("Доступны только числа от 1 до 10");}
            catch (Ex e) { System.out.println("Доступны только числа от 1 до 10");}

            if (Arrays.asList(array1).contains(array3[0]) == true) {
                  perevod1.perevod(res);             }
            else {System.out.print(res);                }}
        else  if (array2.length >2) try {  throw new Ex("Нужно вводить не более 2-х чисел");}
            catch (Ex e) { System.out.println("Нужно вводить не более 2-х чисел");  }
        else try {  throw new Ex("Доступны только операции '+', '-', '*', '/'");}
            catch (Ex e) { System.out.println("Доступны только операции '+', '-', '*', '/'");}
    return c;}

            public static void main (String[] args) throws Ex {

            String result = calc(" " );
        }
}



