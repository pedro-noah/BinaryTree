READ ME Árvore Binária de Busca
Esse código trata-se por ser uma implementação de uma Árvore Binária de Busca (Não- balanceada) em Java. Uma ABB é uma estrutura de dados que permite acontecer o armazenamento e gerenciamento de dados atribuídos a ela de uma forma eficiente, podendo assim, manter a propriedade de que dados menores estão à esquerda e os dados maiores estão à direita em relação a um nó pai. Assim, ela é declarada como Não-Balanceada porque nela, a altura da árvore pode variar e, em casos específicos, degenerar em uma lista encadeada, assim, não possui garantias quanto ao equilíbrio da árvore, se os dados são inseridos em uma ordem específica, como ordenados, resultando num pior desempenho para operações de busca, inserção e remoção. O projeto de árvore binária foi divido em 3 classes principais distintas: “Nó”, “Árvore” e “Main”, e em seu funcionamento completo, ela demonstra como criar uma ABB, inserir elementos, imprimir a árvore em ordem, encontrar os elementos pedidos e remover elementos.
Conteúdo
• Estrutura do Projeto
• Funcionamento
• Requisitos
• Execução
• Exemplo de Uso
• Créditos
Estrutura do Projeto
A estrutura do projeto (esqueleto do código) é composta por 3 classes principais, cada uma com seus métodos e atributos:
1. “Nó” (Node):
Esta classe representa um nó individual em uma arvore binária, implementado de forma dinâmica para armazenar as informações modificadas na árvore:
• Atributos:
o “valor”: armazena o valor associado ao nó.
o “direita”: referência para o nó filho à direita.
o “esquerda”: referência para o nó filho à esquerda.
• Construtor:
o “No (T novoValor)”: cria um novo nó com o valor especificado e vai
inicializar as referências (esquerda e direita) como nulas. • Métodos:
o “getValor()”: retorna o valor do nó.
o “getDireita()”: retorna a referência para o nó filho à direita.
      
o “getEsquerda()”: retorna a referência para o nó filho à esquerda.
o “setDireita(No<T> direita)”: define a referência para o nó filho à direita. o “setEsquerda(No<T> esquerda)”: define a referência para o nó filho à
esquerda.
2. “Arvore” (Tree):
Esta classe representa a árvore binária de busca (não balanceada): • Atributos:
o “raiz”: referência para o nó raiz da árvore. • Construtor:
o “Arvore()”: inicializa uma árvore vazia definindo a raiz como nula. • Métodos:
o “inserir(T valor)”: insere um novo valor na árvore não-balanceada, se a árvore estiver vazia, o valor inserido é a raiz, caso contrário, a árvore é percorrida da raiz até o nó adequado para inserção.
o “imprimir(No<T> atual)”: realiza uma travessia em ordem na árvore (esquerda-raiz-direita) e imprime os valores dos nós em ordem crescente.
o “encontrar(T valor)”: procura um valor específico na árvore, se for encontrado, o usuário pode optar por removê-lo da árvore.
o “getRaiz()”: retorna a raiz da árvore.
3. “Main” (Main):
Esta classe contém o método main que demonstra como usar a árvore binária de busca:
• No método “main” uma instância da árvore é criada, valores inteiros são inseridos,
árvore é impressa, método encontrar é chamado e remover os valores da árvore (opcionalmente).
Funcionamento
• Regras: implementação seguindo as regras e princípios básicos de uma árvore binária de busca.
• Inserção: inserir valores por código de acordo com as regras ABB.
• Busca: buscar o valor informado por código e retornar verdadeiro caso valor seja
encontrado.
• Remoção: Após a busca, remover o valor informado e imprimir feedback de
remoção.
• Impressão: imprimir os valores no formato de árvore no console.
• Nó: forma dinâmica, utilizado para armazenar as informações inseridas na árvore.
• Boas práticas: seguir as boas práticas de programação orientada a objetos.
    
Requisitos
Requisitos Funcionais:
1. O algoritmo é implementado de forma dinâmica.
2. O código está limpo e organizado. Os nomes de atributos e métodos são
claros. Os métodos definidos de forma correta para melhor organização de
código e reutilização de funcionalidades.
3. A inserção é feita de forma correta, seguindo os princípios e regras
estabelecidos na ABB.
4. A busca é feita de forma correta, seguindo os princípios e regras
estabelecidos na ABB.
5. A remoção é feita de forma correta, seguindo os princípios e regras
estabelecidos na ABB.
6. O código realiza a impressão da árvore de forma correta conforme
especificações definidas.
7. O código está armazenado em um repositório com descrição sobre a
funcionalidade do programa.
Execução
1. Certifique-se de que você tenha o Java instalado em sua máquina.
2. Abrir terminal/prompt de comando ou abra em uma IDE que permite a execução do
Java.
3. [Prompt] Navegue até o diretório onde os arquivos “.java” e execute o “main”. / [IDE]
faça a execução direta do “main”.
4. Verificar a funcionalidade da árvore não binária de busca com alguns valores inteiros
predefinidos.
Exemplo de Uso
Aqui estão os trechos de código que demonstram as operações possíveis: // Criando uma instância da árvore
Arvore<Integer> arvore = new Arvore<Integer>(); // Inserindo valores na árvore
arvore.inserir(10); arvore.inserir(5); arvore.inserir(6);
// Imprimindo a árvore em ordem arvore.imprimir(arvore.getRaiz());
// Procurando e, opcionalmente, removendo um valor da árvore

arvore.encontrar(10);
// Imprimindo a árvore novamente após a remoção
arvore.imprimir(arvore.getRaiz());
Créditos
Espero que este README seja útil para entender o projeto da Árvore Binária de Busca, esse projeto foi desenvolvido por: Pedro Noah Milarski, Vitor Bertoldi e João Dadas.

