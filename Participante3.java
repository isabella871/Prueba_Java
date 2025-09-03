public class Participante3 extends Inventores{
    public Participante3(String nombre, Integer edad, Integer nivelCreatividad){
        super(nombre, edad, nivelCreatividad);
    }

    @Override
    public void infoParticipante(){
        super.infoParticipante();
    }
    
    @Override
    public void presentacion(){
        System.out.println("Damas y caballeros ... con ustedes el participante " + nombre);
    }

    @Override
    public void puntosCompetencia(){
        super.puntosCompetencia();
    }
}
