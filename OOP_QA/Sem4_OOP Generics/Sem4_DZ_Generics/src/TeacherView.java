
import java.util.List;


public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println("Учитель: " + teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName() + " (ID: " + teacher.getTeacherId() + ")");
        }
    }
}
