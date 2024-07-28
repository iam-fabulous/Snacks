import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySnacksTest{

	@Test
	public void testForLargestElementInAnArray(){
		int[] array = {1, 2, 3};
		ArraySnacks compute = new ArraySnacks();
		int result = compute.largestelement(array);
		assertEquals(3, result);
	}



}