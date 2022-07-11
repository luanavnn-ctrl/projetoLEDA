package data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

import util.Array;

public class CSV {
    public static String getCabecalho() {
        return ",password,length,data";
    }
    public static Array<Password> ler(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Array<Password> data = new Array<>((int) Files.lines(path).count()-1);
        AtomicInteger i = new AtomicInteger();
        Files.lines(path).skip(1L).forEach(linha -> data.set(i.getAndIncrement(), new Password(linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"))));
        return data;
    }

    public static void gravar(Array<Password> data, String fileName) {
        try {
            FileOutputStream  file = new FileOutputStream(fileName);
            PrintWriter writer = new PrintWriter(file);
            writer.println(CSV.getCabecalho() + "\n" + data.toString());
            writer.close();
            file.close();
        } catch(Exception e) {
            System.out.println("Erro ao gravar o arquivo.");
        }
    }
}