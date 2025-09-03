import java.util.Scanner;

public class Participante1 extends Inventores{
    public Participante1(String nombre, Integer edad, Integer nivelCreatividad){
        super(nombre, edad, nivelCreatividad);
    }

    @Override
    public void infoParticipante(){
        super.infoParticipante();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su invento: ");
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
