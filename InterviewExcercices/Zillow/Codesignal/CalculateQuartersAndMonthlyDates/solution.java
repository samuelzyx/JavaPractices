import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.time.*;
import java.time.format.*;

class Solution {
    private enum ScheduleType {
        MONTHLY("M"),
        QUARTERLY("Q");

        private String value;

        ScheduleType(String value) {
            this.value = value;
        }

        private String getValue() {
            return this.value;
        }

        private static final Map<String, ScheduleType> SCHEDULE_TYPE_VALUE_MAP = Stream.of(ScheduleType.values())
                .collect(Collectors.toMap(ScheduleType::getValue, Function.identity()));

        private static ScheduleType getByValue(String s) {
            if (SCHEDULE_TYPE_VALUE_MAP.containsKey(s)) {
                return SCHEDULE_TYPE_VALUE_MAP.get(s);
            }
            throw new IllegalArgumentException(s + " is not a valid schedule type");
        }
    }

    /**
     * Get the number of days in a month specified by a date
     * 
     * @param d date value to extract month value from
     * @return int number of days {1-31}
     */
    private static int daysInMonth(LocalDate d) {
        YearMonth ym = YearMonth.of(d.getYear(), d.getMonthValue());
        return ym.lengthOfMonth();
    }

    /**
     * Get the results of adding a number of days to input date
     * 
     * @param d    - date to add to
     * @param days - number of days to add, can be negative to subtract days
     * @return input date incremented by days
     */
    private static LocalDate addDays(LocalDate d, int days) {
        return d.plusDays(days);
    }

    /**
     * Gget the results of adding a number of months to input date
     * 
     * @param d      date to add to
     * @param months - number of months to add, can be negative to subtract months
     * @return input date incremented by months, last date of month is returned if
     *         target would otherwise roll over
     */
    private static LocalDate addMonths(LocalDate d, int months) {
        return d.plusMonths(months);
    }

    /**
     * Returns true if the year value represents a leap year
     * 
     * @param year - full (4 digit) year to evaluate
     * @return true if year is a leap year, otherwise false
     */
    private static boolean isLeapYear(int year) {
        YearMonth ym = YearMonth.of(year, 2);
        return ym.lengthOfMonth() == 29;
    }

    /**
     * Gets the first day in a month specified by date
     * 
     * @param d - used to specify any date in the target month
     * @return the first day of the target month
     */
    private static LocalDate startOfMonth(LocalDate d) {
        return LocalDate.of(d.getYear(), d.getMonthValue(), 1);
    }

    /**
     * Returns the difference of two dates in days. Earlier date is meant to be
     * passed first.
     * Otherwise difference will be negative.
     * 
     * @param earlierDate - base date for calculating difference
     * @param laterDate   - date to get number of days from earlierDate for
     * @return number of days between earlierDate and laterDate (not counting
     *         laterDate, itself).
     *         Swapping dates will result in a change in sign, but same absolute
     *         value.
     */
    private static int differenceInDays(LocalDate earlierDate, LocalDate laterDate) {
        return Period.between(earlierDate, laterDate).getDays();
    }

    /**
     * Returns the difference of two dates in full months. Earlier date is meant to
     * be passed first.
     * Otherwise difference will be negative.
     * 
     * @param earlierDate - base date for calculating difference
     * @param laterDate   - date to get number of days from earlierDate for
     * @return number of full months between earlierDate and laterDate (not counting
     *         laterDate, itself).
     *         Swapping dates will result in a change in sign, but same absolute
     *         value.
     * @examples
     *           differenceInMonths(new Date(2022,0,1), new Date(2022,1,1))
     *           // 1
     *           differenceInMonths(new Date(2022,0,2), new Date(2022,1,1))
     *           // 0
     *           differenceInMonths(new Date(2022,1,1), new Date(2022,0,1))
     *           // -1
     */
    private static int differenceInMonths(LocalDate earlierDate, LocalDate laterDate) {
        return Period.between(earlierDate, laterDate).getMonths();
    }

    private static LocalDate getNextReportDate(LocalDate curDate, ScheduleType scheduleType, int scheduleDay) {
        // Complete this function
        if(scheduleType.getValue().equals("M")){
            if(curDate.getDayOfMonth()<=scheduleDay){
                LocalDate resultDay = LocalDate.of(curDate.getYear(), curDate.getMonth(), scheduleDay);
                return resultDay;
            }else{
                LocalDate resultDay = LocalDate.of(curDate.getYear(), curDate.getMonth(), scheduleDay);
                resultDay.plusMonths(1);
                return resultDay;
            }
        }        
        //7-Oct-2022 Q 15
        if(scheduleType.getValue().equals("Q")){
            LocalDate firstQ = LocalDate.of(curDate.getYear(),Month.JANUARY, scheduleDay);
            LocalDate secondQ = LocalDate.of(curDate.getYear(),Month.APRIL, scheduleDay);
            LocalDate thirdQ = LocalDate.of(curDate.getYear(),Month.JULY, scheduleDay);
            LocalDate forthQ = LocalDate.of(curDate.getYear(),Month.OCTOBER, scheduleDay);
            LocalDate nextYearFQ = LocalDate.of(curDate.getYear(),Month.JANUARY, scheduleDay);
            nextYearFQ = nextYearFQ.plusYears(1);
            if(differenceInDays(curDate,firstQ)>=0){
                return firstQ;
            }else if(differenceInDays(curDate,secondQ)>=0){
                return secondQ;
            }else if(differenceInDays(curDate,thirdQ)>=0){
                return thirdQ;
            }else if(differenceInDays(curDate,forthQ)>=0){
                return forthQ;
            } else{
                return nextYearFQ;
            }
        }
        
        return LocalDate.now();//by default
    }

    public static void main(String[] args) throws Exception {
        // Supply input in the following format (one line per test case)
        // 7-Oct-2022 M 15
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        List<String> inputs = Files.readAllLines(Paths.get("inputs.txt"));
        for (String inputLine : inputs) {
            String[] parts = inputLine.split("\\s+");
            LocalDate curDate = LocalDate.parse(parts[0], formatter);
            ScheduleType scheduleType = ScheduleType.getByValue(parts[1]);
            int scheduleDay = Integer.parseInt(parts[2]);
            LocalDate result = getNextReportDate(curDate, scheduleType, scheduleDay);
            System.out.println(result);
        }
    }
}
