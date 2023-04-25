package CentroSalud;

import java.sql.SQLOutput;

public class Paciente extends Persona{
    //Atributos de paciente
    private int nss;

    //Constructor de paciente
    public Paciente(String nombre, String apellido, String dni, int nss) {
        super(nombre, apellido, dni);
        this.nss = nss;
    }

    //Getter y setter de paciente
    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    //Método visualizar paciente
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("NSS: " + nss);
    }
}
