package com.cbfacademy;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("This leap year kata should")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class YearTest {

    static Stream<Arguments> InputAndOutput() {
        return Stream.of(
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, true),
            arguments(2001, false),
            arguments(2002, false),
            arguments(2003, false),
            arguments(2004, true)
        );
    }

    @ParameterizedTest
    @MethodSource("InputAndOutput")
    @DisplayName("return TRUE when input is a leap year")
    public void printsTrueOrFalse(Integer number, Boolean expected) {
        final Boolean actual = Year.isLeap(number); 
        assertThat(actual, is(expected));
    }
}

// @Test
//     @DisplayName("returns true when input is divisible by 400")
//     public void returnTrueWhenInputIsDivisbleBy400() {
//        final String actual = Year.of(400);
//         assertThat(actual, is("true"));
        
//     }


// @Test
//     @DisplayName("return false when input is divisible by 100 but not divisble by 400")
//     public void returnFalseWhenInputIsDivisbleBy100ButNotBy400() {
//        final String actual = Year.of(300);
//         assertThat(actual, is("false"));
        
//     }

//     @Test
//     @DisplayName("return true when input is divisible by 4 but not divisble by 100")
//     public void returnTrueWhenInputIsDivisbleBy4ButNotBy100() {
//        final String actual = Year.of(36);
//         assertThat(actual, is("true"));
        
//     }

//     @Test
//     @DisplayName("return false when input is not divisible by 4")
//     public void returnFalseWhenInputIsNotDivisbleBy4() {
//        final String actual = Year.of(455);
//         assertThat(actual, is("false"));
        
//     }
// }