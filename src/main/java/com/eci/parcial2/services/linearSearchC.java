
package com.eci.parcial2.services;
import com.eci.parcial2.services.SearchRc;


import java.util.Objects;

public class linearSearchC{

    public SearchRc linearSearchFunction (String lista, Long numero){
        var listado = lista.split(",");
        int  index = 0;
        for (String s : listado) {
            if (Objects.equals(s, numero.toString())){
                String indexFind = Integer.toString(index);
                return new SearchRc("linearSearch",lista, numero.toString(), indexFind );
            }
            index += 1;
        }
        return new SearchRc("linearSearch",lista, numero.toString(), "-1" );

    }

    

        
    }


