package com.example.tiendabackend.controller;

import com.example.tiendabackend.model.CatalogoItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value= "api/v1/catalogo")
public class CatalogoController {

    @GetMapping()
    public List<CatalogoItem> getAll() {
        return Arrays.asList(
                new CatalogoItem(1L, "headphone.jpg","Auricular Monoaureal","Sony",14F),
                new CatalogoItem(2L, "keyboard.jpg","Teclado Mecanico","Raizer",55F),
                new CatalogoItem(3L, "keyboard.jpg","Teclado Inalambrico","Sony",74F),
                new CatalogoItem(4L, "headphone.jpg","Auricular Inalambricos","Sony",22F),
                new CatalogoItem(5L, "headphone.jpg","Auriculares 8.1","Phillips",44F),
                new CatalogoItem(6L, "keyboard.jpg","Teclado Gamer","Logitech",11F),
                new CatalogoItem(7L, "monitor.jpg","Monitor 24 pulgadas","Samsung",99F)
        );
    }

}
