package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country nigeria = new Country("Nigeria", new BigDecimal("203452505"));
        Country guinea = new Country("Guinea", new BigDecimal("12970000"));
        Country egypt = new Country("Egypt", new BigDecimal("100000408"));

        Country poland = new Country("Poland", new BigDecimal("38386000"));
        Country germany = new Country("Germany", new BigDecimal("83019200"));
        Country russia = new Country("Russia", new BigDecimal("146877088"));

        Country usa = new Country("USA", new BigDecimal("308878120"));
        Country canada = new Country("Canada", new BigDecimal("33989040"));
        Country panama = new Country("Panama", new BigDecimal("3559408"));

        List<Country> africa = new ArrayList<>();
        africa.add(nigeria);
        africa.add(guinea);
        africa.add(egypt);

        List<Country> europa = new ArrayList<>();
        europa.add(poland);
        europa.add(germany);
        europa.add(russia);

        List<Country> america = new ArrayList<>();
        america.add(usa);
        america.add(canada);
        america.add(panama);

        Continent africaContinent = new Continent("Africa", africa);
        Continent eurasiaContinent = new Continent("Eurasia", europa);
        Continent northAmericaContinent = new Continent("North America", america);

        List<Continent> continents = new ArrayList<>();
        continents.add(africaContinent);
        continents.add(eurasiaContinent);
        continents.add(northAmericaContinent);

        //When
        World world = new World(continents);
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expectedSand = new BigDecimal("931131769");
        assertEquals(expectedSand, result);
    }
}
