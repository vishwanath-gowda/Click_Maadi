package com.sunvish.clickmaadi.com.sunvish.clickmaadi.logics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kvishwan on 02/10/16.
 */
public class DataProvider {


    public int getScreenHieght(){

        return 0;
    }

    public int getScreenWidth(){

        return 0;
    }

    public ArrayList<Integer> getRandomArrayList(int start, int end){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=start;i<end;i++){
            res.add(i);
        }
        Collections.shuffle(res);
        return res;
    }
}

