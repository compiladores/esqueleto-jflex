package ar.uba.fi.compiladores;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class Lang1Test{
    @Test
    public void testNumber() throws IOException{
        Reader reader = new StringReader("8 hello");
        Lang1 lexer = new Lang1(reader);
        assertEquals(3,lexer.yylex());
        assertEquals(1,lexer.yylex());
    }
}