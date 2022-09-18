import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class TestDemoTest {

	TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAdded() {
		int a;
		int b;
		int expected;
		boolean expectException;	
	}
	@Test
	@ParameterizedTest
	void addPositive(int expected, boolean expectException) {
				
//		assertEquals( 6,testDemo.add(2,1));
//		assertEquals(20,testDemo.add(7,8));
//		assertEquals(4,testDemo.add(2,2));
	
	if(!expectException) {
	int a = 2;
	int b = 2;
	assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
	assertThatThrownBy(() ->  testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
	
		}

	argumentsForAddPositive();
		
	Stream.of();
	arguments(expected, expected, expected, expectException);
		
	}
	private void argumentsForAddPositive() {
		arguments(2, 4, 6, false);
		
	}
	private void arguments(int i, int j, int k, boolean b) {
		// TODO Auto-generated method stub
		
	}

	
	}
	
	//@Test.
	// void assertThatNumberSquaredIs¬Correct() {
		
		
	

