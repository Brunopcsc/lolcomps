grammar comps;

IDENT: ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')+;

CAMPEAO: ('a'..'z' | 'A'..'Z' | '\'')+;

VALOR: ('0'..'9')+ ('.' ('0'..'9') )?;

programa : nome campeoes carac bans mais_comp;

mais_comp: (nome campeoes carac bans mais_comp)?;

nome: '(' IDENT ')';

campeoes: '[' posicoes ']';

posicoes: top jungle mid adc sup;

top: 'top' '=' '{' CAMPEAO mais_campeoes '}';

jungle: 'jungle' '=' '{' CAMPEAO mais_campeoes '}';

mid: 'mid' '=' '{' CAMPEAO mais_campeoes '}';

adc: 'adc' '=' '{' CAMPEAO mais_campeoes '}';

sup: 'sup' '=' '{' CAMPEAO mais_campeoes '}';

mais_campeoes: (',' CAMPEAO mais_campeoes)?;

carac: '[' lista ']';

lista: '{' 'engage' ',' VALOR '}' |
       '{' 'disengage' ',' VALOR '}' |
       '{' 'siege' ',' VALOR '}' |
       '{' 'poke' ',' VALOR '}' |
       '{' 'pickoff' ',' VALOR '}' |
       '{' 'cc' ',' VALOR '}' |
       '{' 'split' ',' VALOR '}' |
       '{' 'global' ',' VALOR '}' |
       '{' 'clearw' ',' VALOR '}' |
       '{' 'early' ',' VALOR '}' |
       '{' 'mid' ',' VALOR '}' |
       '{' 'late' ',' VALOR '}' ;

bans: ('[' CAMPEAO mais_campeoes']')?;

