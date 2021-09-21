package ar.uba.fi.compiladores;

%%

%public
%class Lang4
%unicode

%state COMMENT_STATE 
%%

<YYINITIAL>{

    hello    { return new Yytoken(); }
    world    { return null; }
    [0-9]+    { throw new NumberException(); }
    "/*"     {yybegin(COMMENT_STATE);}
    [^]    { }
}
<COMMENT_STATE>{
    "*/" {yybegin(YYINITIAL);}
    [^]    { }
}
