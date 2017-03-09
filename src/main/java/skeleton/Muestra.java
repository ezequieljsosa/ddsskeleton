package skeleton;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Muestra {
	private Magnitud magnitud;
	private float valor;
	private LocalDateTime fechaDeToma;
	
}
