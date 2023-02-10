package tarea2;

public class tareaindividual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean persona_salio_pais = true; 
		boolean contagios_cercanos = true; 

		//Evaluar condiciones
		if (persona_salio_pais == true) {
			System.out.println("La persona debe permanecer 14 dias en observación");
		}
		else if (contagios_cercanos == true) {
			System.out.println("La persona debe hacer cuarentena y el PCR");
		}
		else {
			System.out.println("La persona no tendra que hacer cuarentena ni el PCR");
		}
		
		
		
		
	}

}


/*Considere el siguiente enunciado. Determine las unidades al mínimo nivel de detalle, y expréselas
como un conjunto de expresiones lógicas.

“Una persona debe permanecer 14 días en observación únicamente si ha salido del país. La persona
se hará el PCR si quiere volver a la normalidad. Dado que ni la persona ha salido del país ni presenta
contagios cercanos, no tendrá que hacer cuarentena ni se le hará el PCR.”
Recuerde asociar cada frase atómica como una variable, y asignarle un valor de verdad cualquiera,
siempre que aplique al caso. Una vez realizado, evalúe la situación con al menos dos combinaciones
de valores de verdad iniciales, y verifique los cambios en el resultado final.*/