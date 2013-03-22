package bsu.gof.factory;

public abstract class Computer {
	private Motheboard motheboard;
	private ROM rom;
	private CPU cpu;

	public Motheboard getMotheboard() {
		return motheboard;
	}

	public void setMotheboard(Motheboard motheboard) {
		this.motheboard = motheboard;
	}

	public ROM getRom() {
		return rom;
	}

	public void setRom(ROM rom) {
		this.rom = rom;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public abstract ComputerType getType();
}
