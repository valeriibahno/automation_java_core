package homeWork14.streams;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    private static final Logger logger = Logger.getLogger(Task1.class);
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "One"));

        logger.info("Return the number of occurrences of the 'One' object: " + stringList.stream()
                                                                                            .filter(x -> x.equals("One"))
                                                                                            .count());

        logger.info("Return the first element of the collection or 0 if the collection is empty: " + stringList.stream()
                                                                                                                    .findFirst()
                                                                                                                    .orElse("0"));

        logger.info("Return the last element of the collection or 'empty' if the collection is empty: " + stringList.stream()
                                                                                                                        .skip(stringList.size()-1)
                                                                                                                        .findFirst()
                                                                                                                        .orElse("empty"));

        logger.info("Find an element in the collection equal to 'Three' or throw an error: " + stringList.stream()
                                                                                                            .filter(x->x.equals("Three"))
                                                                                                            .findFirst()
                                                                                                            .orElseThrow(NullPointerException::new));

        logger.info("Return the third element of the collection in order: " + stringList.stream()
                                                                                            .skip(2)
                                                                                            .findFirst()
                                                                                            .get());

        logger.info("Return two elements starting with the second one: " + stringList.stream()
                                                                                            .limit(3)
                                                                                            .skip(1)
                                                                                            .collect(Collectors.toList()));

        logger.info("Select all elements in which there are more than 3 letters in the word: " + stringList.stream()
                                                                                                                .filter(x -> x.length() > 3)
                                                                                                                .collect(Collectors.toList()));

        logger.info("Return collections without duplicates: " + stringList.stream()
                                                                                .distinct()
                                                                                .collect(Collectors.toList()));

        logger.info("Find if there is even one 'One' element in the collection: " + stringList.stream()
                                                                                                    .anyMatch(x -> x.equals("One")));

        logger.info("Find whether all elements of the collection have the symbol 'o': " + stringList.stream()
                                                                                                        .allMatch(x -> x.equals("o")));

        logger.info("Append '_1' to each element of the collection: " + stringList.stream()
                                                                                        .map(x -> x + "_1")
                                                                                        .collect(Collectors.toList()));

        logger.info("Sort a collection of strings alphabetically and remove duplicates: " + stringList.stream()
                                                                                                            .distinct()
                                                                                                            .sorted()
                                                                                                            .collect(Collectors.toList()));
    }
}
