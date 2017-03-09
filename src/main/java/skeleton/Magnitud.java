package skeleton;

import lombok.Data;

@Data
public class Magnitud {

	private String nombre;
	private float min;
	private float max;
	
	public boolean validar(Muestra muestra){
		return this.getMin() <= muestra.getValor() && muestra.getValor() <= this.getMax();
	}
	
}
