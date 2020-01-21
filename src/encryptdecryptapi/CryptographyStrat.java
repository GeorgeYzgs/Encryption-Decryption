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
public interface CryptographyStrat {

    String encryptData(String data, int offset);

    String decryptData(String data, int offset);
}
