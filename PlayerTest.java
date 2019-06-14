import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void test() {
		int numQuarters = 48;
		Player macho = new Player (numQuarters);
		assertEquals(macho.money, 48);
		
	}

}