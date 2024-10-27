import java.util.List;

public class TeacherView implements UserView<Teacher> {

    // Метод вывода информации об учителях на консоль
    @Override
    public void sendOnConsole(List<Teacher> list) {
        // Следуя SRP, метод только выводит данные на консоль
        for (Teacher teacher : list) {
            System.out.println("Учитель: " + teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName() + " (ID: " + teacher.getTeacherId() + ")");
        }
    }
}
