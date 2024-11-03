from average_calculator import AverageCalculator
from number_list import NumberList

class ListComparator:

    def __init__(self, list1, list2):
        self.list1 = NumberList(list1)
        self.list2 = NumberList(list2)

    def compare_averages(self):
        avg1 = AverageCalculator.calculate(self.list1.get_numbers())
        avg2 = AverageCalculator.calculate(self.list2.get_numbers())

        if avg1 is None or avg2 is None:
            return "Один из списков пуст"

        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        elif avg2 > avg1:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
