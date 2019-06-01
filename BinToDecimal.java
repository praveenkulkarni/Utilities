import java.util.*;
import java.io.*;

public class BinToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid binary number : ");
        String binary = sc.next();
        if(validateInput(binary)){
            System.out.println("Decimal equivalent : " + getDecimal(binary));
        }else{
            System.out.println("Please enter valid binary number.");
        }

    }

    private static String getDecimal(String binary){
        long decimal = 0;
        int base = 2;
        int len = binary.length();
        for(int i = len - 1 ; i >= 0 ; i--){
            decimal += (Math.pow(base, len - 1 - i)) * (binary.charAt(i) - '0');
        }
        return String.valueOf(decimal);
    }

    private static boolean validateInput(String binary){
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i) != '0' && binary.charAt(i) != '1')
                return false;
        }
        return true;
    }
}