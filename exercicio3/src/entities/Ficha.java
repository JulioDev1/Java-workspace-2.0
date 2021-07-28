package entities;

public class Ficha { ///// nome da classe ////////////
	
	public double notaA, notaB, notaC; //////// atributos da classe/////////////
	public String nome;
	
	public double validatingNote(){
		return notaA + notaB + notaC;
	}
	public double final_points() { ////////// metodos da clase //////////
		if ( validatingNote() < 60.0) {
			return 60 - validatingNote();
			
	   }else {
			return 0.0;
			
		}
		
	}
}
