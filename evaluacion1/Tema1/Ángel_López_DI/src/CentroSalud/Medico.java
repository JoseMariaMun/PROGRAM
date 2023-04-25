package CentroSalud;

import java.util.ArrayList;

public class Medico extends Persona{
    //Atributos de médico
    private int nColegiado;
    private String especialidad;
    private ArrayList<CitaMedico> citaMedicos;

    //Constructor de médico
    public Medico(String nombre, String apellido, String dni, int nColegiado, String especialidad) {
        super(nombre, apellido, dni);
        this.nColegiado = nColegiado;
        this.especialidad = especialidad;
        citaMedicos = new ArrayList<CitaMedico>();
    }

    //Getter y setter de médico
    public int getnColegiado() {
        return nColegiado;
    }

    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Método de visualizar médico
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Número de colegiado: " + nColegiado);
        System.out.println("Especialidad: " + especialidad);
    }
}
