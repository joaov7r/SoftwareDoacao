package telas;
/**
 *
 * @author João Vitor
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseManager {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "doacao_sangue";
    private static String usuario = "root";
    private static String senha = "Jv31415161@";
    
    public static Connection obtemConexao (){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            System.out.println("Banco Conectado com Sucesso!!!!");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


