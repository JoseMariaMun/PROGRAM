package CentroSalud;

import java.util.ArrayList;

public class Centro {
    //Atributos del centro
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedicos;

    public Centro() {
        listaPacientes = new ArrayList<Paciente>();
        listaMedicos = new ArrayList<Medico>();
    }

    //Método para saber si existe el paciente
    public boolean ExistePaciente(int nss){
        for (Paciente p: listaPacientes) {
            if (p.getNss() == nss){
                return true;
            }
        }
        return false;
    }

    //Método para añadir al paciente
    public void addPaciente(String nombre, String apellido, String dni, int nss){
        Paciente paciente;
        paciente = new Paciente(nombre,apellido,dni,nss);
        listaPacientes.add(paciente);
    }

    //Método para registrar al paciente
    public void registrarPaciente(String nombre, String apellido, String dni, int nss){
        if (ExistePaciente(nss) == false){
            addPaciente(nombre,apellido,dni,nss);
        }
    }


    //Método para añadir al médico
    public void addMedico(String nombre, String apellido, String dni, int nColegiado, String especialidad){
        Medico medico;
        medico = new Medico(nombre,apellido,dni,nColegiado,especialidad);
        listaMedicos.add(medico);
    }

    //Método para visualizar a los medicos
    public void visualizarMedicos(){
        for (Medico m: listaMedicos) {
            m.visualizar();
        }
    }

    //Método para visualizar a los pacientes
    public void visualizarPaciente(){
        for (Paciente p : listaPacientes) {
            p.visualizar();
        }
    }

}
