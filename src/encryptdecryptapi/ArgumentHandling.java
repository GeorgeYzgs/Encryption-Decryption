/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptdecryptapi;

/**
 *
 * @author George.Giazitzis
 */
public class ArgumentHandling {

    private String mode = "esc";
    private int key = 0;
    private String data = "";
    private String input = "";
    private String output = "";
    private String alg = "shift";

    public ArgumentHandling(String[] args) {
        Initialize(args);
    }

    private void Initialize(String[] args) {

        for (int i = 0; i < args.length; i += 2) {

            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    input = args[i + 1];
                    break;
                case "-out":
                    output = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
            }
        }
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public String getAlg() {
        return alg;
    }

    private int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument passed as a key");
            return 0;
        }
    }
}
