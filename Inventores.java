import java.util.Scanner;

public class Inventores {
    String nombre;
    Integer edad;
    private Integer nivelCreatividad;

    public Inventores(String nombre, Integer edad, Integer nivelCreatividad){
        this.nombre = nombre;
        this.edad = edad;
        this.nivelCreatividad = nivelCreatividad;
    }

    public void setNivelCreatividad(Integer nivelCreatividad){
        this.nivelCreatividad = nivelCreatividad;
    }

    public Integer getNivelCreatividad(){
        return nivelCreatividad;
    }

    public void infoParticipante(){
        System.out.println("------------ Participante ------------");
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Nivel de creatividad " + nivelCreatividad);
        System.out.println("----- --- ---- ----- --- ---- ---- ---");
        System.out.println();
    }

    public void puntosCompetencia(){
        Scanner scanner = new Scanner(System.in);
        int puntosCreatividad;
        this.nivelCreatividad = 0;

        System.out.println("Ingresar puntale del participante " + nombre);
        int puntaje = scanner.nextInt();

        if (puntaje < 60){
            puntosCreatividad = nivelCreatividad + 3;
            System.out.println("Su nivel de creatividad es: " + puntosCreatividad);
        }else {
            puntosCreatividad = nivelCreatividad + 7;
            System.out.println("Si nivel de creatividad es : " + puntosCreatividad);
        }
    }

    public void presentacion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Con ustedes, el participante " + nombre);
        System.out.println("Su proyecto trata sobre....");
        scanner.nextLine();
    }
}
