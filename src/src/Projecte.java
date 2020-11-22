import java.util.Scanner;

public class Projecte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String informacio [][] = new String[1000][4];
        String edat [][] = new String[4][2];
        //String vacunas [] = new String["Moquillo" , "  Parvovirosis"," Hepatitis","Leptospirosis","Parainfluenza","Rabia"];

        int resposta;
        String resposta1;

        String dniBusacar;

        System.out.println("    ▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
        System.out.println("    ▨▨▨▨Veterinari▨▨▨▨");
        System.out.println("    ▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
        System.out.println();
        System.out.println("    1.Revisio anual del gos");
        System.out.println("    2.Vens per posar una vacuna al teu gos");
        System.out.println("    3.Tens una urgència");
        System.out.println("    4.Altre");
        System.out.println();
        System.out.print("  Escull la opcio per la qual has vingut(0 per sortir): ");
        resposta = sc.nextInt();

        switch (resposta){
            case 0:
                break;
            case 1:
                System.out.println();
                System.out.print("Ets client de la clínica (si o no)?");
                resposta1=sc.next();
                if(resposta1.equalsIgnoreCase("si")){
                    System.out.println();
                    System.out.println("Perfecte, donç ves a la sala d'espera.");
                }else if(resposta1.equalsIgnoreCase("no")) {
                    System.out.println("Donç fes-te client !!");
                        sc.nextLine();

                        System.out.print("Escriu el teu DNI: ");
                        informacio[0][0]=sc.nextLine();

                        System.out.print("Escriu el teu nom: ");
                        informacio[0][1]=sc.nextLine();

                        System.out.print("Escriu el teu cognom: ");
                        informacio[0][2]=sc.nextLine();

                        System.out.print("Escriu el teu telefon: ");
                        informacio[0][3]=sc.nextLine();

                    System.out.println();
                    System.out.print("Per comprovar que el teu usuari sha desat correctament introdueix el teu DNI: ");
                    dniBusacar=sc.nextLine();
                    for(int i=0; i<informacio.length;i++){
                        if (informacio[0][i].equalsIgnoreCase(dniBusacar)){
                            System.out.println(informacio[0][1] +" " + informacio[0][2] + " ja estas registrat!!");
                            break;
                        }else {
                            System.out.println("Algo no a anat bé");
                            break;
                        }
                    }
                    }else{
                        System.out.println();
                        System.out.println("    Error");
                    }
                break;
                case 2:
                    System.out.println();
                    System.out.println("VACUNES ");
                    System.out.println("1-⬜  Moquillo");
                    System.out.println("2-⬜  Parvovirosis");
                    System.out.println("3-⬜  Hepatitis");
                    System.out.println("4-⬜  Leptospirosis");
                    System.out.println("5-⬜  Parainfluenza");
                    System.out.println("6-⬜  Rabia");
                    System.out.println("El teu gos de que està vacunat(Exemple: 1-5-3)?");

                    break;

                case 3:




        }
    }
}
