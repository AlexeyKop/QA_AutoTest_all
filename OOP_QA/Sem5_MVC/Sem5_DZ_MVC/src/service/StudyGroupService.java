package service;

import model.Student;
import model.Teacher;
import model.StudyGroup;

import java.util.List;

public class StudyGroupService {

    // Метод для формирования учебной группы из преподавателя и списка студентов
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {

        return new StudyGroup(teacher, students);
    }
}
