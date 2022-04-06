package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private Figure figure;
    private int faktor;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while(!exit) {
            readUserInput();
            updateState();
            printState();
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hier durchführen
    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
        inputGroesse();
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten
            switch (figureNr) {
                case 1:
                    figure = new FigureH(faktor);
                    break;
                case 2:
                    figure = new FigureL(faktor);
                    break;
                case 3:
                    figure = new FigureO(faktor);
                    break;
                case 4:
                    figure = new FigureO2(faktor);
                    break;
                case 5:
                    figure = new FigureI(faktor);
                    break;
                case 6:
                    figure = new FigureMinus(faktor);
                    break;
                default:
                    break;
            }
        }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
            if (figure != null) {
                output.println(figure);
            }
        }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            figureNr = input.nextInt();
            if (figureNr < 1 || figureNr > 6) {
                output.println("Dies ist keine gültige Grafik!");
            } else {
                break;
            }
        }while (true);
    }

    private void inputGroesse() {
        // Hier sehen Sie ein Größe für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do{
            output.println("Bitte wählen Sie eine Größe (1-3)");
            faktor = input.nextInt();
            if (faktor < 1 || faktor > 3) {
                output.println("Dies ist keine gültige Größe!");
            } else {
                break;
            }
        } while (true);
    }
}
