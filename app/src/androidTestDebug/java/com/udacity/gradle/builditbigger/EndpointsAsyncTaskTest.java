package com.udacity.gradle.builditbigger;

import android.support.annotation.Nullable;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest implements InterfEndpointsAsyncTask{

    private String joke = null;
    private CountDownLatch latch;

    @Test
    public void AsyncTest() {
        try {
            latch = new CountDownLatch(1);
            new EndpointsAsyncTask(this).execute();
            latch.await(10, TimeUnit.SECONDS);

            assertNotNull("joke is null", joke);
            assertFalse("joke is empty", joke.isEmpty());
        } catch (Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Override
    public void onRetrieveJokeStart() {

    }

    @Override
    public void onRetrieveJokeFinish(@Nullable String result) {

        joke = result;
        latch.countDown();
    }
}