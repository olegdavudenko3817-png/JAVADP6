import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {

    public static void main(String[] args) {

        try {
            String sql = Files.readString(Path.of("sql/init_db.sql"));

            Connection connection = Database.getInstance().getConnection();

            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
                System.out.println("DB initialized");
            }

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
