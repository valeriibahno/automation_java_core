package homeWork19.builder;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class MainBuilder {

    private static final Logger logger = Logger.getLogger(MainBuilder.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        logger.info("Enter description of task:");
        String description = scanner.next();

        logger.info("Enter name of assignee:");
        String assignee = scanner.next();

        logger.info("Enter number of sprint:");
        int sprint = scanner.nextInt();

        logger.info("Enter number of storyPoint:");
        int storyPoint = scanner.nextInt();

        Task task = new Task.Builder(description).setAssignee(assignee).setNumberSprint(sprint).setStoryPoint(storyPoint).build();
        logger.info("Description of the task: " + task.getDescription());
        logger.info("Assignee of the task: " + task.getAssignee());
        logger.info("Reporter of the task: " + task.getReporter());
        logger.info("Number of sprint: " + task.getNumberSprint());
        logger.info("StoryPoint of task: " + task.getStoryPoint());
    }
}
