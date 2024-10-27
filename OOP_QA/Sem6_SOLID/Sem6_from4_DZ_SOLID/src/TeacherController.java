import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService;
    private final TeacherView teacherView;

    // Применение DIP: передаем зависимости через конструктор, делая класс независимым от конкретных реализаций
    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    // Метод создания учителя, следуя SRP и ISP
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    // Метод обновления информации об учителе
    public void updateTeacher(Integer teacherId, String firstName, String lastName, String middleName) {
        teacherService.updateTeacher(teacherId, firstName, lastName, middleName);
    }

    // Метод отображения всех учителей
    public void displayAllTeachers() {
        List<Teacher> teacherList = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teacherList);
    }

    // Метод для отображения отсортированного списка учителей
    public void displaySortedTeachersByFIO() {
        List<Teacher> sortedTeachers = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(sortedTeachers);
    }
}
