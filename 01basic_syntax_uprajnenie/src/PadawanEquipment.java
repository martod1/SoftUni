import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //•	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
    //•	The count of students – integer in range [0…100]
    //•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
    //•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
    //•	The price of belts for a single belt – floating-point number in range [0.00…100.00]

        double amountMoney = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double pricePerLightsaber = Double.parseDouble(sc.nextLine());
        double pricePerRobe = Double.parseDouble(sc.nextLine());
        double pricePerBelt = Double.parseDouble(sc.nextLine());

        double lightsabersPrice = Math.ceil(studentsCount * 1.10) * pricePerLightsaber;
        double robePrice = pricePerRobe * studentsCount;
        int beltsFree = studentsCount / 6;
        double beltPrice = (pricePerBelt * (studentsCount - beltsFree));
        double totalPrice = lightsabersPrice + robePrice + beltPrice;

        if (amountMoney >= totalPrice){
            System.out.println(String.format("The money is enough - it would cost %.2flv.",totalPrice));
        }
        else {
            System.out.println(String.format("Ivan Cho will need %.2flv more.",totalPrice - amountMoney));
        }

    }
}
