package MatematikaBaruBeraksi;

public class MatematikaBaru{

    //penambahan
    public static int tambah(int a, int b){
        return a + b;
    }

    //pengurangan
    public static int kurang(int a, int b){
        return a - b;
    }

    //perkalian
    public static int kali(int a, int b){
        return a * b;
    }

    //pembagian
    public static double bagi(double a, double b){
        if(b != 0){
            return a / b;
        } 
        else {
            System.out.println("Error!");
            return Double.NaN;
        }
    }
}