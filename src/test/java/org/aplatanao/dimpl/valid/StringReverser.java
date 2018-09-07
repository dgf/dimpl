package org.aplatanao.dimpl.valid;

public class StringReverser {

    public String reverse(String message) {
        return new StringBuilder(message).reverse().toString();
    }

}
