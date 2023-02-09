import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,type,discount;
        double unit =0.10, count;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = scan.nextInt();

        if(distance<=0 || age <=0 || type>2 || type<1) {
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            if(age<12){
                count=distance*unit*0.50;
            }else if(age>=12 && age<=24){
                count=distance*unit*0.90;
            }else if(age>65){
                count=distance*unit*0.70;
            }else{
                count=distance*unit;
            }

            if(type==2){
                count=count*0.80*2;
            }
            System.out.println("Toplam tutar : " + count );
        }



    }
}