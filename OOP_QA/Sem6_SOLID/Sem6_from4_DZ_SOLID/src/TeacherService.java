import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    // Метод создания нового учителя. Принцип SRP соблюден — метод выполняет единственную задачу
    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacher.setTeacherId(teacherList.size() + 1);
        teacherList.add(teacher);
    }

    // Принцип SRP — обновление информации об учителе
    public void updateTeacher(Integer teacherId, String firstName, String lastName, String middleName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
            }
        }
    }

    // Метод возвращает список отсортированных учителей, соблюдая OCP, так как сортировка реализована через Comparator
    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> sortedTeachers = new ArrayList<>(teacherList);
        sortedTeachers.sort(new UserComparator<>());
        return sortedTeachers;
    }

    // Метод для получения всех учителей
    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teacherList);
    }
}
