import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GasMileageCalculatorTest{
	
	@Test
	public void testCanCalculateMilesPerGallon(){
	
		//given
		GasMileageCalculator calculator = new GasMileageCalculator();

		//when
		double numberOfMilesDriven = 30.00;
		double numberOfGallons = 20;
		double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);

		//assert
		assertEquals(1.5, milesPerGallon);
	}

	@Test

	public void testThatCalculatorCanMultiplyTwoPositiveNumbers(){


			//given
			GasMileageCalculator calculator = new GasMileageCalculator();

			//when
			int base = 4;
			int exponent = 2;
			int result = calculator.timesDigit(base, exponent); 

			//assert
			assertEquals(8, result);
				

		}

}