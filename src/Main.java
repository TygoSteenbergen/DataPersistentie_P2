import Persistentie.Reiziger.ReizigerDAO;
import Persistentie.Reiziger.ReizigerDAOPsql;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/ovchip?user=postgres&password=Dinglebugger";
        try {
            Connection conn = DriverManager.getConnection(url);
            ReizigerDAOPsql RDOA = new ReizigerDAOPsql(conn);
            ReizigerDAOPsql.testReizigerDAO(RDOA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}