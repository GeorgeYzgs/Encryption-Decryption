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
public class UnicodeCypher implements CryptographyStrat {

    @Override
    public String encryptData(String data, int offset) {
        StringBuilder output = new StringBuilder();
        for (char c : data.toCharArray()) {
           output.append((char) (c + offset));
        }
        return output.toString();
    }

    @Override
    public String decryptData(String data, int offset) {
        return encryptData(data, -offset);
    }
}
