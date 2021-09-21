package ar.uba.fi.compiladores;

%%

%public
%class Lang5
%unicode
%{
    public int sum=0; 
%}
%%

[0-9]+    { sum+=Integer.parseInt(yytext()); return null; } //probar sin returns
-[0-9]+    { sum+=Integer.parseInt(yytext()); return null; }
[^]         { }