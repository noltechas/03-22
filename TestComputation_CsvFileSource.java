package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount() throws Exception {

	  Computation com = new Computation();
	  int input1 = 100, input2 = 1;
	  int expected = 20;
      int result = com.getDiscount(input1, input2);
      Assert.assertEquals(result, expected);

   }
}
