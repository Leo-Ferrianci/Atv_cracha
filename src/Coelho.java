import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.*;

public class Coelho {
	char sexo;
	float altura;
	float massa;
	String nome;
	String raça;
	String cor;
	
	public Coelho(String n)
	{
		raça=n;
	}
	public void saltitar(int pulou) {System.out.println("O coelho pulou "+ pulou+ " vezes"); }
	
	public void chiar(String hick) { System.out.println("Chiando: "+ hick);} 
	
	public void ouvir() {}
	
	public boolean sorrir() {return true;}
	
	public void comer(String oque) {}
	
	public static void main(String[] args) {

        String raça1 = "Neatherland Dwarf";
        String cor1 = "marrom";
        String nome1 = "Sansão";

        ArrayList<String> coelho1 = new ArrayList<>();
        coelho1.add(raça1);
        coelho1.add(cor1);
        coelho1.add(nome1);        

        System.out.println("Os detalhes do coelho 1 são: " + coelho1);
		Coelho o1=new Coelho ("Neatherland Dwarf");
		o1.saltitar(5);
        
        String raça2 = "Florida White";
        String cor2 = "Branco";
        String nome2 = "Tambor";

        ArrayList<String> coelho2 = new ArrayList<>();
        coelho2.add(raça2);
        coelho2.add(cor2);
        coelho2.add(nome2);        

        System.out.println("Os detalhes do coelho 2 são: " + coelho2);
        Coelho o2=new Coelho ("Florida White");
		o2.comer("cenoura");
        
        String raça3 = "Flemish Giant";
        String cor3 = "cinza";
        String nome3 = "Pernalonga";

        ArrayList<String> coelho3 = new ArrayList<>();
        coelho3.add(raça3);
        coelho3.add(cor3);
        coelho3.add(nome3);        

        System.out.println("Os detalhes do coelho 3 são: " + coelho3);
        Coelho o3=new Coelho ("Flemish Giant");
		o3.chiar("O que há, velhinho?");
		
		Set<String> hash_Set = new HashSet<String>();
		
		hash_Set.add("Neatherland Dwarf");
		hash_Set.add("Florida White");
		hash_Set.add("Flemish Giant");
		
		System.out.println(hash_Set);
		
		Map map=new HashMap();  
	    //Adicionando elementos do Map  
	    map.put(1,"Neatherland Dwarf");  
	    map.put(2,"Florida White");  
	    map.put(3,"Flemish Gian");   
	    //Percorrendo o map 
	    Set set=map.entrySet();
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Covertendo o map
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    } 
    }
	
	
	
	

}
