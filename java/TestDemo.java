import java.util.Random;
import static org.mockito.Mockito.doReturn;


public class TestDemo {

	
	public int addPositive(int a, int b) {
		
		int sum = a +b;
		if (a + b > 0) return sum;
		if (a+b <= 0)
			throw new IllegalArgumentException 
			("Both parameters must be positive!");
		return  sum;
		
	}
	
	void randomNumberSquared() {
		
		int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
			
		}
		
		return int;
		
		TestDemo mockDemo = spy(testDemo);
		doReturn(aValue).when(mockedObject).¬methodCall();
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
			
	}

}
