package bsu.gof.factory;

public class SPARCFactory extends ComputerFactory {

	@Override
	public Computer createComputer() {
		return new SPARCComputer();
	}

	@Override
	public Motheboard createMotheboard() {
		return new SPARCMotheboard();
	}

	@Override
	public ROM createROM() {
		return new SPARCRom();
	}

	@Override
	public CPU createCPU() {
		return new SPARCCpu();
	}
}
