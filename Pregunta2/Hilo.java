public class Hilo extends Thread {
	private String name;
	private int m_iId;
	private ModeloExclusion m_oExc;
	public Hilo(String sName, int iId, ModeloExclusion oExc) {
		name = sName;
		m_iId = iId;
		m_oExc = oExc;
	}
	public void run() {
		while (true) {
			System.out.println(name + " desea entrar a comer en la SC");
			m_oExc.entrarSC(m_iId);
			System.out.println(name + " entro a la SC a comer");
			ModeloExclusion.SC();
			m_oExc.salirSC(m_iId);
			System.out.println(name + " salio de la SC para columpiarse");
			ModeloExclusion.SColumpio();
                        //m_oExc.sal(m_iId);
                        //m_oExc.salirCP(m_iId);
		}
	}
}
