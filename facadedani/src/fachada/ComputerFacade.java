package fachada;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(){
    this.cpu       = new CPU();
    this.hardDrive = new HardDrive();
    this.memory    = new Memory();


}
public void Start(){
    System.out.println("STARTING....");
    cpu.freeze();
    memory.load();
    hardDrive.read();
    cpu.jum();
    cpu.execute();
}
}
