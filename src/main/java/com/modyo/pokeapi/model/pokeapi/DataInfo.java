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
public class DataInfo {

    private String name;
    private String url;
    
    public DataInfo(){
    }

    public DataInfo(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    
}
