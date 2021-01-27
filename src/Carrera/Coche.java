package Carrera;

public class Coche {

		private String nombre_piloto;
		private int dorsal;
		private double distancia_carrera;
		private String estado_coche;
		private int potencia;
		private double velocidad;
		private double kms_recorridos;
		
		@Override
		public String toString() {
			return "Coche [nombre_piloto=" + nombre_piloto + ", dorsal=" + dorsal + ", distancia_carrera="
					+ distancia_carrera + ", estado_coche=" + estado_coche + ", potencia=" + potencia + ", velocidad="
					+ velocidad + ", kms_recorridos=" + kms_recorridos + "]";
		}

		public Coche(String nombre_piloto, int dorsal, double distancia_carrera, String estado_coche, int potencia,
				double velocidad, double kms_recorridos) {
			super();
			this.nombre_piloto = nombre_piloto;
			this.dorsal = dorsal;
			this.distancia_carrera = distancia_carrera;
			this.estado_coche = estado_coche;
			this.potencia = potencia;
			this.velocidad = velocidad;
			this.kms_recorridos = kms_recorridos;
		}

		public String getNombre_piloto() {
			return nombre_piloto;
		}

		public void setNombre_piloto(String nombre_piloto) {
			this.nombre_piloto = nombre_piloto;
		}

		public int getDorsal() {
			return dorsal;
		}

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}

		public double getDistancia_carrera() {
			return distancia_carrera;
		}

		public void setDistancia_carrera(double distancia_carrera) {
			this.distancia_carrera = distancia_carrera;
		}

		public String getEstado_coche() {
			return estado_coche;
		}

		public void setEstado_coche(String estado_coche) {
			this.estado_coche = estado_coche;
		}

		public int getPotencia() {
			return potencia;
		}

		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}

		public double getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(double velocidad) {
			this.velocidad = velocidad;
		}

		public double getKms_recorridos() {
			return kms_recorridos;
		}

		public void setKms_recorridos(double kms_recorridos) {
			this.kms_recorridos = kms_recorridos;
		}
		
		
}
