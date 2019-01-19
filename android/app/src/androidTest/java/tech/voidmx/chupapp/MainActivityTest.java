package tech.voidmx.chupapp;

import android.app.Instrumentation;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.app.Activity;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static junit.framework.TestCase.assertNotNull;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;
    private Instrumentation.ActivityMonitor monitorGameSetActivity = getInstrumentation().addMonitor(GameSets.class.getName(),
            null,false);
    private Instrumentation.ActivityMonitor monitorMultiPhoneMenuActivity = getInstrumentation().addMonitor(MultiphoneMenu.class.getName(),
            null,false);

    @Before
    public void setUp() {
        mainActivity = activityTestRule.getActivity();
    }

    @Test
    public void SinglePhone_cardView_exists(){
        assertNotNull(mainActivity.findViewById(R.id.cvGameMode_1));
    }

    @Test
    public void MultiPhone_cardView_exists(){
        assertNotNull(mainActivity.findViewById(R.id.cvGameMode_2));
    }

    @Test
    public void SinglePhone_cardView_text_is_correct(){
        String singleCardViewText = "Single phone";
        onView(withId(R.id.tvGameMode_1)).check(matches(withText(singleCardViewText)));
    }

    @Test
    public void MultiPhone_cardView_text_is_correct(){
        String multiCardViewText = "Multi-phone";
        onView(withId(R.id.tvGameMode_2)).check(matches(withText(multiCardViewText)));
    }
    @Test
    public void SinglePhone_cardView_sends_to_gameSet_view(){
        onView(withId(R.id.cvGameMode_1)).perform(click());
        Activity gameSetActivity = getInstrumentation().waitForMonitorWithTimeout(monitorGameSetActivity, 2000);
        assertNotNull(gameSetActivity);

        gameSetActivity.finish();
    }

    @Test
    public void MultiPhone_cardView_sends_to_multiPhone_menu(){
        onView(withId(R.id.cvGameMode_2)).perform(click());
        Activity multiPhoneMenuActivity = getInstrumentation().waitForMonitorWithTimeout(monitorMultiPhoneMenuActivity,
                2000);
        assertNotNull(multiPhoneMenuActivity);
        multiPhoneMenuActivity.finish();
    }

    @After
    public void tearDown() {
        mainActivity = null;
    }
}