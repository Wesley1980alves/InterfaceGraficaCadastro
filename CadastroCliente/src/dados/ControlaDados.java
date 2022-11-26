package dados;

import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import java.util.ArrayList;
import static javax.swing.UIManager.get;
import javax.swing.text.html.HTMLDocument.Iterator;
import negocio.Cliente;

public class ControlaDados {

    private ArrayList<Cliente> lista = new ArrayList<>();
    private static  int codigo = 0;
    private static int chave = 0;

    public boolean salvar(Cliente cl) {
        cl.setCodigo(++chave);
        codigo++;
        if (cl != null) {
            lista.add(cl);
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Cliente> mostrarTodos() {
        return lista;
    }

}
