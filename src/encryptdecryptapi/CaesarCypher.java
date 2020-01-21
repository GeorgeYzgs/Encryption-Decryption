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
public class CaesarCypher implements CryptographyStrat {

    @Override
    public String encryptData(String data, int offset) {
        StringBuilder output = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    output.append((char)(((c - 'A' + offset) % 26) + 'A'));
                } else {
                    output.append((char)(((c - 'a' + offset) % 26) + 'a'));
                }
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    @Override
    public String decryptData(String data, int offset) {
        return encryptData(data, (26 - (offset % 26)));
    }
}
