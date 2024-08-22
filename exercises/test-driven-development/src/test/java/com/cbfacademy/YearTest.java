package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "This leap year kata should")
public class YearTest {

    @Test
    @DisplayName("returns 0 when input is 400")
    public void returns0WhenInputIs400() {
       final String actual = Year.of(400);
        assertThat(actual, is("0"));
    }
}
