package atividade13;

public class substituindo {

	public static void main(String[] args) {
		String espacos = "ispaços";
		String corrigir = espacos.replace("i","e");
		
		String todosEspacos = "e s p a ç o";
		String tiraespacos = todosEspacos.replaceAll(" ", " ");
		
		System.out.println("Antes: "+espacos + " Depois: " + corrigir);
		System.out.println("Antes: "+todosEspacos + " Depois: " +tiraespacos);
		// TODO Auto-generated method stub

	}

}
