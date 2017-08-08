package sensoriamentoarea.logica;

public class AreaSensoriada {
	private UnidadesSensoras[] us;
	
	public AreaSensoriada() {
		this.us = new UnidadesSensoras[0];
	}
	
	public void addSensor(UnidadesSensoras us) {
		UnidadesSensoras[] nova = new UnidadesSensoras[this.us.length+1];
		for (int i = 0; i < this.us.length; i++) {
			nova[i] = this.us[i];
		}
		nova[nova.length-1] = us;
		this.us = nova;
	}
	
	
}
