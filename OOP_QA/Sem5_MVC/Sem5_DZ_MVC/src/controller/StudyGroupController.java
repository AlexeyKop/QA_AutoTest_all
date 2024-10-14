package controller;

import model.Student;
import model.Teacher;
import model.StudyGroup;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    private final StudyGroupService studyGroupService = new StudyGroupService();

    // Метод для формирования учебной группы
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    // Метод для отображения информации об учебной группе
    public void displayStudyGroup(StudyGroup group) {
        System.out.println(group.toString());
    }
}
