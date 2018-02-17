
public class MyGame {

	public static void main(String[] args) {

		GameController.getInstance().Commands.add(QuitCommand.getInstance());
		GameController.getInstance().Commands.add(HelpCommand.getInstance());
		
		while(true) {
			
			GameController.getInstance().getCommand();
		}

	}

}
