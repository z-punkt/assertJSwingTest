package de.webnexus;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.swing.core.matcher.JButtonMatcher.withText;


/**
 * GUI-Test for simple App.
 */
public class AppTest 
{
    private FrameFixture window;

    @Before
    public void setUp(){
        App frame = GuiActionRunner.execute(() -> new App());
        window = new FrameFixture(frame);
        window.show();
    }

    @Test
    public void simpleTest(){
        window.button(withText("OK")).click();
        window.textBox().requireText(App.MESSAGE);
    }

    @After
    public void cleanUP(){
       window.cleanUp();
    }
}
