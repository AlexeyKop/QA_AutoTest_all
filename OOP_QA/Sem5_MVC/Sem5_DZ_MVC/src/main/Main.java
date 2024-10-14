package main;

import controller.StudyGroupController;
import model.Student;
import model.Teacher;
import model.StudyGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Иванович", 1));
        students.add(new Student("Петр", "Петров", "Петрович", 2));
        students.add(new Student("Анна", "Смирнова", "Игоревна", 3));

        // Создаем преподавателя
        Teacher teacher = new Teacher("Марья", "Васильева", "Ивановна", 1);

        // Создаем контроллер учебной группы
        StudyGroupController controller = new StudyGroupController();

        // Формируем учебную группу
        StudyGroup group = controller.formStudyGroup(teacher, students);

        // Отображаем информацию об учебной группе
        controller.displayStudyGroup(group);
    }
}

