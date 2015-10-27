package util;

import model.CEP;
import org.json.JSONObject;

/**
 *
 * @author bruce
 */
public class CEPParser {

    public static CEP parse(String content) {
        CEP result = new CEP();
        JSONObject obj = new JSONObject(content);
        result.setBairro(obj.getString("bairro"));
        result.setLogradouro(obj.getString("logradouro"));
        result.setLocalidade(obj.getString("localidade"));
        result.setUf(obj.getString("uf"));
        return result;
    }

}
