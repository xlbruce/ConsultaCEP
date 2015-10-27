package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CEP;
import util.CEPParser;

/**
 *
 * @author bruce
 */
public class Controller {

    static final String urlStr = "http://cep.correiocontrol.com.br/";

    public static CEP getCEP(String cep) throws IllegalArgumentException,
            IOException {
        cep = cep.trim();
        String urlCompleta = urlStr + cep + ".json";
        try {
            URL url = new URL(urlCompleta);
            InputStreamReader r = new InputStreamReader(url.openStream());
            BufferedReader reader = new BufferedReader(r);

            String content = reader.readLine();
            //codigo de controle de erro da API
            if (content.startsWith("correio")) {
                throw new IllegalArgumentException("CEP inválido");
            }
            return CEPParser.parse(content);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            throw new IOException("Não foi possivel se conectar");
        }        
        return null;
    }

}
