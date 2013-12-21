package models;

import java.util.ArrayList;
import java.util.List;


//CONTROLLER: controlador do sistema
public class Planejamento{ 

	// CREATOR: Classe planejamento regista a lista das disciplina
    private List<Periodo> periodos;
    private static final int MINIMO_DE_CREDITOS = 16;
    private static final int MAXIMO_DE_CREDITOS = 28;

	public Planejamento() {
		periodos = new ArrayList<Periodo>();
	}

	public void adicionaPeriodo(Periodo periodo){
		this.periodos.add(periodo);
	}
	
	public List<Periodo> getPeriodos() {
        return this.periodos;
	}
	
	public void removePeriodo(Periodo periodo){
		this.periodos.remove(this.periodos.remove(periodo));
	}
	
	public int minimoDeCreditos() {
		return this.MINIMO_DE_CREDITOS;
	}
	
	public int maximoDeCreditos() {
		return this.MAXIMO_DE_CREDITOS;
	}


}
