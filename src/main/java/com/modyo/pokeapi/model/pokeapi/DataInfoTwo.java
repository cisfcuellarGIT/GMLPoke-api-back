/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modyo.pokeapi.model.pokeapi;

import lombok.Data;

/**
 *
 * @author juanCuellar
 */
@Data
public class DataInfoTwo {

    private DataInfo pokemon;
    private int slot;

    public DataInfoTwo() {
    }

    public DataInfoTwo(DataInfo pokemon) {
        this.pokemon = pokemon;
    }
}
