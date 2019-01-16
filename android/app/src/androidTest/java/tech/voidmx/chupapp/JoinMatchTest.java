package tech.voidmx.chupapp;

import android.graphics.Paint;
import androidx.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.*;

public class JoinMatchTest {

    @Rule
    public ActivityTestRule<JoinMatch> activityTestRule = new ActivityTestRule<>(JoinMatch.class);
    private JoinMatch joinMatchActivity = null;
    
    @Before
    public void setUp() throws Exception {
        joinMatchActivity = activityTestRule.getActivity();
        joinMatchActivity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        joinMatchActivity = null;
    }
}