grammar comps;

IDENT: (('a'..'z')|('A'..'Z')|'_')(('a'..'z')|('A'..'Z')|('0'..'9')|'_')*;

CAMPEAO: ('\'')(('a'..'z')|('A'..'Z')|'\'' | ' ')* ('\'');

VALOR: ('0'..'9')+('.'('0'..'9'))?;

ESPACOS : (' ' |'\t' | '\r' | '\n') {skip(); };

ERROR: . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); };

programa : nome posicoes carac bans mais_comp;

mais_comp: (nome campeoes carac bans mais_comp)?;

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

lista:  'engage' ',' VALOR  |
        'disengage' ',' VALOR  |
        'siege' ',' VALOR  |
        'poke' ',' VALOR  |
        'pickoff' ',' VALOR  |
        'cc' ',' VALOR  |
        'split' ',' VALOR  |
        'global' ',' VALOR  |
        'clearw' ',' VALOR  |
        'early' ',' VALOR  |
        'mid' ',' VALOR  |
        'late' ',' VALOR  ;

mais_lista : (lista mais_lista)?;

bans: ('[' CAMPEAO mais_campeoes']')?;

