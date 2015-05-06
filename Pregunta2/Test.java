public class Test {
	public static void main(String[] args) {
		
		/* 
		Alternar entre ambos algoritmos para analizar el comportamiento Según Peterson (Tie-Braker) y Dekker (Ticket)
		*/
		ModeloExclusion alg = new Dekker(); 
		//ModeloExclusion alg = new Peterson(); 
		
		Hilo hilo1Leon = new Hilo("Leon1", 0, alg);
		Hilo hilo2Leon = new Hilo("Leon2", 1, alg);
                Hilo hilo3Leon = new Hilo("Leon3", 2, alg);
                Hilo hilo4Leon = new Hilo("Leon4", 3, alg);
		hilo1Leon.start();
		hilo2Leon.start();
                hilo3Leon.start();
                hilo4Leon.start();
	}
}
