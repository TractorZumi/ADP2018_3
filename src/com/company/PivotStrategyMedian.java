package com.company;

/**
 * Created by michelbrueger on 21.06.18.
 */
public class PivotStrategyMedian implements PivotStrategie {
    @Override
    public <T extends Comparable<T>, U> int getIndex(SchluesselWertPaar<T, U>[] a, int iLinks, int iRechts) {
        return computeMedian(a, iLinks, iRechts);
    }

    private <T extends Comparable<T>, U> int computeMedian(SchluesselWertPaar<T, U>[] a, int iLinks, int iRechts) {
        int medianIndex = -1;
        int left = (int) a[iLinks].getSchluessel();
        int right = (int) a[iRechts].getSchluessel();
        int middle = (int) a[(iRechts+iLinks)/2].getSchluessel();

        int median = left+right+middle - (Math.max(Math.max(left, right),middle)) - (Math.min(Math.min(left,right),middle));

        if(median == left) medianIndex = iLinks;
        if(median == right) medianIndex = iRechts;
        if(median == middle) medianIndex = (iRechts+iLinks)/2;

        return medianIndex;
    }
}
