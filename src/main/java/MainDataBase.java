public class MainDataBase {

    public static void main(String[] args) {

        DatabaseQueryService service = new DatabaseQueryService();

        System.out.println(" [ MAX PROJECTS CLIENT ] ");
        service.findMaxProjectsClient()
                .forEach(System.out::println);

        System.out.println("\n [ MAX SALARY WORKER ] ");
        service.findMaxSalaryWorker()
                .forEach(System.out::println);

        System.out.println("\n [ LONGEST PROJECT ] ");
        service.findLongestProject()
                .forEach(System.out::println);

        System.out.println("\n [ YOUNGEST / ELDEST WORKERS ] ");
        service.findYoungestEldestWorkers()
                .forEach(System.out::println);

        System.out.println("\n [ PROJECT PRICES ] ");
        service.printProjectPrices()
                .forEach(System.out::println);
    }
}

