package nima.diagram.edit.commands;



import nima.Archetype;
import nima.Config;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;


public class SimulationCommand extends RecordingCommand {

	public SimulationCommand(TransactionalEditingDomain domain) {
		super(domain);
		// TODO Auto-generated constructor stub
	}
	private Config att;
	
	public Config getConfig() {
		return att;
	}
	public void setConfig(Config route) {
		this.att = route;
	}
	@Override
	protected void doExecute() {
		if(att!=null)
		{
			att.attaque(0)		;
		}else{
			System.out.println("no route!");
		}
		
	}

}
