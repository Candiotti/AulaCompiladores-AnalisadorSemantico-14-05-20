Matheus dos Santos Candiotti - 314139

O analisador semantico é responsável por verificar durante o código se, comparações, atribuições e operações estão todas sendo trabalhadas no mesmo tipo de dado, por exemplo:
	É definido no analisador sintatico que uma expressão aritmetica é formada por:
	- expressaoAritmetica: termoAritmetico (OP_ARIT1 termoAritmetico)*;
Nesse caso, a expressão pode ser formada por operações de soma, subtração, divisão e multiplicação de fatoresAritméticos que são formados por variáveis do tipo INTEIRO OU REAL(FLOAT), e no caso, a linguagem permite apenas expressãoAritmetica de mesmo tipo, portanto, se aparecer INTEIRO + REAL, será gerado um erro semantico, pois dois tipos diferentes são usados em uma mesma operação.
E essa situação se replica para qualquer situação em que possa aparecer dois tipos diferentes, uma atribuição de CADEIA(STRING) para uma variavel do tipo INTEIRO, ou até mesmo utilizar uma varíavel que não foi declarada em nenhum lugar.	
	
