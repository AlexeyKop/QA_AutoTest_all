public class Main {
    /**
     Домашнее задание
     📌Создать класс УчительСервис и реализовать аналогично проедланному на семинаре
     📌Создать класс УчительВью и реализовать аналогично проедланному на семинаре
     📌Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей имеющихся в системе

     */
    public static void main(String[] args) {
        // Создаем контроллер для работы с учителями
        TeacherController teacherController = new TeacherController();

        // Создаем несколько учителей
        teacherController.create("Иван", "Иванов", "Иванович");
        teacherController.create("Мария", "Сидорова", "Петровна");
        teacherController.create("Алексей", "Петров", "Сергеевич");

        // Отображаем всех учителей
        System.out.println("Все учителя:");
        teacherController.displayAllTeachers();

        // Обновляем информацию о конкретном учителе
        teacherController.updateTeacher(1, "Иван", "Иванов", "Александрович");

        // Отображаем всех учителей после обновления
        System.out.println("\nУчителя после обновления:");
        teacherController.displayAllTeachers();

        // Сортируем и отображаем учителей по ФИО
        System.out.println("\nУчителя отсортированные по ФИО:");
        teacherController.displaySortedTeachersByFIO();
    }
}
