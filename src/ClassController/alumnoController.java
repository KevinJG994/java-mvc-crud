package ClassController;

import static Conection.Conection.sentencia;
import View.alumnoView;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class alumnoController {

    alumnoView alumnoView = new alumnoView();

    public void botonInsertar(String nif, String nombre, String apellido, String ciudad,
            String direccion, String telefono, String fecha) {

        String introducir = "";
        try {
            introducir = "INSERT INTO alumno (nif, nombre, apellido, ciudad, direccion, telefono, fecha_nacimiento) VALUES (";
            introducir += "'" + nif + "',";
            introducir += "'" + nombre + "',";
            introducir += "'" + apellido + "',";
            introducir += "'" + ciudad + "',";
            introducir += "'" + direccion + "',";
            introducir += "'" + telefono + "',";
            introducir += "'" + fecha + "')";
            System.out.println(introducir);
            sentencia.executeUpdate(introducir);
            alumnoView.limpiarAlumnos();
            JOptionPane.showMessageDialog(null, "Alumno insertado correctamente.");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir registro.");
        }
    }

    public void botonModificar(String nif, String nombre, String apellido, String ciudad, String direccion,
            String telefono, String fechaNac, String whereId) {

        String modificar = "";
        try {
            modificar = "update alumno set ";
            modificar += "nif='" + nif + "',";
            modificar += "nombre='" + nombre + "',";
            modificar += "apellido='" + apellido + "',";
            modificar += "ciudad='" + ciudad + "',";
            modificar += "direccion='" + direccion + "',";
            modificar += "telefono='" + telefono + "',";
            modificar += "fecha_nacimiento='" + fechaNac + "'";
            modificar += " where id='" + whereId + "'";
            sentencia.executeUpdate(modificar);
            alumnoView.limpiarAlumnos();
            JOptionPane.showMessageDialog(null, "Alumno modificado correctamente.");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void botonEliminar(int seleccionarFila, String idString) {
        int respuesta;
        int id;
        try {
            if (seleccionarFila == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado el registro a eliminar.");
            } else {
                respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el registro de la Base de Datos?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    id = Integer.parseInt(idString);
                    sentencia.executeUpdate("delete from alumno_se_matricula_asignatura  where id_alumno=" + id);
                    sentencia.executeUpdate("delete from alumno where ID=" + id);
                    alumnoView.limpiarAlumnos();
                    JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente.");
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
