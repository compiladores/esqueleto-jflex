package ar.uba.fi.compiladores;

%%

%public
%class Lang2
%unicode
%%

hello    { return new Yytoken(); }
world    { return null; }
[0-9]+    { return new Yytoken(); }
[^]    { }