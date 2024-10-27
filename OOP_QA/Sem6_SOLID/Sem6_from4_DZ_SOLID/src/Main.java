public class Main {
    /**
     * Принципы SOLID
     * 1) SRP - Принцип единственной ответственности (Single Responsibility Principle)
     * 2) OCP - Принцип открытости/закрытости (Open Closed Principle)
     * 3) LCP - Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
     * 4) ISP - Принцип разделения интерфейса (Interface Segregation Principle)
     * 5) DIP - Принцип инверсии зависимостей (Dependency Inversion Principle)
     */

    public static void main(String[] args) {
        // Создаем контроллер для работы с учителями через интерфейс UserController
        TeacherController teacherController = new TeacherController();

        // Демонстрируем SRP и DIP — создаем учителей через контроллер, который зависит от абстракций, а не от конкретных классов
        teacherController.create("Иван", "Иванов", "Иванович");
        teacherController.create("Мария", "Сидорова", "Петровна");
        teacherController.create("Алексей", "Петров", "Сергеевич");

        // Отображаем всех учителей
        System.out.println("Все учителя:");
        teacherController.displayAllTeachers();

        // Обновляем информацию о конкретном учителе, следуя SRP: отдельный метод для обновления
        teacherController.updateTeacher(1, "Иван", "Иванов", "Александрович");

        // Отображаем всех учителей после обновления
        System.out.println("\nУчителя после обновления:");
        teacherController.displayAllTeachers();

        // Сортируем и отображаем учителей по ФИО, демонстрация OCP: метод может быть расширен
        System.out.println("\nУчителя отсортированные по ФИО:");
        teacherController.displaySortedTeachersByFIO();
    }
}
