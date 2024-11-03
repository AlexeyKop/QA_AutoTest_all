class AverageCalculator:

    @staticmethod
    def calculate(numbers):

        if not numbers:
            return None
        return sum(numbers) / len(numbers)
