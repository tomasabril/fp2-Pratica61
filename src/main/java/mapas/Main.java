package mapas;


import java.util.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 *  projeto de programa Java usando Maven.
 * por Tomás Abril
 */
public class Main
{
    public static void main(String[] args) 
    {
        HashMap<String, Jogador> time1 = new HashMap<>();
        time1.put("Goleiro ", new Jogador(1,  "Julius Caesar "));
        time1.put("Atacante", new Jogador(10, "Newymeier    "));
        time1.put("Zagueiro", new Jogador(7,  "Thiago Silva  "));
        
        HashMap<String, Jogador> time2 = new HashMap<>();
        time2.put("Goleiro ", new Jogador(1,  "Nóiado         "));
        time2.put("Atacante", new Jogador(10, "Schwarzenegger"));
        time2.put("Zagueiro", new Jogador(7,  "Hummels        "));
        
        Set<String> timeset = time1.keySet();
       
        System.out.println("           time 1" + "               time 2");
        for(String posicao: timeset)
        {
            System.out.println(posicao + " : " + time1.get(posicao) + " : " + time2.get(posicao));
        }
    }
}
