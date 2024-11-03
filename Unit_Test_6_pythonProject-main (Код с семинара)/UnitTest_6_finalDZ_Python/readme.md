## Домашнее задание
### Задание 1. 
 Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:

     a. Рассчитывает среднее значение каждого списка.
     b. Сравнивает эти средние значения и выводит соответствующее сообщение:
         - "Первый список имеет большее среднее значение", если среднее значение первого списка больше.
         - "Второй список имеет большее среднее значение", если среднее значение второго списка больше.
         - "Средние значения равны", если средние значения списков равны.

 + Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования. 
 + Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования вашего приложения. 
 + Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода. 
 + Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.
 Введение в юнит-тестирование
 
#### Домашнее задание
 Нужно предоставить:
 - Код программы
 - Код тестов
 - * Отчет pylint/Checkstyle
 - * Отчет о покрытии тестами
 - Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

### Отчет о покрытии тестами

test_list_comparator.py ......                                                                                                                                               [100%]

---------- coverage: platform win32, python 3.11.5-final-0 -----------

_____Name______Stmts  Miss Cover_____
---------------------------------------------
---------------------------------------------
average_calculator.py_____6__________0_______100%

list_comparator.py________16_________0________100%

number_list.py____________5_________0________100%

test_list_comparator.py_____19_________0________100%

---------------------------------------------
TOTAL___________________46_________0________100%


### Отчет pylint

************* Module average_calculator

average_calculator.py:1:0: C0114: Missing module docstring (missing-module-docstring)

average_calculator.py:1:0: R0903: Too few public methods (1/2) (too-few-public-methods)

************* Module list_comparator

list_comparator.py:18:0: C0301: Line too long (101/100) (line-too-long)

list_comparator.py:19:0: C0301: Line too long (101/100) (line-too-long)

list_comparator.py:1:0: C0114: Missing module docstring (missing-module-docstring)

list_comparator.py:28:8: R1705: Unnecessary "elif" after "return", remove the leading "el" from "elif" (no-else-return)

list_comparator.py:4:0: R0903: Too few public methods (1/2) (too-few-public-methods)

************* Module number_list

number_list.py:1:0: C0114: Missing module docstring (missing-module-docstring)
number_list.py:1:0: R0903: Too few public methods (1/2) (too-few-public-methods)

************* Module test_list_comparator

test_list_comparator.py:1:0: C0114: Missing module docstring (missing-module-docstring)

test_list_comparator.py:6:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:10:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:15:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:20:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:25:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:30:0: C0116: Missing function or method docstring (missing-function-docstring)

test_list_comparator.py:1:0: W0611: Unused import pytest (unused-import)


-----------------------------------
Your code has been rated at 6.22/10



