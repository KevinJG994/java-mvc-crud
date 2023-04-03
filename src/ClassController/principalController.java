package ClassController;

import View.alumnoView;
import View.asignaturasView;
import View.principalView;
import View.profesoresView;

public class principalController {

    public void mostrarPanelAlumnos() {
        alumnoView vistaAlumno = new alumnoView();
        vistaAlumno.setTitle("Panel Alumnos");
        vistaAlumno.setVisible(true);
        vistaAlumno.setLocationRelativeTo(null);
        vistaAlumno.setResizable(false);
    }

    public void mostrarPanelAsignaturas() {
        asignaturasView vistaAsignaturas = new asignaturasView();
        vistaAsignaturas.setTitle("Panel Asignaturas");
        vistaAsignaturas.setVisible(true);
        vistaAsignaturas.setLocationRelativeTo(null);
        vistaAsignaturas.setResizable(false);
    }

    public void mostrarPanelProfesores() {
        profesoresView vistaProfesores = new profesoresView();
        vistaProfesores.setTitle("Panel Profesores");
        vistaProfesores.setVisible(true);
        vistaProfesores.setLocationRelativeTo(null);
        vistaProfesores.setResizable(false);
    }

    public void mostrarPanelPrincipal() {
        principalView vistaPrincipal = new principalView();
        vistaPrincipal.setTitle("Panel Principal");
        vistaPrincipal.setVisible(true);
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setResizable(false);
    }

}
