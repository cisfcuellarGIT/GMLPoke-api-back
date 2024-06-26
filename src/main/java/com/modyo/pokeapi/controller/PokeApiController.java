/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modyo.pokeapi.controller;

import com.modyo.pokeapi.service.PokeApiService;
import com.modyo.pokeapi.model.response.ResponseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juanCuellar
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class PokeApiController {

    @Autowired
    PokeApiService apiService;

    @GetMapping("getListPokemon")
    public ResponseApi apiPokeApi(@RequestParam(value = "limit") int limit, @RequestParam(value = "offset") int offset) {
        return this.apiService.apiPokeApi(limit, offset);
    }

    @GetMapping("getDetailPokemon")
    public ResponseApi getDetailPokemon(@RequestParam(value = "name") String name) {
        return this.apiService.apiDetailPokemon(name);
    }

    @GetMapping("getAllTypes")
    public ResponseApi getAllTypes() {
        return this.apiService.apiListType();
    }

    @GetMapping("getListPokemonFromType")
    public ResponseApi getListPokemonFromType(@RequestParam(value = "limit") int limit, @RequestParam(value = "offset") int offset, @RequestParam(value = "type") String type) {
        return this.apiService.apiPokemonFromType(limit, offset, type);
    }

}
