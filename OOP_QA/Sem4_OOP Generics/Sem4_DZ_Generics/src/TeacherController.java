
import java.util.List;


public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }


    public void updateTeacher(Integer teacherId, String firstName, String lastName, String middleName) {
        teacherService.updateTeacher(teacherId, firstName, lastName, middleName);
    }


    public void displayAllTeachers() {
        List<Teacher> teacherList = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teacherList);
    }


    public void displaySortedTeachersByFIO() {
        List<Teacher> sortedTeachers = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(sortedTeachers);
    }
}
