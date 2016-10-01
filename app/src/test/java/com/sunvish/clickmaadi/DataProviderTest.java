package com.sunvish.clickmaadi;

import com.sunvish.clickmaadi.com.sunvish.clickmaadi.logics.DataProvider;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class DataProviderTest {

    DataProvider data = new DataProvider();

    @Before
    public void setup(){

    }

    @Test
    public void testgetScreenHeight() throws Exception {
    }

    public void testgetRandomArrayList() throws Exception{

        ArrayList<Integer> res = data.getRandomArrayList(1,25);
        for(int i=1;i<=25;i++){
            assertTrue(res.contains(i));
        }
    }
}