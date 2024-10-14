import java.util.Scanner;

public class CalcoloArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vuoi calcolare l'area di un triangolo o di un rettangolo? (t/r): ");
        String area = scanner.nextLine();

        if (!area.equals("t") && !area.equals("r")) {
            System.out.println("Attenzione! Errore nel carattere");
        } else {
            System.out.print("Qual e' la base? ");
            double b = scanner.nextDouble();
            System.out.print("Qual e' l'altezza? ");
            double h = scanner.nextDouble();

            double areaT = (b * h) / 2;
            double areaR = b * h;

            if (area.equals("t")) {
                System.out.println("L'area del triangolo " + areaT);
            } else if (area.equals("r")) {
                System.out.println("L'area del rettangolo " + areaR);
            }
        }
        scanner.close();
    }
}
