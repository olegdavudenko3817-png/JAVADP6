import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    private String readSqlFromFile(String filePath) {
        try {
            return Files.readString(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать SQL файл: " + filePath, e);
        }
    }

    public List<DTO.MaxProjectCountClient> findMaxProjectsClient() {
        List<DTO.MaxProjectCountClient> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_max_projects_client.sql");

        Connection connection = Database.getInstance().getConnection();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int projectCount = resultSet.getInt("project_count");
                result.add(new DTO.MaxProjectCountClient(name, projectCount));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<DTO.LongestProject> findLongestProject() {
        List<DTO.LongestProject> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_longest_project.sql");
        Connection connection = Database.getInstance().getConnection();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int monthCount = resultSet.getInt("month_count");
                result.add(new DTO.LongestProject(name, monthCount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<DTO.MaxSalaryWorker> findMaxSalaryWorker() {
        List<DTO.MaxSalaryWorker> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_max_salary_worker.sql");
        Connection connection = Database.getInstance().getConnection();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
                result.add(new DTO.MaxSalaryWorker(name, salary));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<DTO.YoungestEldestWorker> findYoungestEldestWorkers() {
        List<DTO.YoungestEldestWorker> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_youngest_eldest_workers.sql");
        Connection connection = Database.getInstance().getConnection();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String type = resultSet.getString("type");
                String name = resultSet.getString("name");
                java.time.LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                result.add(new DTO.YoungestEldestWorker(type, name, birthday));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<DTO.ProjectPrice> printProjectPrices() {
        List<DTO.ProjectPrice> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/print_project_prices.sql");
        Connection connection = Database.getInstance().getConnection();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                result.add(new DTO.ProjectPrice(name, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}