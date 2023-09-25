import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukan gaji bulanan: ");
            double gaji = input.nextDouble();

            if (gaji < 0){
                throw new IllegalArgumentException("Gaji tidak boleh negatif");
            }

            double gajiTahunan = gaji * 12;
            System.out.println("Gaji tahunan: " + gajiTahunan);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Input yang Anda masukan tidak valid");
        }
        catch (IllegalArgumentException e){
            System.out.println("Kesalaham: " + e.getMessage());
        }
        finally {
            input.close();
            System.out.println("Program selesai");
        }
    }
}
