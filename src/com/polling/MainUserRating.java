package com.polling;

import com.polling.Poll;
import com.polling.UserInvalidInputException;

import java.util.Scanner;

public class MainUserRating {
    private static Poll poll = new Poll();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] topics = poll.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome to unicorn poll");
        var response = "yes";
        while (response.equals("yes")) {

            for (int index = 0; index < numberOfTopics; index++) {
                System.out.println("rate " + topics[index]);
                int userRatings = scanner.nextInt();
                if (userRatings < 1 || userRatings > 10)
                    throw new UserInvalidInputException("Invalid input");
            saveRating(index, userRatings);
            }
            System.out.println("continue?");
            response = scanner.next();

        }
        poll.displayTabularReport();
        System.out.println();
    }
    private static void saveRating(int issueNumber, int userRating){
        int[][] responseDb = poll.getResponses();
        responseDb[issueNumber][userRating -1] = responseDb[issueNumber][userRating -1]+1;
    }
}