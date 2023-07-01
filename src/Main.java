
//Área de Importes
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//      ###############################################
//      ##################  ATENÇÃO  ##################
//      ###############################################

//      Para utilizar este programa, salve-o dentro da
//      pasta raiz C:\ de seu computador. Seus caminhos
//      foram setados assim para melhor funcionamento.

//      Att.
//      Arthus Borges
//      Alexandre
//      Davi Pinheiro



public class Main {
    public static void main(String[] args) throws IOException {

        //Criando Objetos
        Scanner scan = new Scanner(System.in);
        Options op = new Options();
        Options opTitulo = new Options();
        Options opIntegrantes = new Options();
        Conteudo ctd = new Conteudo();
        Itens iten = new Itens();

        List<String> aux = new ArrayList<>();


        //Variavel para armazenar o caminho da pasta
        File pasta = new File("C:\\ProjetoFinal\\Arquivos");

        //Definindo nome da pasta de 'Catergorias'
        String arqCat = "Categorias";
        //Definindo o caminho para a criação do arquivo
        Path pathCat = Path.of(pasta + "\\" + arqCat + ".txt");

        //Caso a pasta não exista, vamos criar
        if (Files.notExists(pathCat)) {
            Files.createFile(pathCat);
        }

        //Variavel para armazenar as linhas do arquivo categorias
        List<String> linhas = Files.readAllLines(pathCat);

        //Loop para armazenar o conteudo das linhas no objeto ctd
        for (String linha : linhas) {
            ctd.setCategoria(linha);
        }

        //Adicionando valores ao objeto op
        op.setOp("Adicionar Titulo");
        op.setOp("Adicionar Categoria");

        //Funções para adicionar e excluir Conteudo de um titulo
        op.setOp("Visualizar Titulos");
        opTitulo.setOp("Adicionar Conteudo");
        opTitulo.setOp("Excluir Conteudo");

        op.setOp("Visualizar Categorias");
        op.setOp("Excluir Titulo ");
        op.setOp("Excluir Categoria");
        op.setOp("Encerrar Programa");

        //Integrantes do Trabalho
        opIntegrantes.setOp("Alexandre");
        opIntegrantes.setOp("Arthur Borges");
        opIntegrantes.setOp("Davi Pinheiro de Souza");


        //Loop para app continuar funcionando
        while(true){

            //Lista com todos os arquivos dentro da pasta
            File[] lista = pasta.listFiles();

            //Montando estrutura do app no console com formatação de texto
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
            System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
            System.out.printf("%82s\n", "---------------------------------------------------------------");
            System.out.printf("%20s%34S%28s\n", "|", "OPÇÕES", "|");

            //Loop FOR para mostrar as opções do app
            for (int i = 0; i < op.getSyze() - 1; i++){
                System.out.printf("%20s%2s%-30s%30s\n", "|", "", i + " " + op.getOp(i), "|");
            }

            System.out.printf("%82s\n", "---------------------------------------------------------------");
            //Orientação de como sair do app
            System.out.printf("%20s%2s%-30s%30s\n", "|", "",  (op.getSyze()-1) + " " + op.getOp(op.getSyze() -1), "|");
            System.out.printf("%82s\n\n", "---------------------------------------------------------------");

            //Local para resposta do usuario
            System.out.print("Opção: ");
            int escolha = scan.nextInt();

            //Definindo condições para cada escolha do usuário

            //ADICIONAR TITULO
            if (escolha == 0) {

                //Estrutura do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%42s%20s\n", "|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%38S%24s\n", "|", op.getOp(escolha), "|");

                //Loop For para listar todos os arquivos
                int count = 0;
                for (File file : lista) {
                    System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + file.getName(), "|");
                    count++;
                }
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                //Local para resposta do usuário
                System.out.print("Nome do titulo: ");
                scan.nextLine(); //Bug do nextLine
                String arquivo = scan.nextLine();

                //Condição para que o programa continue o Loop While sem executar nenhuma funcionalidade
                if (arquivo.equals("-1")) {

                } else if (arquivo.equals(arqCat)) {
                    System.out.println("\n\nVocê não tem permissão para criar uma pasta com o nome 'Categorias'");
                    System.out.println("Aperte ENTER para voltar!");
                    scan.nextLine();

                }else {
                    //Criando caminho para a criação de novo arquivo .txt
                    Path path = Path.of(pasta + "\\" + arquivo + ".txt");

                    //Try catch para criação do arquivo
                    try{
                        //Cria o arquivo path caso não exista
                        if(Files.notExists(path)){
                            Files.createFile(path);
                        }else{
                            //Aviso que a pasta já existe e não pode ser criada igual
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nTitulo já existente na pasta!");
                        }

                    }
                    //Captura do ERRO sem interrupção do programa
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    //Atualizando variavel Linhas para cada alteração de categorias
                    path = Path.of(pasta + "\\" + arquivo + ".txt");
                    linhas = Files.readAllLines(pathCat);
                    if (linhas.size() != 0) {
                        //Estrutura do app
                        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                        System.out.printf("%20s%42s%20s\n", "|", "Bloco de Notas Pessoal", "|");
                        System.out.printf("%82s\n", "---------------------------------------------------------------");
                        System.out.printf("%20s%43s%19s\n", "|", "Atribua uma das Categorias", "|");
                        //Loop for para mostrar o conteudo já existente
                        count = 0;
                        for (String linha : linhas) {
                            System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + linha, "|");
                            count++;
                        }
                        System.out.printf("%82s\n", "---------------------------------------------------------------");
                        System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Cancelar", "|");
                        System.out.printf("%82s\n", "---------------------------------------------------------------");
                        System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-2 Adicionar Nova Categoria", "|");
                        System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                        System.out.print("Escolha: ");
                        int categories = scan.nextInt();

                        if (categories == -1) {

                        } else if (categories == -2) {
                            //Estrutura do app
                            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                            System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
                            System.out.printf("%82s\n", "---------------------------------------------------------------");
                            System.out.printf("%20s%38S%24s\n", "|", op.getOp(escolha+1), "|");
                            System.out.printf("%82s\n", "---------------------------------------------------------------");

                            //Resposta do usuário
                            System.out.print("Categoria: ");
                            scan.nextLine();//Bug nextLine
                            String cat = scan.nextLine();

                            //Setando nova categoria dentro do objeto ctd
                            ctd.setCategoria(cat);
                            try{
                                //Caso o arquivo categorias não existe, criamos um
                                if(Files.notExists(pathCat)){
                                    Files.createFile(pathCat);
                                }
                                //Conjunto de funções para escrever novas linhas no final do arquivo
                                FileWriter fw = new FileWriter(pathCat.toString(), true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(cat);
                                bw.newLine();//
                                bw.close();


                                fw = new FileWriter(path.toString(), true);
                                bw = new BufferedWriter(fw);
                                bw.write("Categoria: "+cat);
                                bw.newLine();//
                                bw.close();


                            }
                            //Captura do ERRO sem interrupção do programa
                            catch (Exception e){
                                e.printStackTrace();
                            }

                        }else {
                            FileWriter fw = new FileWriter(path.toString(), true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write("Categoria: "+ctd.getCategoria(categories));
                            bw.newLine();//
                            bw.close();
                        }
                    }else{

                        //Estrutura do app
                        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                        System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
                        System.out.printf("%82s\n", "---------------------------------------------------------------");
                        System.out.printf("%20s%38S%24s\n", "|", op.getOp(escolha+1), "|");
                        System.out.printf("%82s\n", "---------------------------------------------------------------");

                        //Resposta do usuário
                        System.out.print("Categoria: ");
                        String cat = scan.nextLine();

                        //Setando nova categoria dentro do objeto ctd
                        ctd.setCategoria(cat);
                        try{
                            //Caso o arquivo categorias não existe, criamos um
                            if(Files.notExists(pathCat)){
                                Files.createFile(pathCat);
                            }
                            //Conjunto de funções para escrever novas linhas no final do arquivo
                            FileWriter fw = new FileWriter(pathCat.toString(), true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(cat);
                            bw.newLine();//
                            bw.close();


                            fw = new FileWriter(path.toString(), true);
                            bw = new BufferedWriter(fw);
                            bw.write("Categoria: "+cat);
                            bw.newLine();//
                            bw.close();


                        }
                        //Captura do ERRO sem interrupção do programa
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }



            }
            //ADICIONAR CATEGORIA
            else if(escolha == 1){

                //Atualizando variavel Linhas para cada alteração de categorias
                linhas = Files.readAllLines(pathCat);
                //Estrutura do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%38S%24s\n", "|", op.getOp(escolha), "|");
                //Loop for para mostrar o conteudo já existente
                int count = 0;
                for (String linha: linhas){
                    System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + linha, "|");
                    count++;
                }
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                System.out.printf("%82s\n\n", "---------------------------------------------------------------");


                //Resposta do usuário
                System.out.print("Categoria: ");
                scan.nextLine(); //Bug do nextLine
                String cat = scan.nextLine();

                //Condição para que o programa continue o Loop While sem executar nenhuma funcionalidade
                if (cat.equals("-1")){

                }else {
                    //Setando nova categoria dentro do objeto ctd
                    ctd.setCategoria(cat);
                    try{
                        //Caso o arquivo categorias não existe, criamos um
                        if(Files.notExists(pathCat)){
                            Files.createFile(pathCat);
                        }
                        //Conjunto de funções para escrever novas linhas no final do arquivo
                        FileWriter fw = new FileWriter(pathCat.toString(), true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(cat);
                        bw.newLine();//
                        bw.close();

                    }
                    //Captura do ERRO sem interrupção do programa
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            //VISUALIZAR TITULOS
            else if (escolha == 2) {

                //Estrutura do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%40S%22s\n", "|", op.getOp(escolha), "|");

                //Loop For para listar todos os arquivos
                int count = 0;
                for (File file: lista){
                    System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + file.getName(), "|");
                    count++;
                }
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%40s%22s\n", "|", "Selecione um titulo" , "|");
                System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                //Resposta do usuário
                System.out.print("Titulo: ");
                int resposta = (scan.nextInt());



                if (resposta == -1) {


                }else{
                    Path path = Path.of(lista[resposta].toURI());
                    linhas = Files.readAllLines(path);
                    if (linhas.size() != 0 && iten.getSize() == 0) {
                        for (int num = 1; num < linhas.size(); num++) {
                            for (int i = 0; i < linhas.get(num).split(" ").length; i++) {
                                if (i % 2 != 0) {
                                    aux.add(linhas.get(num).split(" ")[i]);
                                }
                            }
                        }
                        for (int num = 0; num <= aux.size() - 3; num += 3) {
                            String cont = aux.get(num);
                            double not = Double.parseDouble(aux.get(num + 1));
                            boolean comp = Boolean.parseBoolean(aux.get(num + 2));
                            iten.setConteudo(cont, not, comp, resposta);
                        }
                    }
                    int num = 0;
                    for (File file: lista){
                        //Escolhendo arquivo caso tenha o mesmo index que a escolha do usuário e não seja o arquivo Categorias
                        if (num == resposta && !file.getName().equals(arqCat+".txt")) {

                            path = Path.of(pasta + "\\" + file.getName());

                            //Atualizando variavel Linhas para cada alteração de categorias
                            linhas = Files.readAllLines(path);

                            //Estrutura do app
                            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                            System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                            System.out.printf("%82s\n", "---------------------------------------------------------------");

                            //Loop para mostrar categorias
                            if (linhas.size() != 0) {
                                int i = 0;
                                for (String linha : linhas) {
                                    System.out.printf("%20s%2s%-58S%2s\n", "|", " ", i + " " + linha, "|");
                                    i++;
                                }
                            }else{
                                System.out.printf("%20s%44s%18s\n", "|", "Você não possui titulos ainda!", "|");
                            }

                            //Loop para mostrar opções de Adicionar e Exluir

                            System.out.printf("%82s\n", "---------------------------------------------------------------");
                            for (int i = 0; i < opTitulo.getSyze(); i++) {
                                System.out.printf("%20s%2s%-58s%2s\n", "|", "", i + " " + opTitulo.getOp(i), "|");
                            }
                            System.out.printf("%82s\n", "---------------------------------------------------------------");
                            System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                            System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                            //Resposta do usuário
                            System.out.print("Ação: ");
                            int action = (scan.nextInt());

                            if (action == -1){

                            }
                            //Adicionar conteudo
                            else if (action == 0){

                                path = Path.of(pasta + "\\" + file.getName());

                                //Atualizando variavel Linhas para cada alteração de categorias
                                linhas = Files.readAllLines(path);
                                //Estrutura do app
                                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                                System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                                System.out.printf("%82s\n", "---------------------------------------------------------------");

                                if (linhas.size() != 0) {
                                    int i = 0;
                                    for (String linha : linhas) {
                                        System.out.printf("%20s%2s%-40S%22s\n", "|", " ", i + " " + linha, "|");
                                        i++;
                                    }
                                }else{
                                    System.out.printf("%20s%44s%18s\n", "|", "Você não possui conteudo ainda!", "|");
                                }

                                System.out.printf("%82s\n", "---------------------------------------------------------------");
                                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                                System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                                //Resposta do usuário
                                System.out.print("Insira o conteudo: ");
                                scan.nextLine();//Bug do nextLine
                                String conteudo = (scan.nextLine());


                                if (conteudo.equals("-1")){
                                    break;
                                }

                                //Resposta do usuário
                                System.out.print("Insira a sua nota: ");
                                double nota = (scan.nextInt());

                                if(nota == (-1)){
                                    break;
                                }

                                //Resposta do usuário
                                System.out.print("Completo: (Y/N)");
                                scan.nextLine();//Bug do nextLine
                                String completo = (scan.nextLine()).toUpperCase();

                                boolean comp = false;
                                if (completo.equals("Y")){
                                    comp = true;
                                } else if (completo.equals("-1")){
                                    break;
                                }

                                iten.setConteudo(conteudo, nota, comp, resposta);

                                //Conjunto de funções para escrever novas linhas no final do arquivo
                                FileWriter fw = new FileWriter(path.toString(), true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write("- " +conteudo+" :Nota- "+nota+" :Completo- "+comp);
                                bw.newLine();
                                bw.close();
                            }
                            //Excluindo Conteudo
                            else if (action == 1) {

                                String catTitle = "";
                                path = Path.of(pasta + "\\" + file.getName());

                                //Atualizando variavel Linhas para cada alteração de categorias
                                linhas = Files.readAllLines(path);
                                if (linhas.size() != 0) {
                                    //Estrutura do app
                                    System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                                    System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                                    System.out.printf("%82s\n", "---------------------------------------------------------------");

                                    int i = 0;
                                    for (String linha : linhas) {
                                        System.out.printf("%20s%2s%-40S%22s\n", "|", " ", i + " " + linha, "|");
                                        i++;
                                    }

                                    System.out.printf("%82s\n", "---------------------------------------------------------------");
                                    System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                                    System.out.printf("%82s\n\n", "---------------------------------------------------------------");


                                    //Resposta do usuário
                                    System.out.print("Resposta: ");
                                    int contTitulo = (scan.nextInt());

                                    for (num = 0; num < linhas.size(); num++) {
                                        if (num == contTitulo) {
                                            System.out.println(iten.getSize());
                                            if (num-1 >= 0){
                                                iten.removeConteudo(num-1);
                                                catTitle = linhas.get(0);

                                                //Excluindo arquivo Categorias
                                                Files.delete(path);
                                                //Recriando arquivo Categorias do zero
                                                Files.createFile(path);

                                                //Conjunto de funções para escrever dentro do arquivo
                                                FileWriter fw = new FileWriter(path.toString(), true);
                                                BufferedWriter bw = new BufferedWriter(fw);
                                                bw.write(catTitle);
                                                bw.newLine();

                                                //Loop for para escrever as categorias dentro do novo arquivo
                                                for (int j = 0; j < iten.getSize(); j++) {
                                                    if (iten.getTitulo(j) == resposta) {
                                                        bw.write("- " + iten.getConteudo(j) + " :Nota- " + iten.getNota(j) + " :Completo- " + iten.getCompleto(j));
                                                        bw.newLine();
                                                    }
                                                }

                                                bw.close();
                                            }else{
                                                //Estrutura do app
                                                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                                                System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                                                System.out.printf("%82s\n", "---------------------------------------------------------------");
                                                System.out.printf("%20s%49s%13s\n", "|", "Você não possui permissão para isso!" , "|");
                                                System.out.printf("%20s%43s%19s\n", "|", "Aperte ENTER para voltar!" , "|");
                                                System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                                                scan.nextLine();//Bug do nextLine
                                                scan.nextLine();
                                            }


                                        }
                                    }
                                }else {
                                    //Nenhuma categoria foi cadastrada anteriormente
                                    //Estrutura do app
                                    System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                                    System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                                    System.out.printf("%82s\n", "---------------------------------------------------------------");
                                    System.out.printf("%20s%49s%13s\n", "|", "Você não possui conteudo neste titulo!" , "|");
                                    System.out.printf("%20s%43s%19s\n", "|", "Aperte ENTER para voltar!" , "|");
                                    System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                                    scan.nextLine();//Bug do nextLine
                                    scan.nextLine();
                                }

                            }
                            break;

                        } else if (num == resposta && file.getName().equals(arqCat+".txt")) {
                            //Não é permitido alterar o arquivo Categorias
                            System.out.println("\n\nVocê não pode adicionar conteudo a pasta 'Categorias'");
                            System.out.println("Aperte ENTER para continuar!");
                            scan.nextLine();
                            scan.nextLine();
                            break;
                        }
                        num++;
                    }
                }
            }
            //VISUALIZAR CATEGORIAS
            else if (escolha == 3) {
                //Atualizando variavel Linhas para cada alteração de categorias
                linhas = Files.readAllLines(pathCat);
                //Estrutura do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%40S%22s\n", "|", op.getOp(escolha), "|");

                //try catch para criação do arquivo caso ele não exista
                try {
                    int count = 0;
                    if (Files.notExists(pathCat)) {
                        Files.createFile(pathCat);

                        //Nenhuma categoria foi cadastrada anteriormente
                        System.out.printf("%20s%44s%18s\n", "|", "Você não possui categorias!", "|");
                        System.out.printf("%20s%45s%17s\n", "|", "Aperte ENTER para voltar!", "|");
                        System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                        scan.nextLine();//Bug do nextLine
                        scan.nextLine();
                    } else {

                        //Verificando se o arquivo esta vazio
                        if (linhas.size() != 0) {
                            //Loop for para apresentar o conteudo do arquivo
                            for (String linha : linhas) {
                                System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + linha, "|");
                                count++;
                            }
                            System.out.printf("%82s\n", "---------------------------------------------------------------");
                            System.out.printf("%20s%45s%17s\n", "|", "Aperte ENTER para voltar!", "|");
                            System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                            scan.nextLine();//Bug do nextLine
                            scan.nextLine();
                        }else{
                            //Nenhuma categoria foi cadastrada anteriormente
                            System.out.printf("%20s%44s%18s\n", "|", "Você não possui categorias!", "|");
                            System.out.printf("%20s%45s%17s\n", "|", "Aperte ENTER para voltar!", "|");
                            System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                            scan.nextLine();//Bug do nextLine
                            scan.nextLine();
                        }
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }

            }
            //EXCLUIR TITULOS
            else if (escolha == 4) {

                //Condição para ver se existe algum titulo adicionado
                if(lista.length == 0){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n Você não possui nenhum titulo adicionado ainda!\n");
                }else {

                    //Estrutura do app
                    System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                    System.out.printf("%20s%42s%20s\n", "|", "Bloco de Notas Pessoal", "|");
                    System.out.printf("%82s\n", "---------------------------------------------------------------");
                    System.out.printf("%20s%38S%24s\n", "|", op.getOp(escolha), "|");


                    //Loop for para mostrar titulos existentes
                    int count = 0;
                    for (File file: lista){
                        System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + file.getName(), "|");
                        count++;
                    }

                    System.out.printf("%82s\n", "---------------------------------------------------------------");
                    System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                    System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                    //Resposta do usuário
                    System.out.print("Resposta: ");
                    escolha = scan.nextInt();

                }

                //Condição para que o programa continue o Loop While sem executar nenhuma funcionalidade
                if (escolha == -1){

                }else{
                    //Loop for para verficiar o nome dos arquivos e seu index para exclusão
                    int num = 0;
                    for (File file: lista){
                        //Excluindo arquivo caso tenha o mesmo index que a escolha do usuário e não seja o arquivo Categorias
                        if (num == escolha && !file.getName().equals(arqCat+".txt")) {
                            file.delete();
                        } else if (num == escolha && file.getName().equals(arqCat+".txt")) {
                            //Não é permitido excluir o arquivo Categorias
                            System.out.println("\n\nVocê não tem permissão para apagar a pasta 'Categorias'");
                            System.out.println("Aperte ENTER para continuar!");
                            scan.nextLine();
                            scan.nextLine();
                            break;
                        }
                        num++;
                    }
                }
            }
            //EXCLUIR CATEGORIA
            else if (escolha == 5) {

                //Atualizando variavel Linhas para cada alteração de categorias
                linhas = Files.readAllLines(pathCat);
                //Estrutura do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%41s%21s\n", "|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%39S%23s\n", "|", op.getOp(escolha), "|");

                //try catch para criação do arquivo caso ele não exista
                try {
                    int count = 0;
                    if(Files.notExists(pathCat)){
                        Files.createFile(pathCat);

                        //Nenhuma categoria foi cadastrada anteriormente
                        System.out.printf("%20s%44s%18s\n", "|", "Você não possui categorias!" , "|");
                        System.out.printf("%20s%43s%19s\n", "|", "Aperte ENTER para voltar!" , "|");
                        System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                        scan.nextLine();//Bug do nextLine
                        scan.nextLine();
                    }else{

                        //Verificando se o arquivo esta vazio
                        if (linhas.size() != 0) {
                            //Loop for para apresentar o conteudo do arquivo
                            for (String linha : linhas) {
                                System.out.printf("%20s%2s%-58s%2s\n", "|", "", count + " " + linha, "|");
                                count++;
                            }
                            System.out.printf("%82s\n", "---------------------------------------------------------------");
                            System.out.printf("%20s%2s%-58s%2s\n", "|", "", "-1 Voltar", "|");
                            System.out.printf("%82s\n\n", "---------------------------------------------------------------");

                            //Resposta do usuário
                            System.out.print("Resposta: ");
                            int remove = scan.nextInt();

                            //Condição para que o programa continue o Loop While sem executar nenhuma funcionalidade
                            if (remove == -1){

                            }else{
                                //Removendo a categoria selecionada do objeto ctd
                                ctd.removeCategoria(remove);

                                //Excluindo arquivo Categorias
                                Files.delete(pathCat);
                                //Recriando arquivo Categorias do zero
                                Files.createFile(pathCat);

                                //Conjunto de funções para escrever dentro do arquivo
                                FileWriter fw = new FileWriter(pathCat.toString(), true);
                                BufferedWriter bw = new BufferedWriter(fw);

                                //Loop for para escrever as categorias dentro do novo arquivo
                                for (int i = 0; i < ctd.getSize(); i++){
                                    bw.write(ctd.getCategoria(i));
                                    bw.newLine();
                                }

                                bw.close();
                            }
                        }else {
                            //Aviso para caso não tenha nenhuma categoria cadastrada
                            System.out.printf("%20s%44s%18s\n", "|", "Você não possui categorias!" , "|");
                            System.out.printf("%20s%43s%19s\n", "|", "Aperte ENTER para voltar!" , "|");

                            System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                            scan.nextLine();
                            scan.nextLine();
                        }
                    }

                }catch (Exception e){
                    System.out.println(e);
                }
            }
            //SAIR DO PROGRAMA
            else if(escolha == 6){

                //Encerramento do app
                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n%82s\n", "_______________________________________________________________");
                System.out.printf("%20s%42s%20s\n","|", "Bloco de Notas Pessoal", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "Trabalho realizado por:", "|");
                for (int i = 0; i < opIntegrantes.getSyze(); i++){
                    System.out.printf("%20s%2s%-58s%2s\n", "|", "","- " + opIntegrantes.getOp(i), "|");
                }
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "Matéria:", "|");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "- Programação Orientada a Objetos", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "Professor:", "|");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "- Leanderson André", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "Instituição:", "|");
                System.out.printf("%20s%2s%-58s%2s\n", "|", "", "- Universidade Univille, Joinville - SC", "|");
                System.out.printf("%82s\n", "---------------------------------------------------------------");
                System.out.printf("%20s%37S%25s\n", "|", "Até mais!!", "|");
                System.out.printf("%82s\n\n", "---------------------------------------------------------------");
                //Encerrando o Loop While
                break;
            }
        }
    }
}


    //REFERENCIAS DE VÍDEOS E SITES QUE UTILIZAMOS PARA MELHORAR O PROJETO

        //https://www.youtube.com/watch?v=wE7lHUxHU9w
        //https://www.baeldung.com/java-printstream-printf
        //https://pt.stackoverflow.com/questions/159121/como-saber-o-n%C3%BAmero-de-arquivos-numa-pasta-usando-java#:~:text=Voc%C3%AA%20pode%20usar%20a%20interface,File%20pathname)%20%7B%20return%20pathname.
        //https://pt.stackoverflow.com/questions/377588/fazer-delay-em-java
        //https://codegym.cc/groups/posts/unreachable-statement-in-java
        //https://www.techiedelight.com/pt/check-if-file-is-empty-java/#:~:text=readFileToString()%20m%C3%A9todo%20que%20l%C3%AA,vazio%2C%20caso%20contr%C3%A1rio%2C%20n%C3%A3o.
        //https://www.delftstack.com/pt/howto/java/how-to-check-type-of-a-variable-in-java/
        //https://www.javatpoint.com/java-string-format

