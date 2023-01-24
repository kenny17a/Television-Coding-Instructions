package com.Polling;

import com.polling.Poll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {
    private Poll poll;
    @BeforeEach
    void setUp(){
        poll = new Poll();

    }
    @Test
    void testCalculateAverage(){
        //given
        int[] pollNumbers = {10,20,30,40,50};
        //when
        poll.calculateAverage(pollNumbers);
        //assert
        assertEquals(30, poll.getAverageRatings());
    }
    @Test
    void testToCalculateHighestPoints(){
        //given
        int[] pollNumbers = {10,20,30,40,50};
        //when
        int highestPoint = poll.getHighestPoints(pollNumbers);
        assertEquals(50, highestPoint);
    }
    @Test
    void testToCalculateLowestPoints(){
        //given
        int[] pollNumbers = {10,20,30,40,50};
        //when
        int lowestPoint = poll.getLowestPoints(pollNumbers);
        assertEquals(10, lowestPoint);
    }
    @Test
    void testTabularDisplay(){
        poll.displayTabularReport();
    }

}
