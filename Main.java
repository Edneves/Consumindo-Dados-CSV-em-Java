package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathLeitura = <Caminho do arquivo que será lido>;
        String pathEscrita = <Caminho seguido do nome do arquivo que será criado e escrito o conteúdo>;
        String line;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(pathLeitura), "ISO-8859-1"))){
            FileWriter file = new FileWriter(pathEscrita);
            line = br.readLine();
            while((line = br.readLine()) != null){

                String[] values = line.split(";");
                String colunaNome = values[0].trim();
                String colunaSobrenome = values[1].trim();
                double colunaPeso = Double.parseDouble(values[2].replaceAll(",", "."));
                double colunaAltura = Double.parseDouble(values[3].replaceAll(",", "."));

               String nomeCompleto =  colunaNome.replaceAll("\s+", "").toUpperCase() +" "+
                    colunaSobrenome.replaceAll("\s+", " ").toUpperCase();

                Dados informacoes = new Dados(nomeCompleto, colunaPeso, colunaAltura);
                file.write(informacoes.toString());
                System.out.println(informacoes);
            }
            file.close();
        }catch (IOException e){
            System.out.println("Ocorreu um erro!" + e.getMessage());
        }
    }
}
