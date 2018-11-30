package Task2;
import java.io.*;

public class Rivnyanya {
    public static void main(String[] args) throws IOException {
        InputStreamReader inA = null;
        InputStreamReader inB = null;
        InputStreamReader inC = null;
        try {
            inA = new InputStreamReader(System.in);
            BufferedReader brA = new BufferedReader(inA);
            System.out.println("Введіть змінну <a>");
            String a1 = brA.readLine();
            double a = Double.parseDouble(a1);
            inB = new InputStreamReader(System.in);
            BufferedReader brB = new BufferedReader(inB);
            System.out.println("Введіть змінну <b>");
            String a2 = brB.readLine();
            double b = Double.parseDouble(a2);
            inC = new InputStreamReader(System.in);
            BufferedReader brC = new BufferedReader(inC);
            System.out.println("Введіть змінну <c>");
            String a3 = brC.readLine();
            double c = Double.parseDouble(a3);
            double x1 = (((Math.sqrt(b*b-4*a*c))-b)/(2*a));
            double x2 = ((((Math.sqrt(b*b-4*a*c))*(-1))-b)/(2*a));
            System.out.println("X1 = " + x1 + "\n" + "X2 = " + x2);
//            System.out.println(a + "\n" + b + "\n" + c);
        } catch (Exception e) {
            System.out.println("Введіть змінні правильно");
        } finally {
            if (inA != null) {
                inA.close();
            }
            {
                if (inB != null) {
                    inB.close();
                }
                {
                    if (inC != null) {
                        inC.close();
                    }
                }

            }
        }
    }
}