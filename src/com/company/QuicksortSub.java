package com.company;

import com.company.vorgaben.PivotStrategie;
import com.company.vorgaben.Quicksort;
import com.company.vorgaben.SchluesselWertPaar;

/**
 * Created by michelbrueger on 21.06.18.
 */
public class QuicksortSub extends Quicksort {

    /**
     * Strategie zum finden des Pivotelements
     */
    protected PivotStrategie pivotStrategie;

    /**
     * Konstruktor.
     *
     * @param pivotStrategy
     */
    public QuicksortSub(PivotStrategie pivotStrategy) {
        super(pivotStrategy);
    }

    /**
     * Sortiert das Array a in-situ
     * @param a Array mit Schlüssel-Wert-Paaren, die nach den Schlüsseln aufsteigend sortiert werden sollen.
     */
    @Override
    public void sortiere(SchluesselWertPaar[] a) {
        _sortiere(a, 0, a.length-1);

    }

    /**
     * Hilfsfunktion für rekursion in sortiere(SchluesselWertPaar[] a)
     * @param a Array mit Schlüssel-Wert-Paaren, die nach den Schlüsseln aufsteigend sortiert werden sollen.
     * @param links Index ab dem sortiert werden soll
     * @param rechts Index bis zu dem sortiert werden soll
     */
    private void _sortiere(SchluesselWertPaar[] a, int links, int rechts) {
    }
}
