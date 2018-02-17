
public class QuitCommand implements Commandable {

	//static means it exists outside of any other instances; final means its constant so 
	//it cannot be changed while the program is running; this is a Singleton Instance
	private static final QuitCommand INSTANCE = new QuitCommand();
	
	private QuitCommand() {
		//blank constructor sets up the class
	}
	
	public static QuitCommand getInstance() {
		//after object is constructed above privately, this method provides the single 
		//instance of the class
		return INSTANCE; 
	}
	public String getCommandText() {
		
		return "quit";
	}
	@Override
	public void doCommand() {
		
		System.exit(0); //this terminates the program when "quit" is entered

	}

	@Override
	public boolean matchCommand(String input) {
		
		if (input.equals(getCommandText())) return true;
		return false;
	}

}
