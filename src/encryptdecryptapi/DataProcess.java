/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptdecryptapi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author George.Giazitzis
 */
public class DataProcess {

    public static String inputData(String data, String in) {
        if (!data.isEmpty()) {
            return data;
        }
        return readFile(in);
    }

    public static void outputData(String data, String path) {
        if (path.isEmpty()) {
            System.out.println(data);
        } else {
            writeFile(data, path);
        }
    }

    private static String readFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            return "Cannot read file" + e.getMessage();
        }
    }

    private static void writeFile(String data, String path) {
        try (PrintWriter printWriter = new PrintWriter(new File(path))) {
            printWriter.write(data);
        } catch (FileNotFoundException e) {
            System.out.printf("Invalid path directory %s", e.getMessage());
        }
    }

    public static String getResultData(String mode, CryptographyContext cryptographyStrat, String data, int key) {
        switch (mode) {
            case "enc":
                return cryptographyStrat.encryptData(data, key);
            case "dec":
                return cryptographyStrat.decryptData(data, key);
            default:
                return null;
        }
    }
}
