package u6.arquivos;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExReaderWriter {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        var dateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).concat("\n");

        try {
            var path = "/home/wrpires/code/repos/newton-paiva-local/poo-ead-java/src/u6/arquivos/";

            in = new FileReader(path + "input.txt");
            out = new FileWriter(path + "output.txt");

            // processamento
            int c;
            out.write(dateTime);
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("\nArquivo escrito com sucesso.\n");
        System.out.println(dateTime);
    }
}
