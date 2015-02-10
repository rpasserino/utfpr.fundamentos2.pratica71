import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;

public class Pratica71 {
public static void main( String[] args ){
Scanner scanner = new Scanner(System.in);
boolean ver = true;
// Time alemanha;
Set<String> posicoes;
int qtd = scanner.nextInt();
List<Jogador> time = new ArrayList<>();
for(int i = 0 ; i < qtd ; i++){
time.add(new Jogador(scanner.nextInt(), scanner.next()));
}
Collections.sort(time, new JogadorComparator());
for(Jogador j: time){
System.out.println(j);
}
while(scanner.hasNextInt() && ver){
int num = scanner.nextInt();
if(num != 0){
Jogador temp = new Jogador(num, scanner.next());
int indice = Collections.binarySearch(time, temp);
if(indice < 0){
time.add(temp);
}
else{
time.remove(indice);
time.add(indice, temp);
}
Collections.sort(time, new JogadorComparator());
for(Jogador j: time){
System.out.println(j);
}
}
else ver = false;
}
}
}