package com.company;

public class Enumeration {
    String size;

    Enumeration() {
    }

    public String getDescription(String size) {
        if (size == "XXS") {
            return "Детский размер";
        } else if (size == "XS" || size == "S" || size == "M" || size == "L"){
            return "Взрослый размер";
        } else{
            return "Такого размера нет";
        }

    }

    public String getDescriptionInt(int num_size) {
        if (num_size == 32) {
            return "Детский размер";
        } else if (num_size == 40 || num_size == 38 || num_size == 36 || num_size == 34){
            return "Взрослый размер";
        } else{
            return "Такого размера нет";
        }

    }
}
