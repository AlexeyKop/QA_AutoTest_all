
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");

        // Создаем несколько потоков с группами
        Stream stream1 = new Stream(Arrays.asList(group1, group2));  // Поток с 2 группами
        Stream stream2 = new Stream(Arrays.asList(group1));  // Поток с 1 группой
        Stream stream3 = new Stream(Arrays.asList(group1, group2, group3));  // Поток с 3 группами

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Выводим потоки до сортировки
        System.out.println("До сортировки:");
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами");
        }

        // Создаем сервис и контроллер
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем потоки
        controller.sortStreams(streams);

        // Выводим потоки после сортировки
        System.out.println("\nПосле сортировки:");
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами");
        }
    }
}
