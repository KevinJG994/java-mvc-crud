package ClassController;

import static Conection.Conection.sentencia;
import View.profesoresView;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class profesoresController {

    profesoresView proView = new profesoresView();

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
                    sentencia.executeUpdate("delete from asignatura  where id_profesor=" + id);
                    sentencia.executeUpdate("delete from profesor where id_profesor=" + id);
                    proView.limpiarProfesores();
                    JOptionPane.showMessageDialog(null, "Profesor eliminado correctamente.");
                }
            }
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void botonModificar(String nif, String nombre, String apellido, String ciudad, String direccion,
            String telefono, String departamento, String idProfesor) {
        
        String modificar = "";
        try {
            modificar = "update profesor set ";
            modificar += "nif='" + nif + "',";
            modificar += "nombre='" + nombre + "',";
            modificar += "apellido='" + apellido + "',";
            modificar += "ciudad='" + ciudad + "',";
            modificar += "direccion='" + direccion + "',";
            modificar += "telefono='" + telefono + "',";
            modificar += "id_departamento='" + departamento + "'";
            modificar += " where id_profesor='" + idProfesor + "'";
            sentencia.executeUpdate(modificar);
            proView.limpiarProfesores();
            JOptionPane.showMessageDialog(null, "Profesor modificado correctamente.");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void botonInsertar(String nif, String nombre, String apellido, String ciudad, String direccion, String telefono, String departamento) {
        String introducir = "";
        try {
            introducir = "insert into profesor (nif, nombre, apellido, ciudad, direccion, telefono, id_departamento) values (";
            introducir += "'" + nif + "',";
            introducir += "'" + nombre + "',";
            introducir += "'" + apellido + "',";
            introducir += "'" + ciudad + "',";
            introducir += "'" + direccion + "',";
            introducir += "'" + telefono + "',";
            introducir += "'" + departamento + "')";
            sentencia.executeUpdate(introducir);
            proView.limpiarProfesores();
            JOptionPane.showMessageDialog(null, "Profesor insertado correctamente.");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir registro.");
        }
    }
}
