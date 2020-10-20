package com.PPKWU.ZAD1;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringReverser {

    public String Reverse (String entryText) { return new StringBuilder(entryText).reverse().toString();}

}
