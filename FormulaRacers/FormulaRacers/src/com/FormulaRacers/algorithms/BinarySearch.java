package com.FormulaRacers.algorithms;
import com.FormulaRacers.models.FormulaRacersModel;

import java.util.ArrayList;
public class BinarySearch {

     public int searchbySn(int searchWord, ArrayList<FormulaRacersModel> racersList) {
        int low = 0;
        int high = racersList.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (racersList.get(mid).getSN() == searchWord) {
                return mid;

            } else if (racersList.get(mid).getSN() < searchWord) {
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        return -1;
    }
}
