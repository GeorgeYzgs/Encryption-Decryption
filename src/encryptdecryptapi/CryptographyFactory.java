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
public class CryptographyFactory {

    public static CryptographyContext createContext(String algorithm) {
        switch (algorithm) {
            case "shift":
                return new CryptographyContext(new CaesarCypher());
            case "unicode":
                return new CryptographyContext(new UnicodeCypher());
            default:
                return null;
        }
    }
}
