/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // testPresidentsFirst100Days();
        // testPopularBirthdays();
        // testEarlyRetirement();
//         testLaborDay();
//         testElectionDay();
        testAnniversary();
    }

    /**
     * TASK: new American presidents are often measured by their performance during the first 100 days in office.
     * Inauguration Day 2017 is Jan 20.  When is this president's 100-day deadline?
     * <p>
     * RESULT:
     */
    public static void testPresidentsFirst100Days() {
        LocalDate ingauguration = LocalDate.of(2017, 1, 20);
        LocalDate deadline = ingauguration.plusDays(100);
        System.out.println(deadline);
    }

    /**
     * TASK: Certain times of the year seem to have more birthdays than other times.
     * Some believe that this is because more babies are conceived during certain times of year.
     * Below, assume a due date 38 weeks after conception, during a non-leap-year.
     * <p>
     * RESULT:
     */
    public static void testPopularBirthdays() {
        LocalDate valentinesDay = LocalDate.of(2023, 2, 23);
        LocalDate expectedDate = valentinesDay.plusWeeks(38);
        System.out.println(expectedDate);
    }

    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     * <p>
     * RESULT:
     */
    public static void testEarlyRetirement() {
        LocalDate myBday = LocalDate.of(1996, 8, 23);
        LocalDate retirement = myBday.plusYears(59).plusMonths(6);
        System.out.println(retirement);
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     * <p>
     * RESULT:
     */
    public static void testLaborDay() {
        LocalDate laborDay96 = LocalDate.of(1996, 9, 1);
        LocalDate laborDay = laborDay96.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(laborDay);
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday immediately after the 1st Monday in November.
     * When is Election Day 2024?
     * <p>
     * RESULT:
     */
    public static void testElectionDay() {
        LocalDate nov2 = LocalDate.of(2024, 11, 2);
        LocalDate elect = nov2.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(elect);
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday, they'd like to have their party the following Saturday.
     * What is the date of the party?
     * <p>
     * RESULT:
     */
    public static void testAnniversary() {
        LocalDate marriedOn = LocalDate.of(1969, 6, 6);
        LocalDate party = marriedOn.plusYears(50).with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(party);
    }
}