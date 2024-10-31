
package com.eci.parcial2.services;


import java.util.Objects;

public class linearSearchC{

    public String linearSearchFunction (String lista, Long numero){
        var listado = lista.split(",");
        int  index = 0;
        for (String s : listado) {
            if (Objects.equals(s, numero.toString())){
                String indexFind = Integer.toString(index);
                return "Posición del elemento: "+indexFind;
            }
            index += 1;
        }
        return "El elemento no está presente";

    }

    

        
    }


