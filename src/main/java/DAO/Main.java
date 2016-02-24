package DAO;

/**
 * Created by lima on 2/21/16.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}
