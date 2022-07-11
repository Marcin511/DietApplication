package Diet;
import java.util.Scanner;
public class DietCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person human = new Person();
        Activity active = new Activity();
        double kcal = 0;
        double totalKcal = 0;
        double totalTarget;
        System.out.println("podaj wzrost: ");
        human.setHeight(s.nextInt());
        System.out.println("podaj wage ");
        human.setWeight(s.nextFloat());
        System.out.println("podaj wiek: ");
        human.setAge(s.nextInt());
        System.out.println("wybierz płeć :");
        System.out.println("1 - Mężczyzna ");
        System.out.println("2 - Kobieta ");
        int choice = s.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Twoje zapotrzebowanie to : " + human.manKcal() + " Kcal");
                kcal = human.manKcal();
            }
            case 2 -> {
                System.out.println("Twoje zapotrzebowanie to : " + human.womanKcal() + " Kcal");
                kcal = human.womanKcal();
            }
            default -> System.out.println("niewłaściwy wybór");
        }
        System.out.println("Wybierz aktywność :");
        System.out.println("bardzo niska aktywność - leżenie : 1");
        System.out.println("niska aktywność - praca za biurkiem : 2");
        System.out.println("średnia aktywność - lekka praca fizyczna lub praca biurowa i treningi 2-3 razy w tygodniu : 3");
        System.out.println("wysoka aktywność - praca fizyczna lub treningi 3-5 razy w tygodniu : 4");
        System.out.println("bardzo wysoka aktywność - cięzka praca fizyczna lub treningi conajmiej 5 razy w tyfgodniu : 5");
        int activity = s.nextInt();
        switch (activity) {
            case 1 -> {
                totalKcal = kcal * active.getActiveVeryLow();
                System.out.println("Twoje dzienne zapotrzebowanie przy obecnej aktywności to : " + totalKcal + " kcal");
            }
            case 2 -> {
                totalKcal = kcal * active.getActiveLow();
                System.out.println("Twoje dzienne zapotrzebowanie przy obecnej aktywności to : " + totalKcal + " kcal");
            }
            case 3 -> {
                totalKcal = kcal * active.getActiveMid();
                System.out.println("Twoje dzienne zapotrzebowanie przy obecnej aktywności to : " + totalKcal + " kcal");
            }
            case 4 -> {
                totalKcal = kcal * active.getActiveHigh();
                System.out.println("Twoje dzienne zapotrzebowanie przy obecnej aktywności to : " + totalKcal + " kcal");
            }
            case 5 -> {
                totalKcal = kcal * active.getActiveVeryHigh();
                System.out.println("Twoje dzienne zapotrzebowanie przy obecnej aktywności to : " + totalKcal + " kcal");
            }
            default -> System.out.println("wartość niewłaściwa");
        }
        System.out.println("Wybierz cel");
        System.out.println("Chce schudnąć : 1");
        System.out.println("Chce zbudować masę mięścniową : 2");

        int target = s.nextInt();
        switch (target) {
            case 1 -> {
                totalTarget = totalKcal - active.activeChoiceReduce();
                if (totalTarget < kcal) {
                    totalTarget = totalKcal + active.activeChoiceBodyBuild();
                    System.out.println("To zbyt mała ilość kcal aby redykować zwiększ aktywność i spożywaj: " + totalTarget + " kcal");
                } else {
                    System.out.println("Aby redukować spożywaj: " + totalTarget + " kcal");
                }
            }
            case 2 -> {
                totalTarget = totalKcal + active.activeChoiceBodyBuild();
                System.out.println("Aby budować masę mięśniową spożywaj: " + totalTarget + " kcal");
            }
            default ->
                 System.out.println("wartość niewłaściwa");

        }
    }
}
