package ait.Person;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    //        n1 идет перед n2 = -1
    //        n1 идет после n2 =  1
    //        n1 равно n2      =  0
    @Override
    public int compare(Integer n1, Integer n2) {
        boolean isNumEven1 = n1 % 2 == 0;
        boolean isNumEven2 = n2 % 2 == 0;

        if (isNumEven1 && !isNumEven2) {
            return -1;
        } else if (!isNumEven1 && isNumEven2) {
            return 1;
        } else if (!isNumEven1) {
            return n2.compareTo(n1);
        } else {
            return n1.compareTo(n2);
        }

    }
}
