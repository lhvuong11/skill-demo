import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
	@Test
	public void add(){
		assertEquals(2, SkillDemo.add(1,1)); // Test is failing first!
	}
}
