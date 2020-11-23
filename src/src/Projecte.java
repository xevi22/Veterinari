import java.util.Scanner;

public class Projecte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String informacio [][] = new String[100][5];
        String edat [][] = new String[4][2];
        String vacunas [][] = new String[100][7];


        int resposta;
        String resposta1;
        int numClients=0;
        String comentari;
        String dniBusacar;
        boolean pare=true;

        for(int i=0; i<informacio.length;i++){
            for (int j=0; j<informacio[0].length; j++){
                informacio[i][j]= "-";
            }
        }
        /*
        for(int i=0; i<vacunas.length;i++){
                informacio[i][0]= "-";
                informacio[i][1]= "Moquillo";
                informacio[i][2]= "Parvovirosis";
                informacio[i][3]= "Hepatitis";
                informacio[i][4]= "Leptospirosis";
                informacio[i][5]= "Parainfluenza";
                informacio[i][6]= "Rabia";
        }*/




        while(pare){
        System.out.println("    ▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
        System.out.println("    ▨▨▨▨Veterinari▨▨▨▨");
        System.out.println("    ▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
        System.out.println();
        System.out.println("    1.Revisio anual del gos");
        System.out.println("    2.Comprovar si estas registrat");
        System.out.println("    3.Vens per posar una vacuna al teu gos");
        System.out.println("    4.Tens una urgència");
        System.out.println("    5.Altre");
        System.out.println();
        System.out.print("  Escull la opcio per la qual has vingut(0 per sortir): ");
        resposta = sc.nextInt();

        switch (resposta) {
            case 0:
                pare=false;
                break;
            case 1:
                System.out.println();
                System.out.print("  Ets client de la clínica (si o no)?");
                resposta1 = sc.next();

                    if (resposta1.equalsIgnoreCase("si")) {
                        System.out.println();
                        System.out.println("Perfecte, donç ves a la sala d'espera.");

                    } else if (resposta1.equalsIgnoreCase("no")) {
                        System.out.println("Donç fes-te client !!");
                        sc.nextLine();

                        System.out.print("Escriu el teu DNI: ");
                        informacio[numClients][0] = sc.nextLine();

                        System.out.print("Escriu el teu nom: ");
                        informacio[numClients][1] = sc.nextLine();

                        System.out.print("Escriu el teu cognom: ");
                        informacio[numClients][2] = sc.nextLine();

                        System.out.print("Escriu el teu telefon: ");
                        informacio[numClients][3] = sc.nextLine();

                        System.out.print("Escriu el nom del teu gos: ");
                        informacio[numClients][4] = sc.nextLine();
                        numClients++;
                        System.out.println("Usuari desat.");
                        sc.nextLine();
                        System.out.println();

                    } else {
                        System.out.println("Error");
                        sc.nextLine();
                        System.out.println();
                    }
                break;

            case 2:
                System.out.println();
                System.out.print("  Per comprovar que el teu usuari sha desat correctament introdueix el teu DNI: ");
                dniBusacar = sc.next();
                for (int i = 0; i<informacio[0].length; i++) {
                    if (informacio[i][0].equalsIgnoreCase(dniBusacar)) {
                        System.out.println("  "+informacio[i][1] + " " + informacio[i][2] + " ja estas registrat!!");
                        sc.nextLine();

                    } else {
                        System.out.println();
                        System.out.println("    No estas registrat");
                        sc.nextLine();
                        System.out.println();

                    }
                    break;
                }
                break;
            case 3:
                System.out.println();
                System.out.println("VACUNES ");
                System.out.println("1-⬜  Moquillo");
                System.out.println("2-⬜  Parvovirosis");
                System.out.println("3-⬜  Hepatitis");
                System.out.println("4-⬜  Leptospirosis");
                System.out.println("5-⬜  Parainfluenza");
                System.out.println("6-⬜  Rabia");
                System.out.println("El teu gos de que està vacunat(Exemple: 1-5-3)?");
                sc.nextLine();
                break;
            case 4:
                break;
            case 5:
                System.out.println("Escriu un comentari: ");
                comentari = sc.nextLine();

                break;
        }

        }
    }
}
