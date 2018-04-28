package pl.mateuszzalewski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SqInRect {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth || wdth == 0) {
            return null;
        } else if (lng > wdth) {
            int totalLengthDividedByWidth = lng / wdth;
            List<Integer> sidesList = new ArrayList<>(Collections.nCopies(totalLengthDividedByWidth, wdth));
            List<Integer> completingList = sqInRect(wdth, lng - wdth * totalLengthDividedByWidth);
            if (completingList != null) {
                sidesList.addAll(completingList);
            }
            return sidesList;
        } else {
            return sqInRect(wdth, lng);
        }
    }
}
