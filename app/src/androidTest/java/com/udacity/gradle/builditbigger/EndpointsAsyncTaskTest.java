package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;

public class EndpointsAsyncTaskTest {

    @Test
    public void responseNotEmpty() {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(InstrumentationRegistry.getTargetContext());

        String joke = "";
        try {
            joke = task.get(1, TimeUnit.MINUTES);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assertFalse(joke.isEmpty());
        }
    }

}