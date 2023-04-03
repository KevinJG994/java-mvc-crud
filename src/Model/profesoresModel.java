package Model;

import Conection.Conection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class profesoresModel {

    private static Statement sentencia;

    public DefaultTableModel mostrarProfesores() {
        String[] titulos = {"Id Profesor", "Nif", "Nombre", "Apellido", "Ciudad", "Dirección", "Teléfono", "Id Departamento"};
        DefaultTableModel mdl = new DefaultTableModel(null, titulos);
        try {
            sentencia = Conection.ObtenerSentencia();
            ResultSet resultado = sentencia.executeQuery("select * from profesor");
            String[] casilla = new String[8];
            while (resultado.next()) {
                casilla[0] = resultado.getString("id_profesor");
                casilla[1] = resultado.getString("nif");
                casilla[2] = resultado.getString("nombre");
                casilla[3] = resultado.getString("apellido");
                casilla[4] = resultado.getString("ciudad");
                casilla[5] = resultado.getString("direccion");
                casilla[6] = resultado.getString("telefono");
                casilla[7] = resultado.getString("id_departamento");
                mdl.addRow(casilla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar Profesores");
        }
        return mdl;
    }
}
