package com.Television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {
    Tv television;

    @BeforeEach
    void setUp() {
        television = new Tv();

    }

    @Test
    public void testThatTelevisionCanBeOn() {
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
    }

    @Test
    public void testThatTelevisionCanBeOff() {
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void testThatTelevisionVolumeCanBeIncrease() {
        television.turnOn();
        for (int i = 0; i < 3; i++) {
            television.increaseVolume();
        }
        assertEquals(3, television.getVolume());
    }

    @Test
    public void testThatTelevisionVolumeCannotIncreaseWhenTvIsOff() {
        assertFalse(television.isOn());
        television.increaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    public void testThatTelevisionCannotIncreaseBeyondHundred() {
        television.turnOn();
        for (int i = 0; i < 100; i++) {
            television.increaseVolume();
        }
        assertEquals(100, television.getVolume());
        television.increaseVolume();
        assertEquals(100, television.getVolume());
    }

    @Test
    public void testThatVolumeCanDecrement() {
        television.turnOn();
        for (int i = 0; i < 5; i++) {
            television.increaseVolume();
        }

        assertEquals(5, television.getVolume());

        television.decreaseVolume();
        assertEquals(4, television.getVolume());
    }

    @Test
    public void testThatTvVolumeCannotDecreaseWhenOff() {
        television.turnOn();
        for (int i = 0; i < 5; i++) {
            television.increaseVolume();

        }
        assertEquals(5, television.getVolume());
        television.turnOff();
        assertFalse(television.isOn());
        television.decreaseVolume();
        assertEquals(5, television.getVolume());
    }

    @Test
    public void testThatTvVolumeCannotGoBelowZero() {
        television.turnOn();

        television.increaseVolume();
        television.increaseVolume();
        assertEquals(2, television.getVolume());

        television.decreaseVolume();
        television.decreaseVolume();
        television.decreaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    public void testThatTvCanBeMute() {
        television.turnOn();
        television.mute();
        assertTrue(television.isMute());

    }

    @Test
    public void testThatTvVolumeIsZeroWhenMutedEvenWhenVolumeIsIncrease() {
        television.turnOn();

        television.increaseVolume();
        television.increaseVolume();
        television.mute();
        assertTrue(television.isMute());
        assertEquals(0,television.getVolume());

    }
    @Test
    public void testThatTvCanBeMutedWhenTvIsOn(){
        television.mute();
        assertFalse(television.isMute());
    }
    @Test
    public void testThatTvCanBeUnmute(){
        television.turnOn();
        television.mute();
        assertTrue(television.isMute());
        television.unMute();
        assertFalse(television.isMute());
    }
    @Test
    public void testThatTvHasSameVolumeAfterTvIsUnmute(){
        television.turnOn();
        for (int i = 0; i < 15; i++) {
            television.increaseVolume();

        }
        assertEquals(15, television.getVolume());
        television.mute();
        assertTrue(television.isMute());
        assertEquals(0,television.getVolume());
        television.unMute();
        assertEquals(15,television.getVolume());


    }
    @Test
    public void testThatTvCanOnlyBeUnmuteWhenTvIsOn(){
        television.turnOn();
        television.mute();
        assertTrue(television.isMute());
        television.turnOff();
        television.unMute();
        assertFalse(television.isMute());
    }
    @Test
    public void testThatTvChannelsCanIncrease(){
        television.turnOn();
        for (int i = 0; i < 5; i++) {
            television.increaseChannel();
        }

        assertEquals(5,television.getChannel());
    }
    @Test
    public void testThatTvChannelCannotIncreaseWhenTvIsOff(){
        television.increaseChannel();
        assertEquals(0,television.getChannel());
    }
    @Test
    public void testThatTvChannelWasOnSameChannelWhenOn(){
        television.turnOn();
        assertTrue(television.isOn());
        television.increaseChannel();
        television.increaseChannel();
        assertEquals(2,television.getChannel());
        television.turnOff();
        assertFalse(television.isOn());
        television.turnOff();
        assertEquals(2,television.getChannel());
    }
    @Test
    public void testThatTvChannelCanDecrease(){
        television.turnOn();
        television.increaseChannel();
        television.increaseChannel();
        television.increaseChannel();
        assertEquals(3, television.getChannel());

        television.decreaseChannel();
        television.decreaseChannel();
        assertEquals(1,television.getChannel());
    }

    @Test
    public void testCannotGiveNegativeValue() {
        television.turnOn();
        television.decreaseChannel();
        assertEquals(0, television.getChannel());
    }
    @Test
    public void testThatChannelCannotDecreaseWhenOff(){
        television.decreaseChannel();
        assertEquals(0, television.getChannel());
    }
    @Test
    public void testForSetChannel(){
        television.turnOn();
        television.setChannel(95);
        assertEquals(95, television.getChannel());
    }
    @Test
    public void testThatNegativeValueCannotBeUseToSetChannel(){
        television.turnOn();
        television.setChannel(-15);
        assertEquals(0,television.getChannel());
    }
    }

