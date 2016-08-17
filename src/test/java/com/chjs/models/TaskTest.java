package com.chjs.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 8/17/16.
 */
public class TaskTest {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldCreateInstanceOfTask() throws Exception{
        Task t = new Task();
        //assertThat(t, instanceOf(Task.Class));
        assertTrue(t.getCreatedDt().getTime() > 0);
        assertTrue(t.getUpdatedDt().getTime() > 0);
    }

    @Test
    public void shouldGetAndSetTaskIdOnTask() throws Exception{
        Task t = new Task();
        t.setId(3);
        assertEquals(3, t.getId());

    }

    @Test
    public void shouldGetAndSetTaskNameOnTask() throws Exception{
        Task t = new Task();
        t.setName("Got Milk");
        assertEquals("Got Milk", t.getName());

    }
    @Test
    public void shouldGetAndSetDueOnTask() throws Exception{
        Task t = new Task();
        t.setDue(format.parse("2015-03-11"));
        assertEquals("Wed Mar 11 00:00:00 CDT 2015", t.getDue().toString());

    }

    @Test
    public void shouldGetAndSetIsCompleteTask() throws Exception{
        Task t = new Task();
        t.setComplete(true);
        assertTrue(t.getComplete());

    }

    @Test
    public void shouldGetAndSetCreatedDtTask() throws Exception{
        Task t = new Task();
        t.setCreatedDt(format.parse("2015-03-11"));
        assertEquals("Wed Mar 11 00:00:00 CDT 2015", t.getCreatedDt().toString());

    }
    @Test
    public void shouldGetAndSetUpdatedDtTask() throws Exception{
        Task t = new Task();
        t.setUpdatedDt(format.parse("2015-03-11"));
        assertEquals("Wed Mar 11 00:00:00 CDT 2015", t.getUpdatedDt().toString());

    }
    @Test
    public void shouldGetAndSetnewUpdatedDtTask() throws Exception{
        Task t = new Task();
        t.setUpdatedDt(null);
        t.updateTime();
        assertTrue(t.getUpdatedDt().getTime() > 0);

    }
}