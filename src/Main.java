public class Main {
    public static int devide(int num1, int num2)
    {
        if (num2 == 0){
            throw new ArithmeticException("Tidak dapat melakukan pembagian");
        }
        return num1 / num2;
    }

    public static void main(String[] args){
        try {
            int hasilPembagian = devide(10,2);
            System.out.println("Hasil pembagian: " + hasilPembagian);
        }
        catch (ArithmeticException e){
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
    }

}