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
            throw new IllegalStateException("Не удалось прочитать SQL файл: " + filePath, e);
        }

    }

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_max_projects_client.sql");

        try (Statement statement = Database.getInstance()
                .getConnection()
                .createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int projectCount = resultSet.getInt("project_count");
                result.add(new MaxProjectCountClient(name, projectCount));
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Database failed", e);
        }

        return result;
    }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_longest_project.sql");

        try (Statement statement = Database.getInstance()
                .getConnection()
                .createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int monthCount = resultSet.getInt("month_count");
                result.add(new LongestProject(name, monthCount));
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Database failed", e);
        }

        return result;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_max_salary_worker.sql");

        try (Statement statement = Database.getInstance()
                .getConnection()
                .createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
                result.add(new MaxSalaryWorker(name, salary));
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Database failed", e);
        }

        return result;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorkers() {
        List<YoungestEldestWorker> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/find_youngest_eldest_workers.sql");

        try (Statement statement = Database.getInstance()
                .getConnection()
                .createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String type = resultSet.getString("type");
                String name = resultSet.getString("name");
                java.time.LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                result.add(new YoungestEldestWorker(type, name, birthday));
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Database failed", e);
        }

        return result;
    }

    public List<ProjectPrice> printProjectPrices() {
        List<ProjectPrice> result = new ArrayList<>();
        String sql = readSqlFromFile("sql/print_project_prices.sql");

        try (Statement statement = Database.getInstance()
                .getConnection()
                .createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                result.add(new ProjectPrice(name, price));
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Database failed", e);
        }

        return result;
    }
}