package bsu.gof.factory;

public class PCFactory extends ComputerFactory {
	public Computer createComputer() {
		return new PCComputer();
	}

	public Motheboard createMotheboard() {
		return new PCMotheboard();
	}

	public ROM createROM() {
		return new PCRom();
	}

	public CPU createCPU() {
		return new PCCpu();
	}
}