package seminars.five.number;

import java.util.List;

public class MaxNumberModule {

        public int findMaxNumber (int[] numbers){
            int maxNumber = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > maxNumber) {
                    maxNumber = numbers[i];
                }
            }

        return maxNumber;
    }

}
