package a.kaskov.myself.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckArray {

    public String getUniqueEl(String[] _arr){
        Set<String> set = new HashSet<>(Arrays.asList(_arr));
        return set.toString();
    }

    public String getCountUniqueEl(String[] _arr){

        HashMap<String,Integer> elToCount = new HashMap<>();

        for (String el : _arr) {
            if  (!elToCount.containsKey(el)){
                elToCount.put(el,0);
            }

            elToCount.put(el,elToCount.get(el)+1);

        }

        return elToCount.toString();
    }

}
