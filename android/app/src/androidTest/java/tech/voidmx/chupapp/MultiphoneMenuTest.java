package tech.voidmx.chupapp;

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

public class MultiphoneMenuTest {

    @Rule
    public ActivityTestRule<MultiphoneMenu> activityTestRule = new ActivityTestRule<>(MultiphoneMenu.class);
    private MultiphoneMenu multiPhoneMenuactivity = null;

    @Before
    public void setUp() {
        multiPhoneMenuactivity = activityTestRule.getActivity();
    }

    @Test
    public void Logo_exists(){ assertNotNull(multiPhoneMenuactivity.findViewById(R.id.ivLogo));}

    @Test
    public void Create_match_button_exists(){
        String createMatchButtonText = "Crear partida";
        assertNotNull(multiPhoneMenuactivity.findViewById(R.id.btn_createMatch));
        onView(withId(R.id.btn_createMatch)).check(matches(withText(createMatchButtonText)));
    }

    @Test
    public void Join_match_button_exists(){
        String joinMatchButtonText = "Unirse a partida";
        assertNotNull(multiPhoneMenuactivity.findViewById(R.id.btn_joinMatch));
        onView(withId(R.id.btn_joinMatch)).check(matches(withText(joinMatchButtonText)));
    }

    @After
    public void tearDown() {
        multiPhoneMenuactivity = null;
    }
}