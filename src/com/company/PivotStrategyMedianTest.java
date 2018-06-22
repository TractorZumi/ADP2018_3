package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Created by michelbrueger on 22.06.18.
 */
public class PivotStrategyMedianTest {
    PivotStrategie psMedian;
    SchluesselWertPaar<Integer, String>[] daten5;
    SchluesselWertPaar<Integer, String>[] daten4;

    SchluesselWertPaar<Integer, String> swp1;
    SchluesselWertPaar<Integer, String> swp2;
    SchluesselWertPaar<Integer, String> swp3;
    SchluesselWertPaar<Integer, String> swp4;
    SchluesselWertPaar<Integer, String> swp5;


    @Before
    public void setUp() throws Exception {
        psMedian = new PivotStrategyMedian();
        swp1 = new SchluesselWertPaar<>(1, "Eins");
        swp2 = new SchluesselWertPaar<>(2, "Zwei");
        swp3 = new SchluesselWertPaar<>(3, "Drei");
        swp4 = new SchluesselWertPaar<>(4, "Vier");
        swp5 = new SchluesselWertPaar<>(5, "Fuenf");
        daten5 = new SchluesselWertPaar[5];
        daten5[0] = swp1;
        daten5[1] = swp2;
        daten5[2] = swp3;
        daten5[3] = swp4;
        daten5[4] = swp5;
        daten4 = new SchluesselWertPaar[4];
        daten4[0] = swp3;
        daten4[1] = swp1;
        daten4[2] = swp4;
        daten4[3] = swp2;


    }

    @Test
    public void getIndex() throws Exception {
        assertEquals(2, psMedian.getIndex(daten5, 0, daten5.length-1));
        daten5[0] = swp1;
        daten5[1] = swp2;
        daten5[2] = swp5;
        daten5[3] = swp4;
        daten5[4] = swp3;
        assertEquals(4, psMedian.getIndex(daten5, 0, daten5.length-1));
        assertEquals(3, psMedian.getIndex(daten4, 0, daten4.length-1));

    }

}