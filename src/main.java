import Interfaz.Menu;
import Servicios.Database;

public class main {
    public static void main(String[] args){

        Database.initDatabase();

        Menu.mainMenu();
    }
}
