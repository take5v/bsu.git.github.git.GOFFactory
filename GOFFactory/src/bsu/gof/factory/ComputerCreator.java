package bsu.gof.factory;

public class ComputerCreator {
	public Computer getProduct(ComputerType ctype) {
		if (computer == null)
		{
			computer = createComputer(ctype);
		}
		return computer;
	}
	
	protected Computer createComputer(ComputerType ctype) {
		CPU cpu = null;
		Motheboard motheboard = null;
		ROM rom = null;
		
		switch (ctype) {
		case MAC:
			computer = new MacComputer();
			cpu = new MacCpu();
			motheboard = new MacMotheboard();
			rom = new MacRom();
			break;
		case PC:
			computer = new PCComputer();
			cpu = new PCCpu();
			motheboard = new PCMotheboard();
			rom = new PCRom();
			break;
		case SPARK:
			computer = new SPARCComputer();
			cpu = new SPARCCpu();
			motheboard = new SPARCMotheboard();
			rom = new SPARCRom();
			break;
		}
		
		computer.setCpu(cpu);
		computer.setMotheboard(motheboard);
		computer.setRom(rom);
		
		return computer;
	}
	
	private Computer computer;
}
