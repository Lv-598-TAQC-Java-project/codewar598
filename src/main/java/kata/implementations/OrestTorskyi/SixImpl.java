package kata.implementations.OrestTorskyi;

import kata.Six;

import java.util.ArrayList;
import java.util.List;

public class SixImpl implements Six {

    public long findNb(long m) {
        long count = 0;
        int i = 1;
        while (count < m) {
            count += Math.pow(i, 3);
            i++;
        }
        if (count == m) {
            return (i - 1);
        } else {
            return -1;
        }
    }

    public String balance(String book) {
        return null;
    }


}