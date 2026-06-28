package com.kevin.tienda_online.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "carritos")
public class Carrito {

    @Id
    private String id;

    private String usuarioId;
    private List<CarritoItem> items = new ArrayList<>();
}
