# LoL Comps
Linguagem geradora de composições para o jogo League of Legends. Essa linguagem gera um script em python que, se executado, gera imagens com as características da composição, os campeões organizados por posição e, também, gera automaticamente sugestões de bans, baseados nas características definidas pelo usuário.

# Dependências
Python 3.6
Java
Biblioteca OPENCV para Python

# Instruções para execução

1. Arraste a pasta dist do projeto para algum lugar de preferência, crie um arquivo <nome_arquivo>.txt com o formato a:

(nome da composição)

[top='nome_bonecos', ...

jungle='nome_bonecos', ...

mid='nome_bonecos', ...

adc='nome_bonecos', ...

sup='nome_bonecos', ...]

[siege, 10

poke, 5

engage, 2

...]

Observações: as reticências perto de top, jungle, mid, adc e sup, significam que você pode adicionar mais bonecos, o limite são 3.
As reticências perto das características, significa que você pode adicionar mais características e seus valores.

Os bonecos adicionais (até 3) são opcionais.

As características são opcionais, e a ordem não importa.

Os bans são gerados automaticamente, para uma melhor consistência, o número mínimo de características é 1, ou seja, o usuário precisará definir pelo menos uma característica.

-----------------------------------------------------------------------------------------------------------------------

2. execute o comando: java -jar LolComps.jar <nome_arquivo>.txt

Após isso as seguintes opções podem ocorrer: 

- Arquivo “script.py” caso seu programa não contenha erros.

- Arquivo “erro_sintatico.txt” caso seu programa contenha erros sintáticos. Tal arquivo irá
conter os erros sintáticos especificando a linha do erro e a descrição do erro.

- Arquivo “erro_semantico.txt” caso seu programa contenha erros semânticos. Tal arquivo irá
conter os erros semânticos especificando a linha do erro e a descrição do erro.

-----------------------------------------------------------------------------------------------------------------------

3. Se tudo ocorrer bem, o script.py será criado: execute o comando python script.py

# Campeões (Bonecos)
Os bonecos disponíveis são todos os que estão disponíveis no League of Legends, até o presente momento: 14/12/2017 às 16h25.

# Características
engage, disengage, siege, poke, pickoff, cc, splitpush, globalpresence, clearwave, earlygame, midgame e lategame.
