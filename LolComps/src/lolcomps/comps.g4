grammar comps;

IDENT: (('a'..'z')|('A'..'Z')|'_')(('a'..'z')|('A'..'Z')|('0'..'9')|'_')*;

CAMPEAO: ('\'')(('a'..'z')|('A'..'Z')|'\'' | ' ' | '.')* ('\'');

VALOR: ('0'..'9')+('.'('0'..'9'))?;

ESPACOS : (' ' |'\t' | '\r' | '\n') {skip(); };

ERROR: . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); };

programa : nome posicoes carac mais_comp;

mais_comp: (nome posicoes carac mais_comp)?;

nome: '(' IDENT ')';

posicoes: '[' listacamps ']';

listacamps: top jungle mid adc sup;

top: 'top' '='   campeoes ;

jungle: 'jungle' '='  campeoes ;

mid: 'mid' '='  campeoes ;

adc: 'adc' '='  campeoes ;

sup: 'sup' '='  campeoes ;

mais_campeoes: (',' campeoes)?;

campeoes:  CAMPEAO  mais_campeoes;

carac: '[' lista mais_lista']';

lista:  'engage' ',' eng=VALOR  |
        'disengage' ',' dis=VALOR  |
        'siege' ',' sie=VALOR  |
        'poke' ',' pok=VALOR  |
        'pickoff' ',' pick=VALOR  |
        'cc' ',' cc=VALOR  |
        'splitpush' ',' spl=VALOR  |
        'globalpresence' ',' glob=VALOR  |
        'clearwave' ',' clear=VALOR  |
        'earlygame' ',' ear=VALOR  |
        'midgame' ',' midg=VALOR  |
        'lategame' ',' lat=VALOR  ;

mais_lista : (lista mais_lista)?;


