public abstract class ModeloExclusion {
	public static final int TURN_0 = 0;
	public static final int TURN_1 = 1;
        public static final int TURN_2 = 2;
        public static final int TURN_3 = 3;
        public static final int TURN_NOT = 10;
	public static final int TIME = 2000;
	public static void SC() {
		try {
			Thread.sleep((int) (Math.random() * TIME + 1000));
		} catch (InterruptedException e) {}
	}
	public static void noSC() {
		try {
			Thread.sleep((int) (Math.random() * TIME));
		} catch (InterruptedException e) {}
	}
        public static void SColumpio() {
		try {
			Thread.sleep((int) (Math.random() * TIME + 5000));
		} catch (InterruptedException e) {}
	}
	public abstract void entrarSC(int iId);
	public abstract void salirSC(int iId);
}
