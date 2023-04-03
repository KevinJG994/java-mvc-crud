package Main;

import ClassController.principalController;
import Conection.Conection;

public class Principal {

    public static void main(String[] args) {
        Conection.abrirConexion();
        principalController pController = new principalController();
        pController.mostrarPanelPrincipal();

    }
}
