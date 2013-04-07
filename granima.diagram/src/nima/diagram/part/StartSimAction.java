package nima.diagram.part;

import nima.Config;
import nima.diagram.edit.commands.SimulationCommand;
import nima.diagram.edit.parts.ConfigEditPart;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

/**
 * @generated
 */
public class StartSimAction implements IActionDelegate {

	
	private Config att;
	
	@Override
	public void run(IAction action) {
		if(att!=null)
		{

			Diagnostic d = Diagnostician.INSTANCE.validate(att.eContainer());
			
			if(d.getChildren().size()==0){
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(att);
				SimulationCommand simu = new SimulationCommand(domain);
				simu.setConfig(att);
				
				domain.getCommandStack().execute(simu);
			}else
			{
				for(Diagnostic test : d.getChildren())
				{
					System.err.println(test.getMessage());
					
				}
			
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {		
		
		try{
			StructuredSelection s = (StructuredSelection)selection;
			Object o = s.getFirstElement();
			if(o==null) return;
			ConfigEditPart takedit =(ConfigEditPart) o;
			NodeImpl node = (NodeImpl)takedit.getModel();			
			Config att = (Config)node.getElement();
			this.att=att;
			action.setEnabled(true);

		}catch (Exception e)
		{
			this.att=null;
		}
		
	}

}
