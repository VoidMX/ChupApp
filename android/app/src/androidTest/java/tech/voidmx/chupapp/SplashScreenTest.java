package tech.voidmx.chupapp;

import androidx.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplashScreenTest {

    @Rule
    public ActivityTestRule<SplashScreen> activityTestRule = new ActivityTestRule<>(SplashScreen.class);
    private SplashScreen splashScreenActivity = null;

    @Before
    public void setUp() { splashScreenActivity = activityTestRule.getActivity(); }

    @Test
    public void Logo_exists(){
        assertNotNull(splashScreenActivity.findViewById(R.id.iv_Logo));
    }

    @After
    public void tearDown() {
    }
}