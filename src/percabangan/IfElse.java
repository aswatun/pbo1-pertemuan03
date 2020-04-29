package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, Kurangi jajan anda..");
        }else{
            System.out.println("Uang cukup, Selamat menikmati..");
        }
    }
}
