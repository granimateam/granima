package nima.diagram.edit.commands;



import nima.Combat;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;


public class AutoRoundCommand extends RecordingCommand {

	public AutoRoundCommand(TransactionalEditingDomain domain) {
		super(domain);
		// TODO Auto-generated constructor stub
	}
	private Combat cmb;
	

	
	public Combat getCmb() {
		return cmb;
	}



	public void setCmb(Combat cmb) {
		this.cmb = cmb;
	}



	@Override
	protected void doExecute() {
		if(cmb!=null)
		{
			cmb.resetAndRun();
		
		}else{
			System.out.println("no fight!");
		}
		
	}

}
