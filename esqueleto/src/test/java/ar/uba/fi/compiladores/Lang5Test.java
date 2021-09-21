package ar.uba.fi.compiladores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class Lang5Test{
    @Test
    public void testNumber() throws IOException{
        Reader reader = new StringReader("1 2 -5 88");
        Lang5 lexer = new Lang5(reader);
        lexer.yylex();
        assertEquals(1,lexer.sum);
        lexer.yylex();
        lexer.yylex();
        assertEquals(-2,lexer.sum);
        lexer.yylex();
        assertEquals(86,lexer.sum);
    }
}