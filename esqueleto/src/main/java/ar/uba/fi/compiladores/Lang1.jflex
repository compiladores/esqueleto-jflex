package ar.uba.fi.compiladores;

%%

%public
%class Lang1
%type Number
%unicode
%%

hello    { return 1; }
world    { return 2; }
[0-9]+    { return 3; }
[^]    { }