public class DTO {

    public record MaxProjectCountClient(String name, int projectCount) {
    }

    public record LongestProject(String name, int monthCount) {
    }

    public record MaxSalaryWorker(String name, int salary) {
    }

    public record YoungestEldestWorker(String type, String name, java.time.LocalDate birthday) {
    }

    public record ProjectPrice(String name, int price) {
    }

}
