package bsu.gof.factory;

public class MACFactory extends ComputerFactory {
	public Computer createComputer() {
		return new MacComputer();
	}

	public Motheboard createMotheboard() {
		return new MacMotheboard();
	}

	public ROM createROM() {
		return new MacRom();
	}

	public CPU createCPU() {
		return new MacCpu();
	}
}
