# Biblioteca Pessoal

********
<p align="center">
<strong>********ATENÇÃO********<br><br>
O ARQUIVO DESTE PROJETO PRECISA SER COLOCADO DIRETAMENTE DENTRO DA PASTA RAIZ<br> "C:\" DE SEU COMPUTADOR<br>
E NADA MAIS, CASO O ARQUIVO ESTEJA COM UM NOME DIFERENTE DE "ProjetoFinal" POR FAVOR, ARRUME!<br>
CASO NÃO SIGA AS INSTRUÇÕES ACIMA, O MESMO PODE GERAR MAL FUNCIONAMENTO OU PARADA TOTAL DO SISTEMA<br>
O RESULTADO FINAL DA PASTA DEVE SER:<br><br> C:\ProjetoFinal</strong><br><br>
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

A seguir esta o Diagrama UML das classes presentes no projeto, incluindo suas relações e metodos. Um arquivo com extensão para o programa STAR UML esta disponivel na pasta com o nome de Projeto_final_-_P.Orientada_completo.mdj

![Diagrama UML Projeto Final](https://github.com/Phrdavis/ProjetoFinal/assets/105741181/fa09b02a-e6d4-437c-a060-022662db5b06)


# Informações

Linguagem: Java

Plataforma utilizada: Intellij

Todos os conceitos e estratégias utilizadas no projeto foram desenvolvidas em aula e estudos pessoais dos integrantes do projeto. Foi disponibilizado ao fim do arquivo "Main", de forma comentada, links de vídeos e sites que foram utilizados como base para o funcionamento do projeto e que contém técnicas e atributos da linguagem Java.

Este trabalho foi desenvolvido para a matéria de Programação Orientada a Objetos I do curso de Bacharelado em Engenharia de Software, e ministrado pelo professor Leanderson André na Universidade da Região de Joinville - Univille, Bom Retiro - Joinville, SC - Brasil.
