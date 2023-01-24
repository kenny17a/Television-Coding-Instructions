package com.polling;

import java.util.Arrays;

public class Poll {
    private String[] topics =
            {"Financial issues", "Psychological issues", "Gender inequality", "Hunger", "Illiteracy"};
    private int[][] responses = new int [5][10];
    private double averageRatings;

    public void calculateAverage(int... pollNumbers){
        int totalOfRatings = 0;
        for (int pollNumber:pollNumbers) {
            totalOfRatings += pollNumber;
        }
        averageRatings = totalOfRatings / pollNumbers.length;

    }

    public double getAverageRatings() {
        return averageRatings;
    }

    public void setAverageRatings(double averageRatings) {
        this.averageRatings = averageRatings;
    }

    public int getHighestPoints(int[] pollNumbers) {
        int highestNumber = pollNumbers[0];
        for (int i = 0; i < pollNumbers.length; i++) {
            if (pollNumbers[i] > highestNumber)
                highestNumber = pollNumbers[i];
        }

        return highestNumber;
    }

    public int getLowestPoints(int[] pollNumbers) {
        int lowestNumber = pollNumbers[0];
        for (int i = 0; i < pollNumbers.length; i++) {
            if (pollNumbers[i] < lowestNumber)
                lowestNumber = pollNumbers[i];

        }
        return lowestNumber;
    }

    public void displayTabularReport() {
        String header = String.
                format("\t\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


//        for (String topic : getTopics()) {
//            System.out.println(topic);
//            System.out.println();
//        }
//
        System.out.println(header);
        for (int index = 0; index < getResponses().length; index++) {
            System.out.printf("%s\t", getTopics()[index]);
            System.out.println(Arrays.toString(getResponses()[index]));
            System.out.println();

        }


    }
    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public int[][] getResponses() {
        return responses;
    }

    public void setResponses(int[][] responses) {
        this.responses = responses;
    }

}
