package command.remote;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.bubblesOff();
		hottub.cool();
		hottub.off();
	}
}
