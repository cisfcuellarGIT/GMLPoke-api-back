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
public class ResultApiPokeApi {

    private int count;
    private String next;
    private Object previous;
    private ArrayList<DataInfo> results;
}
