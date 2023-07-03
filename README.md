# Biblioteca Pessoal

********
<p align="center">
<strong>********ATENÇÃO********<br><br>
O ARQUIVO DESTE PROJETO PRECISA SER COLOCADO DIRETAMENTE DENTRO DA PASTA RAIZ<br> "C:\" DE SEU COMPUTADOR<br>
CASO NÃO SEJA COLOCADO NO LUGAR ORIENTADO, O MESMO PODE GERAR MAL FUNCIONAMENTO OU PARADA TOTAL DO SISTEMA</strong><br><br>
  ********ATENÇÃO********<br>
</p>

********




Este projeto foi realizado pelos alunos:

- Alexandre Butzke;
- Arthur Borges;
- Davi Pinheiro de Souza.

O projeto tem como intuito simular uma biblioteca pessoal, na qual é possível adicionar pastas, criar categorias para cada pasta, além de adicionar e remover conteudos de dentro dos arquivos.
Foi utilizado como referência o aplicativo "Notas" do sistema Android, que possui um sistema para adicionar novas pastas, criar categorias de pastas, adicionar e remover conteudo de dentro das pastas e também atribuir uma categoria para cada pasta. 

Nosso sistema disponibiliza 7 opções principais + 2 opções secundarias ao usuário:

- Adicionar um Titulo;
- Adicionar Categoria;
- Visualizar titulos;
  
    + Adicionar Conteudo;
    + Excluir Conteudo;
      
- Visualizar Categorias;
- Excluir Titulos;
- Excluir Categorias;
- Encerrar Programa;
  

Todas as opções funcionam em conformidade umas com as outras, caso o aplicativo seja iniciado sem determinadas pastas, o código esta encarregado de cria-las logo após a primeira instrução.
Durante a execução do código é possível observar que a pasta "Categorias.txt" sempre estará disponivel na visualização dos titulos por ser um arquivo de texto comum, porém não é possível exclui-la dentro do programa, e caso o usuário tente, um alerta aparece no console dizendo que o mesmo não possui permissão para excluir a pasta. Mas caso o arquivo seja apagado manualmente de dentro das pastas do projeto, o código cria denovo a pasta em sua próxima inicialização.

O código, como dito anteriormente, funciona através de orientação a objetos e também por manipulação de arquivos de texto, ou seja, nosso projeto de biblioteca pessoal utiliza os arquivos salvos como "Banco de dados" para gravar seus conteudos mesmo após a reiniciação do programa, enquanto que os objetos (basicamente quase todos formados por ArrayLists) são encarregados de lidar com o tráfego das informações.

# Diagramas UML

Em breve!

# Informações

Linguagem: Java

Plataforma utilizada: Intellij

Todos os conceitos e estratégias utilizadas no projeto foram desenvolvidas em aula e estudos pessoais dos integrantes do projeto. Foi disponibilizado ao fim do arquivo "Main", de forma comentada, links de vídeos e sites que foram utilizados como base para o funcionamento do projeto e que contém técnicas e atributos da linguagem Java.

Este trabalho foi desenvolvido para a matéria de Programação Orientada a Objetos I do curso de Bacharelado em Engenharia de Software, e ministrado pelo professor Leanderson André na Universidade da Região de Joinville - Univille, Bom Retiro - Joinville, SC - Brasil.
