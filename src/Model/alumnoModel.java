package Model;

import Conection.Conection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class alumnoModel {

    private static Statement sentencia;

    public DefaultTableModel mostrarAlumnos() {
        String[] titulos = {"ID", "Nif", "Nombre", "Apellido", "Ciudad", "Dirección", "Teléfono", "Fecha Nacimiento"};
        DefaultTableModel mdl = new DefaultTableModel(null, titulos);
        try {
            sentencia = Conection.ObtenerSentencia();
            ResultSet resultado = sentencia.executeQuery("select * from alumno");
            String[] casilla = new String[8];
            while (resultado.next()) {
                casilla[0] = resultado.getString("id");
                casilla[1] = resultado.getString("nif");
                casilla[2] = resultado.getString("nombre");
                casilla[3] = resultado.getString("apellido");
                casilla[4] = resultado.getString("ciudad");
                casilla[5] = resultado.getString("direccion");
                casilla[6] = resultado.getString("telefono");
                casilla[7] = resultado.getString("fecha_nacimiento");
                mdl.addRow(casilla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Alumnos");
        }
        return mdl;
    }
}
