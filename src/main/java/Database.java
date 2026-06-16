import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private static Database instance;
    private final Connection connection;

    private Database() {
        try {
            this.connection = DriverManager.getConnection("jdbc:h2:./h2db/test", "sa", "");
        } catch (SQLException e) {
            throw new IllegalStateException("Connection failed", e);
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
