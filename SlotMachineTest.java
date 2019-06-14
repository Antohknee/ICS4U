import static org.junit.Assert.*;
import org.junit.Test;

public class SlotMachineTest {
	@Test
	public void test() {
		SlotMachine mach1 = new SlotMachine(3, 4, 0, 1);
		assertEquals(mach1.costperplay, 1);
		int result = mach1.Spin();
		assertEquals(result, 0);
		result = mach1.Spin();
		result = mach1.Spin();
		result = mach1.Spin();
		assertEquals(result, 4);

	}

}