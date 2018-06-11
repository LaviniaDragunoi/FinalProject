package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4)
class EndpointsAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void buttonRetrivesNonEmptyString(){
        onView(withId(R.id.tell_joke_button)).perform(click());
        onView(withId(R.id.joke_text_view)).check(matches(not(withText(""))));
    }


}