package ar.uba.fi.compiladores;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class Lang2Test{
    @Test
    public void testNumber() throws IOException{
        Reader reader = new StringReader("8 world   hello");
        Lang2 lexer = new Lang2(reader);
        assertNotNull(lexer.yylex());
        assertNull(lexer.yylex());
        assertNotNull(lexer.yylex());
    }
}