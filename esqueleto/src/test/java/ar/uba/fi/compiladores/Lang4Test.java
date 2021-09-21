package ar.uba.fi.compiladores;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class Lang4Test{
    @Test
    public void testNumber() throws IOException{
        Reader reader = new StringReader("8 world /* 8 9 88 77 99 100 */  hello 3");
        Lang4 lexer = new Lang4(reader);

        assertThrows(NumberException.class, ()->lexer.yylex());
        assertEquals("8", lexer.yytext());

        assertNull(lexer.yylex());
        assertEquals("world", lexer.yytext());

        assertNotNull(lexer.yylex());
        assertEquals("hello", lexer.yytext());

        assertThrows(NumberException.class, ()->lexer.yylex());
        assertEquals("3", lexer.yytext());
    }
}