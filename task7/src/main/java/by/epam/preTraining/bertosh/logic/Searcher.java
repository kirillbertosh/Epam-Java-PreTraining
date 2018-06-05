package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Airplane;

public class Searcher {

    public static Airplane linearSearch(Airplane[] airplanes) {
        if (airplanes == null){
            return null;
        }
        Airplane theFastest = airplanes[0];
        for (int i = 1; i < airplanes.length; i++){
            if (airplanes[i] != null){
                if (airplanes[i].getMaxSpeed() > theFastest.getMaxSpeed()){
                    theFastest = airplanes[i];
                }
            }
        }
        return theFastest;
    }
}
