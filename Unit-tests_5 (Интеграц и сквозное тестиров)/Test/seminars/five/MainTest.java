package seminars.five;

import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import org.junit.jupiter.api.Test;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //5.1.
    /**
     Задание No1
     Создайте два модуля. Первый модуль генерирует список случайных чисел.
     Второй модуль находит максимальное число в этом списке.
     Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный тест,
     который проверяет, что оба модуля работают вместе правильно
     */
    // RandomNumberGenerator
    @Test
    public void testGenerateRandomNumbers(){
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateRandomNumbers(10);

        // проверяем, что размер массива, возвращаемого функцией, равен ожидаемому
        assertEquals(10, numbers.length);
    }

    // MaxNumberModule
    @Test
    public void testFindMaxNumber(){
        MaxNumberModule finder = new MaxNumberModule();

        // Создаем тестовый массив
        int[] numbers = {1,2,3,4,5};

        // Проверяем что функция находит ожидаемое максимальное число в массиве
        assertEquals(5, finder.findMaxNumber(numbers));
    }

    @Test
    public void testFindMaxInGeneratedNumbers(){
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();

        // генерируем массив случайных чисел
        int[] numbers = generator.generateRandomNumbers(10);

        // находим макс число в массиве
        int maxNumber = finder.findMaxNumber(numbers);

        // Сортируем массив, чтоб легко  определить макс число
        Arrays.sort(numbers);

        // Проверяем, что найденное макс число равно макс числу в отсортированном массиве
        assertEquals(numbers[numbers.length - 1], maxNumber);
    }



    //5.2.
    /**
     * У вас есть два класса - UserService и UserRepository.
     * UserService использует UserRepository для получения информации о пользователе.
     * Ваша задача - написать интеграционный тест, который проверяет, что UserService и UserRepository работают вместе должным образом.
     */
    @Test
    public void testGetUserName(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(2);

        assertEquals("User 2", result);
    }

    //5.3.
    /**
     * У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и PaymentService.
     * Класс OrderService обрабатывает заказы и делает вызовы к PaymentService для обработки платежей.
     * Ваша задача - написать интеграционный тест, который проверяет, что OrderService и PaymentService взаимодействуют корректно
     */

    @Test
    public void testPlaceOrder(){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("order1", 100);

        assertTrue(result);
    }
}