package nima.diagram.part;

import nima.Combat;
import nima.diagram.edit.commands.RoundCommand;
import nima.diagram.edit.parts.CombatEditPart;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

/**
 * @generated
 */
public class StartRoundAction implements IActionDelegate {

	
	private Combat  cmb;
	
	@Override
	public void run(IAction action) {
		if(cmb!=null)
		{


			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(cmb);
			RoundCommand simu = new RoundCommand(domain);
			simu.setCmb(cmb);
			
			
			domain.getCommandStack().execute(simu);

		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {		
		
		try{
			StructuredSelection s = (StructuredSelection)selection;
			Object o = s.getFirstElement();
			if(o==null) return;
			CombatEditPart takedit =(CombatEditPart) o;
			DiagramImpl node = (DiagramImpl)takedit.getModel();			
			Combat att = (Combat)node.getElement();
			this.cmb=att;
			action.setEnabled(true);

		}catch (Exception e)
		{
			this.cmb=null;
		}
		
	}

}
