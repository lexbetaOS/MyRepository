// No satisface condicion de progreso ya que requiere alternancia estricta.
public class Dekker extends ModeloExclusion {
	//private volatile int m_iTurn;
          private  volatile  int m_iTurn[]=new int[4];
	public Dekker() {
		//m_iTurn = TURN_0;
                  m_iTurn[0]=TURN_0;
                  m_iTurn[1]=TURN_1;
                  m_iTurn[2]=TURN_2;
                  m_iTurn[3]=TURN_NOT;
	}
	public void entrarSC(int iId) {
		//while (m_iTurn != iId)
                while(m_iTurn[iId] != iId){
                Thread.yield();}
                //System.out.println("Me columpio esperando");}
	}
	public void salirSC(int iId) {
                if(m_iTurn[0]==TURN_NOT){
                 m_iTurn[iId] =TURN_NOT;
                 m_iTurn[0]=TURN_0;
                 }
                if(m_iTurn[1]==TURN_NOT){
                 m_iTurn[iId] =TURN_NOT;
                 m_iTurn[1]=TURN_1;
                 }
                if(m_iTurn[2]==TURN_NOT){
                 m_iTurn[iId] =TURN_NOT;
                 m_iTurn[2]=TURN_2;
                 }
                if(m_iTurn[3]==TURN_NOT){
                 m_iTurn[iId] =TURN_NOT;
                 m_iTurn[3]=TURN_3;
                 }
		//m_iTurn = 1 - iId;
                while(m_iTurn[iId] != TURN_NOT){
                Thread.yield();}
                 
	}
        //public void salirCPio(int iId){
          //     m_iTurn[iId] =iId;
      //  }
         public void sal(int iId){
               m_iTurn[iId]=iId;
         }
      
}
