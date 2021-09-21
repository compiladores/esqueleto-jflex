package ar.uba.fi.compiladores;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class Lang3Test{
    @Test
    public void testNumber() throws IOException{
        Reader reader = new StringReader("8 world   hello 3");
        Lang3 lexer = new Lang3(reader);
        assertThrows(NumberException.class, ()->lexer.yylex());
        assertNull(lexer.yylex());
        assertNotNull(lexer.yylex());
        assertThrows(NumberException.class, ()->lexer.yylex());
    }
}