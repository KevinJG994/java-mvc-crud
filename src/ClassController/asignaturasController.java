package ClassController;

import static Conection.Conection.sentencia;
import View.asignaturasView;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class asignaturasController {

    asignaturasView asigView = new asignaturasView();

    public void botonInsertar(String nombre, String creditos, String tipo, String curso,
            String cuatrimestre, String idProfesor, String idGrado) {

        String introducir = "";
        try {
            introducir = "INSERT INTO asignatura (nombre, creditos, tipo, curso, cuatrimestre, id_profesor, id_grado) values (";
            introducir += "'" + nombre + "',";
            introducir += "'" + creditos + "',";
            introducir += "'" + tipo + "',";
            introducir += "'" + curso + "',";
            introducir += "'" + cuatrimestre + "',";
            introducir += "'" + idProfesor + "',";
            introducir += "'" + idGrado + "')";
            sentencia.executeUpdate(introducir);
            asigView.limpiarAsignaturas();
            JOptionPane.showMessageDialog(null, "Asignatura insertada correctamente.");

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir registro.");
        }
    }

    public void botonModificar(String nombre, String creditos, String tipo, String curso,
            String cuatrimestre, String idProfesor, String idGrado, String whereId) {

        String modificar = "";
        try {
            modificar = "update asignatura set ";
            modificar += "nombre='" + nombre + "',";
            modificar += "creditos='" + creditos + "',";
            modificar += "tipo='" + tipo + "',";
            modificar += "curso='" + curso + "',";
            modificar += "cuatrimestre='" + cuatrimestre + "',";
            modificar += "id_profesor='" + idProfesor + "',";
            modificar += "id_grado='" + idGrado + "'";
            modificar += " where id='" + whereId + "'";
            sentencia.executeUpdate(modificar);
            asigView.limpiarAsignaturas();
            JOptionPane.showMessageDialog(null, "Asignatura modificada correctamente.");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir registro.");
        }
    }

    public void botonEliminar(int seleccionarFila, String idString) {
        int id;
        int respuesta;
        try {
            if (seleccionarFila == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado el registro a eliminar.");
            } else {
                respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el registro de la Base de Datos?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    id = Integer.parseInt(idString);
                    sentencia.executeUpdate("delete from alumno_se_matricula_asignatura  where id_asignatura=" + id);
                    sentencia.executeUpdate("delete from asignatura where id=" + id);
                    asigView.limpiarAsignaturas();
                    JOptionPane.showMessageDialog(null, "Asignatura eliminada correctamente.");
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
