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
public class EvolutionResponse {

    private Chain chain;
    private int id;

    public EvolutionResponse() {
    }

    public EvolutionResponse(Chain chain) {
        this.chain = chain;
    }
    
    
}
