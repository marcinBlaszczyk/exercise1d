package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest {

	private ArrayConverter converter;
		
		@Before
		public void setup() {
			converter = new ArrayConverter();
		}
		
		
		@Test(expected=NumberFormatException.class)
		public void shouldRaiseNumberFormatException() {
			//given
			String[] strings = new String[] { "bum" };
			
			//when
			converter.convertToInts(strings);
			
			//then
			//empty
		}
		
		@Test(expected=NullPointerException.class)
		public void shouldRaiseNullPointerException() {
			//given
			String[] strings = null;
			
			//when
			converter.convertToInts(strings);
			
			//then
			//empty
		}
		
		@Test
		public void shouldReturnIntTable() {
			//given
			String[] strings = new String[] { "9", "8", "7"};
			
			
			//when
			int[] result = converter.convertToInts(strings);
			
			//then
			assertThat(result[0], is(9));
			assertThat(result[1], is(8));
			assertThat(result[2], is(7));
		}

	}
