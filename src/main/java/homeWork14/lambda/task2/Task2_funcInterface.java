package homeWork14.lambda.task2;

import org.apache.log4j.Logger;

import java.util.stream.Stream;

public class Task2_funcInterface {

    private static final Logger logger = Logger.getLogger(Task2_funcInterface.class);

    public static void main(String[] args) {

        Count count_max = ((value1, value2, value3) -> Stream.of(value1, value2, value3).max(Integer::compareTo).get());
        Count count_average = ((value1, value2, value3) -> (int) Stream.of(value1, value2, value3).mapToInt(Integer::intValue).average().getAsDouble());
        Count count_sum = ((value1, value2, value3) -> Stream.of(value1, value2, value3).mapToInt(Integer::intValue).sum());

        logger.info("Max of values: " + count_max.count(1, 10, 6));
        logger.info("Average of values: " + count_average.count(1, 10, 6));
        logger.info("Sum of values: " + count_sum.count(1, 10, 6));
    }
}
