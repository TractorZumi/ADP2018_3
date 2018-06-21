package com.company;

import com.company.vorgaben.PivotStrategie;
import com.company.vorgaben.SchluesselWertPaar;

/**
 * Created by michelbrueger on 21.06.18.
 */
public class PivotLast implements PivotStrategie {
    @Override
    public <T extends Comparable<T>, U> int getIndex(SchluesselWertPaar<T, U>[] a, int iLinks, int iRechts) {
        return iRechts;
    }
}
