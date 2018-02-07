package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)

public class AsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void doTheTest() throws InterruptedException, ExecutionException, TimeoutException {

        FetchJokeTask jokeAsyncTask=new FetchJokeTask(mActivityRule.getActivity().getApplicationContext());
        jokeAsyncTask.execute();
        try {
            String result=jokeAsyncTask.get(30, SECONDS);
            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}
