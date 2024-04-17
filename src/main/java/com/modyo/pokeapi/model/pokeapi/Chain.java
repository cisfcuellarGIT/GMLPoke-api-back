/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modyo.pokeapi.model.pokeapi;

import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author juanCuellar
 */
@Data
public class Chain {
    private ArrayList<EvolvesTo> evolves_to;
    private DataInfo species;

    public Chain() {
    }

    public Chain(ArrayList<EvolvesTo> evolves_to, DataInfo species) {
        this.evolves_to = evolves_to;
        this.species = species;
    }
    
    
}
