package com.company;

/**
 * Created by michelbrueger on 21.06.18.
 */
public class QuicksortLoesung<T extends Comparable<T>, U> extends Quicksort {

    /**
     * Strategie zum finden des Pivotelements
     */
//    protected PivotStrategie pivotStrategie;

    /**
     * Konstruktor.
     *
     * @param pivotStrategy
     */
    public QuicksortLoesung(PivotStrategie pivotStrategy) {
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
        int pivotIndex = pivotStrategy.getIndex(a, links, rechts);
        T pivotKey = (T) a[pivotIndex].getSchluessel();
        if(a.length <= 1){ return; }

        while(a[links].getSchluessel().compareTo(a[pivotIndex].getSchluessel()) < 0) links += 1;
        while(a[rechts].getSchluessel().compareTo(a[pivotIndex].getSchluessel()) > 0) rechts += 1;
        if(links<rechts) swap(a,links,rechts);

//        if(a[links].getSchluessel().compareTo(a[rechts].getSchluessel()) == -1){
//
//        }
    }

    private void swap(SchluesselWertPaar[] a, int links, int rechts) {
        SchluesselWertPaar temp = a[links];
        a[links] = a[rechts];
        a[rechts] = temp;
    }
}
