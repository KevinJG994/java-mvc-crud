package Model;

import Conection.Conection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class asignaturasModel {

    private Statement sentencia;

    public DefaultTableModel mostrarAsignaturas() {
        String[] titulos = {"ID", "Nombre", "Créditos", "Tipo", "Curso", "Cuatrimestre", "Id Profesor", "Id Grado"};
        DefaultTableModel mdl = new DefaultTableModel(null, titulos);
        try {
            sentencia = Conection.ObtenerSentencia();
            ResultSet resultado = sentencia.executeQuery("select * from asignatura");
            String[] casilla = new String[8];
            while (resultado.next()) {
                casilla[0] = resultado.getString("id");
                casilla[1] = resultado.getString("nombre");
                casilla[2] = resultado.getString("creditos");
                casilla[3] = resultado.getString("tipo");
                casilla[4] = resultado.getString("curso");
                casilla[5] = resultado.getString("cuatrimestre");
                casilla[6] = resultado.getString("id_profesor");
                casilla[7] = resultado.getString("id_grado");
                mdl.addRow(casilla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar Asignatura");
        }
        return mdl;
    }
}
