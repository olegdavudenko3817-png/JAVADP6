import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {

    public static void main(String[] args) {

        try {
            String sql = Files.readString(Paths.get("sql/populate_db.sql"));

            Connection connection = Database.getInstance().getConnection();

            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
                System.out.println("Database populated");
            }

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
