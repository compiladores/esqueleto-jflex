package ar.uba.fi.compiladores;

%%

%public
%class Hello
%type HelloToken
%unicode
%yylexthrow LexerException
%%

hello    { return HelloToken.HELLO; }
world    { return HelloToken.WORLD; }
[0-9]+    { return HelloToken.NUMBER; }
[ \t\f]  { } //ignorar
[^]    { throw new LexerException(); }