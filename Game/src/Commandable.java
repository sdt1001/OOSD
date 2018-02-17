
public interface Commandable {

	public String getCommandText();
	
	public void doCommand();
	
	public boolean matchCommand(String input);
	
}
