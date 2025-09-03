import java.util.Scanner;

public class Participante2 extends Inventores{
    public Participante2(String nombre, Integer edad, Integer nivelCreatividad){
        super(nombre, edad, nivelCreatividad);
    }

    @Override
    public void infoParticipante(){
        super.infoParticipante();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la categoría de su invento: ");
        System.out.println("1. Mecánica");
        System.out.println("2. Tecnología (Software)");
        System.out.println("3. Científica (Química)");
        scanner.nextLine();
    }
    
    @Override
    public void presentacion(){
        System.out.println("");
    }

    @Override
    public void puntosCompetencia(){
        super.puntosCompetencia();
    }
}
