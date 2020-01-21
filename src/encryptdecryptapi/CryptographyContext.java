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
public class CryptographyContext {

    private CryptographyStrat cryptographyStrat;

    public CryptographyContext(CryptographyStrat cryptographyStrat) {
        this.cryptographyStrat = cryptographyStrat;
    }

    public String encryptData(String data, int key) {
        return this.cryptographyStrat.encryptData(data, key);
    }

    public String decryptData(String data, int key) {
        return this.cryptographyStrat.decryptData(data, key);
    }
}
