package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayCalcTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/holiday.csv")
    void CalculateHoliday(int income, int expenses, int threshold, int expected) {
        HolidayCalc service = new HolidayCalc();


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }


}