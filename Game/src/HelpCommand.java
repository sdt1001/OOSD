
public class HelpCommand implements Commandable {

	//static means it exists outside of any other instances; final means its constant so 
	//it cannot be changed while the program is running; this is a Singleton Instance
	private static final HelpCommand INSTANCE = new HelpCommand();
	
	private HelpCommand() {
		//blank constructor sets up the class
	}
	
	public static HelpCommand getInstance() {
		//after object is constructed above privately, this method provides the single 
		//instance of the class
		return INSTANCE; 
	}
	
	public String getCommandText() {
		
		return "help";
	}
	@Override
	public void doCommand() {
		
		System.out.println("Valid Commands:");
		
		for (Commandable command : GameController.getInstance().Commands) {
			
			System.out.println(command.getCommandText());
		}
	}

	@Override
	public boolean matchCommand(String input) {
		
		if (input.equals(getCommandText())) return true;
		return false;
	}

}
