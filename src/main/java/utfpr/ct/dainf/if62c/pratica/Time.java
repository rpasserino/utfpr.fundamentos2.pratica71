
package utfpr.ct.dainf.if62c.pratica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Time {
private HashMap<String, Jogador> jogadores = new HashMap<>();
public Time(){
}
public void addJogador(String chave, Jogador valor){
jogadores.put(chave, valor);
}
public HashMap getJogadores(){
return jogadores;
}
public List<Jogador> ordena(JogadorComparator jc){
List<Jogador> sortido = new ArrayList<>(jogadores.values());
Collections.sort(sortido, jc);
return sortido;
}
}