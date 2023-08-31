package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

public class DateSortTest {
    //    В классе DateSortTest из классной работы,
    //    реализовать компаратор в методе setUp,
    //    чтобы тест был верный. Просьба не использовать Java Time API.

    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            //        s1 идет перед s2 = -1
            //        s1 идет после s2 =  1
            //        s1 равно n2      =  0
            //TODO
            String[] strDate1 = s1.split("-");
            String[] strDate2 = s2.split("-");

            int[] arrDate1 = new int[strDate1.length];
            int[] arrDate2 = new int[strDate2.length];

            for (int i = 0; i < arrDate1.length; i++) {
                arrDate1[i] = Integer.parseInt(strDate1[i]);
                arrDate2[i] = Integer.parseInt(strDate2[i]);
            }
            int year = Integer.compare(arrDate1[2], arrDate2[2]);
            int month = Integer.compare(arrDate1[1], arrDate2[1]);
            int day = Integer.compare(arrDate1[0], arrDate2[0]);

            if (year != 0) {
                return year;  // Сравнение по годам
            }
            if (month != 0) {
                return month; // Сравнение по месяцам
            }
            return day;

        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        System.out.println("======firstDates========");
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }
        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);

        System.out.println("======dates========");
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }
        System.out.println("======expected========");

        for (int i = 0; i < expected.length; i++) {
            System.out.println(expected[i]);
        }
    }
}