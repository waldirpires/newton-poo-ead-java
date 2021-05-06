package u6.arquivos;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExFileInOutStream {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            var path = "/home/wrpires/code/repos/newton-paiva-local/poo-ead-java/src/u6/arquivos/";
            // entrada
            in = new FileInputStream(path + "input.txt");
            // saída
            out = new FileOutputStream(path + "output.txt");

            var dateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).concat("\n");
            // processamento
            int c;
            out.write(dateTime.getBytes());
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            // fechamento
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
