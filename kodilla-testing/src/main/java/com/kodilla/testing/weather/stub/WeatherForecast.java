package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperatures() {
        double average = 0;
        int temperaturesMapSize = temperatures.getTemperatures().size();
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        return average / temperaturesMapSize;
    }

    public double calculateMedianTemperatures () {
        double median;
        int index = 0;
        List<Double> temperatureList = new ArrayList<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }
        Collections.sort(temperatureList);

        double middleNumOne = temperatureList.get(temperatureList.size() / 2);
        double middleNumTwo = temperatureList.get((temperatureList.size() / 2 ) - 1);

        if (temperatureList.size() % 2 == 0)
            median = (middleNumOne + middleNumTwo) / 2;
        else
            median = temperatureList.get(temperatureList.size() / 2);
        return median;
    }
}
