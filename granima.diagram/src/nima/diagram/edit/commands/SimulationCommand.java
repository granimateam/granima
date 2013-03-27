package nima.diagram.edit.commands;



import nima.Attaque;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;


public class SimulationCommand extends RecordingCommand {

	public SimulationCommand(TransactionalEditingDomain domain) {
		super(domain);
		// TODO Auto-generated constructor stub
	}
	private Attaque att;
	
	public Attaque getAttaque() {
		return att;
	}
	public void setAttaque(Attaque route) {
		this.att = route;
	}
	@Override
	protected void doExecute() {
		if(att!=null)
		{
			att.resolve();
		
		}else{
			System.out.println("no route!");
		}
		
	}

}
