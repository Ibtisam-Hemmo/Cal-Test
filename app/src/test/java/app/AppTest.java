/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void appAdd() {
        App classTest = new App();
        assertEquals(11, classTest.add(5,6), "PASS");
    }
    @Test void appSub() {
        App classTest = new App();
        assertEquals(4, classTest.sub(10,6), "PASS");
    }
    @Test void appMulti() {
        App classTest = new App();
        assertEquals(6, classTest.multi(2,3), "PASS");
    }
    @Test void appDiv() {
        App classTest = new App();
        assertEquals(3, classTest.division(9,3), "PASS");
    }

    
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		App calculator = new App();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

    @ParameterizedTest(name = "{2} - {1} = {1}")
	@CsvSource({
			"5,    0,   5",
			"6,    2,   4",
			"55,  51, 4"
	})
	void sub(int first, int second, int expectedResult) {
		App calculator = new App();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " -" + second + " should equal " + expectedResult);
	}

    @ParameterizedTest(name = "{2} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2,   2",
			"6,  3, 18",
			"100,  2, 200"
	})
	void multi(int first, int second, int expectedResult) {
		App calculator = new App();
		assertEquals(expectedResult, calculator.multi(first, second),
				() -> first + " *" + second + " should equal " + expectedResult);
	}

    @ParameterizedTest(name = "{2} / {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"10,    2,   5",
			"8,  2, 4",
			"200,  100, 2"
	})
	void division(int first, int second, int expectedResult) {
		App calculator = new App();
		assertEquals(expectedResult, calculator.division(first, second),
				() -> first + " /" + second + " should equal " + expectedResult);
	}

}