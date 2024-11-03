import pytest
from average_calculator import AverageCalculator
from list_comparator import ListComparator

# Тестирование класса AverageCalculator
def test_calculate_average_non_empty_list():
    # Проверяем расчет среднего для непустого списка
    assert AverageCalculator.calculate([1, 2, 3]) == 2.0

def test_calculate_average_empty_list():
    # Проверяем, что для пустого списка возвращается None
    assert AverageCalculator.calculate([]) is None

# Тестирование класса ListComparator
def test_compare_averages_first_greater():
    # Проверяем случай, когда среднее первого списка больше
    comparator = ListComparator([5, 5, 5], [1, 2, 3])
    assert comparator.compare_averages() == "Первый список имеет большее среднее значение"

def test_compare_averages_second_greater():
    # Проверяем случай, когда среднее второго списка больше
    comparator = ListComparator([1, 2, 3], [5, 5, 5])
    assert comparator.compare_averages() == "Второй список имеет большее среднее значение"

def test_compare_averages_equal():
    # Проверяем случай равных средних значений
    comparator = ListComparator([1, 2, 3], [1, 2, 3])
    assert comparator.compare_averages() == "Средние значения равны"

def test_compare_averages_with_empty_list():
    # Проверяем случай, когда один из списков пуст
    comparator = ListComparator([], [1, 2, 3])
    assert comparator.compare_averages() == "Один из списков пуст"
