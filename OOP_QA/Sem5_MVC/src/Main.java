public class Main {
    /**
     * Задача 1  - Data/model
     *  📌Создать package – model. Работу продолжаем в нем
     *  📌Реализовать абстрактный класс User и его наследники Student и Teacher.
     *  Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
     *  а наследники собственные параметры (какие, по вашему выбору – Пример: studentId для Student, teacherId для Teacher)
     *
     *  Задача 2  - Service
     *  📌Создать package – service. Работу продолжаем в нем
     *  📌Создать класс DataService с методами в по управлению сущностями User (create, read) и
     *  агрегирующий всех пользователей заведенных в системе
     *  📌StudentId должны быть созданы по алгоритму – максимальный id в коллекции + 1. Аналогично и для TeacherId.
     *  Здесь решение через перебор элементов и instanceOf
     *
     *  Задача 3  - View/Dto
     *  📌Создать package – view. Работу продолжаем в нем
     *  📌Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход
     *
     *  Задача 4  - Controller
     *  📌Создать package – controller. Работу продолжаем в нем
     *  📌Создать класс Controller агрегирующий в себе необходимые классы в виде полей, а инициализируем прям в поле.
     *  📌Создаем метод созданиеСтудента – реализующий логику, путем вызова соответствующих методов интерфейсов:
     *  📌Создания Студента в сервисе
     *  📌Возвращение всех студентов в сервисе
     *  📌Вызов view и передача списка найденных студентов
     */
    public static void main(String[] args) {

    }
}
