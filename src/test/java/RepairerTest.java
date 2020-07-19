import com.margo.Machine.CoffeeMachine;
import com.margo.Machine.WasherMachine;
import com.margo.Repairer.Repairer;
import org.junit.Assert;
import org.junit.Test;

public class RepairerTest {
    private final Repairer repairer = new Repairer();

    @Test
    public final void testFixCoffeeMachine() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String result = repairer.visit(coffeeMachine);
        Assert.assertTrue(result.startsWith("Fixing coffee machine"));
    }

    @Test
    public final void testFixWasherMachine() {
        WasherMachine washerMachine = new WasherMachine();
        String result = repairer.visit(washerMachine);
        Assert.assertTrue(result.startsWith("Fixing washer machine"));
    }
}
