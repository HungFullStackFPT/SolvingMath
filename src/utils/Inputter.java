
package utils;

import java.util.Scanner;

public class Inputter {

    Scanner sc = new Scanner(System.in);

    public float getInputFloat(String msg) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg + ": ");
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }

        }
    }

    public String getString(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getString'");
    }
}
