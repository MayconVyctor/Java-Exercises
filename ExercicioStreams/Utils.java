package ExercicioStreams;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Utils {

    public static List<Distancia> lerCSV(String nomeArquivo) {
        List<Distancia> distancias = new ArrayList<>();

        try {
            // Tenta carregar como recurso do classpath
            InputStream inputStream = Utils.class.getResourceAsStream("/" + nomeArquivo);

            // Se não achar, tenta como arquivo normal
            if (inputStream == null) {
                inputStream = new FileInputStream(nomeArquivo);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            distancias = br.lines()
                    .map(linha -> linha.split(","))
                    .map(campos -> new Distancia(
                            campos[0].trim(),
                            campos[1].trim(),
                            Double.parseDouble(campos[2].trim())
                    ))
                    .collect(Collectors.toList());

            br.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        return distancias;
    }
}