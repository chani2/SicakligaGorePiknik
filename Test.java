import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz : ");
        heat = input.nextInt();

        if (heat<5){
            System.out.print("Kayak yapabilirsiniz. ");
        }else if ((heat>=5) && (heat<=25)) {
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >=10){
                System.out.println("Pikgine gidebilirsiniz");
            }
        }else{
            System.out.print("Yuzmeye gidebilirsiniz");
        }















































    }
}
