package org.example;

import java.util.Date;

public record Order(int id, ProductRepo productRepo, Date date) {
}
