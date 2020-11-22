package command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl invoker = new SimpleRemoteControl();
		
		Light receiver = new Light();
		LightOnCommand lightOn = new LightOnCommand(receiver);
		GarageDoor receiver2 = new GarageDoor();
		GarageDoorOpenCommand gdOpen = new GarageDoorOpenCommand(receiver2);
		
		invoker.setCommand(lightOn);
		invoker.buttonWasPressed();
		invoker.setCommand(gdOpen);
		invoker.buttonWasPressed();
	}
}
