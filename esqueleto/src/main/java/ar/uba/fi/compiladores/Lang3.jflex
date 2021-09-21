package ar.uba.fi.compiladores;

%%

%public
%class Lang3
%unicode
%%

hello    { return new Yytoken(); }
world    { return null; }
[0-9]+    { throw new NumberException(); }
[^]    { }