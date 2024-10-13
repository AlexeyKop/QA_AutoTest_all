
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();


    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacher.setTeacherId(teacherList.size() + 1);
        teacherList.add(teacher);
    }


    public void updateTeacher(Integer teacherId, String firstName, String lastName, String middleName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
            }
        }
    }


    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> sortedTeachers = new ArrayList<>(teacherList);
        sortedTeachers.sort(new UserComparator<Teacher>());
        return sortedTeachers;
    }


    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teacherList);
    }
}
