import java.util.Scanner;

/*
Titel: Rechteck Eingabe der Seiten und Flächenberechnung
Autor: Gerhard Jarz      | 05.05.2026
 */
public class Main {
    public static void main(String[] args) {
        int height, width, area, decision;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wollen sie (1)Rechteck, (2)Dreieck oder (3)Kreis berechnen? ");
        decision = scan.nextInt();
        switch (decision) {
            case 1:     System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
                        height = scan.nextInt();
                        System.out.print("Geben Sie die Breite ein: ");
                        width = scan.nextInt();
                        area = height * width;
                        System.out.println("Die Fläche des Rechtecks beträgt: " + area);
                        break;
            case 2:
            case 3:     System.out.println("Funktion noch nicht verfügbar.");
                        break;
            default:    System.out.println("Falsche Eingabe!");
        }

    }
}