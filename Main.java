import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do{
            System.out.println("---- Bienvenidos a la feria ----");
            System.out.println("     Elija a un participante    ");
            System.out.println("1. Pimer Participante");
            System.out.println("2. Segundo Participante");
            System.out.println("3. Tercer Participante");
            System.out.println("4. Salir del menú");
            System.out.print("Desa ver a nuestro participante ... ");
            option = scanner.nextInt();

            switch (option) {
                case 1:                    
                    System.out.println("----- Datos Primer participante ----- ");
                    System.out.println("Ingrese su nombre: ");
                    String nombre1 = scanner.nextLine();
                    System.out.println("Ingrese su edad: ");
                    Integer edad1 = scanner.nextInt();
                    System.out.println("----- ---- ---- ---- ---- ---- - ----- ");
                    
                    Inventores p1 = new Participante1(nombre1, edad1, null);
                    p1.infoParticipante();
                    p1.getNivelCreatividad();
                    p1.puntosCompetencia();
                    p1.presentacion();
                    break;

                case 2:
                    System.out.println("----- Datos Segundo Participante ----- ");
                    System.out.println("Ingrese su nombre: ");
                    String nombre2 = scanner.nextLine();
                    System.out.println("Ingrese su edad: ");
                    Integer edad2 = scanner.nextInt();
                    System.out.println("----- ---- ---- ---- ---- ---- - ----- ");
                    
                    Inventores p2 = new Participante1(nombre2, edad2, null);
                    p2.infoParticipante();
                    p2.getNivelCreatividad();
                    p2.puntosCompetencia();
                    p2.presentacion();
                    break;

                case 3:
                    System.out.println("----- Datos Tercer Participante ----- ");
                    System.out.println("Ingrese su nombre: ");
                    String nombre3 = scanner.nextLine();
                    System.out.println("Ingrese su edad: ");
                    Integer edad3 = scanner.nextInt();
                    System.out.println("----- ---- ---- ---- ---- ---- - ----- ");
                    
                    Inventores p3 = new Participante1(nombre3, edad3, null);
                    p3.infoParticipante();
                    p3.getNivelCreatividad();
                    p3.puntosCompetencia();
                    p3.presentacion();
                    break;
            
                default:System.out.println("... Cerrando menú ...");
                    break;
            }
        }while (option != 4);
        scanner.close();
    }
}
