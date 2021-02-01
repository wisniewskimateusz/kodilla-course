package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetLastLog() {
        //Given
        logger.log("01.02.2021 - Error");
        //When
        String logs = logger.getLastLog();
        //Then
        assertEquals("Log: [01.02.2021 - Error]", logs);
    }
}