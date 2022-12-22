import java.util.Scanner;

package IdeaProjects.java101.out.production;


public class odev2 {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutari,  kdv1 = 0.18, kdv2 = 0.08, toplamTutar;
        Scanner inp = new Scanner(System.in); 
        String degerGir = "Tutarı gir: ";

        System.out.print(degerGir);
        tutar = inp.nextDouble();

        kdvOrani = tutar < 1000 ? kdv1 :  kdv2;
        kdvTutari = tutar < 1000 ? tutar * kdv1 : tutar * kdv2;
        toplamTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("Toplam Tutar: " + toplamTutar);
    
}
