package bsu.gof.factory;

public abstract class ComputerFactory {
	public abstract Computer createComputer();

	public abstract Motheboard createMotheboard();

	public abstract ROM createROM();

	public abstract CPU createCPU();

	public static ComputerFactory getInstance(ComputerType ctype) {
		ComputerFactory cf = null;
		switch (ctype) {
		case MAC:
			cf = new MACFactory();
			break;
		case PC:
			cf = new PCFactory();
			break;
		case SPARK:
			cf = new SPARCFactory();
			break;
		}
		return cf;
	}

}
