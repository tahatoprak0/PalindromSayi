//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
public class PalindromSayi {
    public static void main(String[] args) {
        System.out.println(isPalindrom(4004));
    }

    private static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            //son basamağı tutar
            lastNumber = temp % 10;
            //sayının tersini oluşturmaya yarayan algoritma
            reverseNumber= (reverseNumber*10)+lastNumber;
            //basamakları tek tek azaltır
            temp/=10;
        }
        if (reverseNumber==number)
            return true;
        else return false;
    }
}
