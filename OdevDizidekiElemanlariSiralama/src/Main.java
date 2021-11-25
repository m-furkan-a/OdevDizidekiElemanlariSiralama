import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Dizinin Boyutunu Girin : ");
	    int kDizi = input.nextInt();
	    int[] dizi = new int[kDizi];

	    for (int i = 0; i < dizi.length; i++){
	        int eleman = 0;
	        System.out.print((i+1) + ". Elemanı : ");
	        eleman = input.nextInt();
	        dizi[i]=eleman;
        }
	    Arrays.sort(dizi);
	    System.out.println(Arrays.toString(dizi));
    }
}
