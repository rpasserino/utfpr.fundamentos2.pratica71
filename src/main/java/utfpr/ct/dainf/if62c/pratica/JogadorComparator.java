package utfpr.ct.dainf.if62c.pratica;
import java.util.Comparator;


public class JogadorComparator implements Comparator<Jogador> {
private boolean standard, num, name, ver;
public JogadorComparator(){
standard = true;
num = true;
name = true;
ver = false;
}
public JogadorComparator(boolean standard, boolean num, boolean name){
this.standard = standard;
this.num = num;
this.name = name;
ver = false;
}
@Override
public int compare(Jogador j1, Jogador j2){
if(standard) return numComparator(j1, j2);
else return nameComparator(j1, j2);
}
public int numComparator(Jogador j1, Jogador j2){
if(j1.numero == j2.numero && !ver){
ver = true;
return nameComparator(j1, j2);
}
else if(num){
if(j1.numero > j2.numero) return 1;
else if(j1.numero < j2.numero) return -1;
else return 0;
}
else{
if(j1.numero > j2.numero) return -1;
else if(j1.numero < j2.numero) return 1;
else return 0;
}
}
public int nameComparator(Jogador j1, Jogador j2){
if(j1.nome.equals(j2.nome) && !ver){
ver = true;
return numComparator(j1, j2);
}
else if(name){
int tam = j1.nome.length();
if(tam > j2.nome.length()) tam = j2.nome.length();
for(int i = 0; i < tam ; i++){
if(j1.nome.charAt(i) > j2.nome.charAt(i)) return 1;
else if(j1.nome.charAt(i) < j2.nome.charAt(i)) return -1;
}
return 0;
}
else{
int tam = j1.nome.length();
if(tam > j2.nome.length()) tam = j2.nome.length();
for(int i = 0; i < tam ; i++){
if(j1.nome.charAt(i) > j2.nome.charAt(i)) return -1;
else if(j1.nome.charAt(i) < j2.nome.charAt(i)) return 1;
}
return 0;
}
}
}