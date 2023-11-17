import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class DENEME {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18 , kdvtutar , kdvliTutar ;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz  : ") ;
        tutar = input.nextDouble();


        kdvtutar = tutar * kdvOran ;
        kdvliTutar = tutar+kdvtutar;


        System.out.println("KDV'siz Tutar  :" + tutar   );
        System.out.println("KDV ORANI  :"  + kdvOran  );
        System.out.println("KDV Tutarı :"  + kdvtutar );
        System.out.println("KDV'li Tutarı  :" + kdvliTutar );





    }
}
