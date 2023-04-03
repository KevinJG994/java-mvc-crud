package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conection {

    public static Statement sentencia;
    private static Connection conect = null;
    private static final String user = "root";
    private static final String password = "";

    public static void abrirConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el controlador");
        }
        try {
            String DSN = "jdbc:mysql://localhost:3306/universidad" + "?zeroDateTimeBehavior=convertToNull";
            conect = DriverManager.getConnection(DSN, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la conexión.");
        }
        try {
            sentencia = conect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el objeto sentencia.");
        }
    }

    public static Connection ObtenerConexion() {
        return conect;
    }

    public static void cerrarConexion() {
        try {
            JOptionPane.showMessageDialog(null, "Se cerró la conexión con la BBDD");
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Statement ObtenerSentencia() {
        return sentencia;
    }
}
