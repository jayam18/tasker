package com.chjs.models;

import groovy.lang.DelegatesTo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ErrorResponseTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldCreateErrorResponseAndGetMessage() throws Exception {
        ErrorResponse er = new ErrorResponse("Task Not Found");
        assertEquals("Task Not Found", er.getMessage());

    }
}