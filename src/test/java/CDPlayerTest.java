import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;


    @Before
    public void before(){
       cdPlayer = new CDPlayer("Sony", "CD1", 6);
    }

    @Test
    public void hasMakeName() {
        assertEquals("Sony", cdPlayer.getmakeName());
    }

    @Test
    public void hasModelName() {
        assertEquals("CD1", cdPlayer.getmodelName());
    }

    @Test
    public void playMusic(){
        assertEquals("I am Playing A CD", cdPlayer.play("CD"));
    }

}
