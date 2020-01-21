/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptdecrypt;

import encryptdecryptapi.ArgumentHandling;
import encryptdecryptapi.CryptographyContext;
import encryptdecryptapi.CryptographyFactory;
import encryptdecryptapi.DataProcess;

/**
 *
 * @author George.Giazitzis
 */
public class EncryptDecrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArgumentHandling argsHandle = new ArgumentHandling(args);
        CryptographyContext cryptoContext = CryptographyFactory.createContext(argsHandle.getAlg());

        String input = DataProcess.inputData(argsHandle.getData(), argsHandle.getInput());
        String outputData = DataProcess.getResultData(argsHandle.getMode(), cryptoContext, input, argsHandle.getKey());
        DataProcess.outputData(outputData, argsHandle.getOutput());
    }

}
