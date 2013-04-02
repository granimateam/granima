package nima.diagram.edit.commands;



import nima.Archetype;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;


public class SimulationCommand extends RecordingCommand {

	public SimulationCommand(TransactionalEditingDomain domain) {
		super(domain);
		// TODO Auto-generated constructor stub
	}
	private Archetype att;
	
	public Archetype getArchetype() {
		return att;
	}
	public void setArchetype(Archetype route) {
		this.att = route;
	}
	@Override
	protected void doExecute() {
		if(att!=null)
		{
			att.baston(0);		
		}else{
			System.out.println("no route!");
		}
		
	}

}
