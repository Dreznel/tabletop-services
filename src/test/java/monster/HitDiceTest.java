package monster;

import dice.Dice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HitDiceTest {

    private HitDice testHitDice;

    @Before
    public void setUp() {
        this.testHitDice = new HitDice(3, 10);
    }

    @Test
    public void testRollHp() {
        Dice mockDice = mock(Dice.class);
        when(mockDice.roll()).thenReturn(10);
        Assert.assertEquals(30, testHitDice.rollHp(mockDice));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("3d10", testHitDice.toString());
    }
}