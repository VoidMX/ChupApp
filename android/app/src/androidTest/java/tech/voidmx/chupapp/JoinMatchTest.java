package tech.voidmx.chupapp;

import android.graphics.Paint;
import androidx.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class JoinMatchTest {

    @Rule
    public ActivityTestRule<JoinMatch> activityTestRule = new ActivityTestRule<>(JoinMatch.class);
    private JoinMatch joinMatchActivity = null;
    
    @Before
    public void setUp() {
        joinMatchActivity = activityTestRule.getActivity();
    }

    @Test
    public void Enter_pin_textView_exists(){
        String enterPinText = "Ingrese el pin:";
        assertNotNull(joinMatchActivity.findViewById(R.id.tv_enterPin));
        onView(withId(R.id.tv_enterPin)).check(matches(withText(enterPinText)));
    }

    @Test
    public void Enter_pin_editText_exists(){
        assertNotNull(joinMatchActivity.findViewById(R.id.et_pin));
    }

    @After
    public void tearDown() {
        joinMatchActivity = null;
    }
}