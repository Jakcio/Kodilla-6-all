package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent){
        this.continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
