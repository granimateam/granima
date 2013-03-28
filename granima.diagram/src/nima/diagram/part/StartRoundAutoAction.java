package nima.diagram.part;

import nima.Attaque;
import nima.Combat;
import nima.diagram.edit.commands.AutoRoundCommand;
import nima.diagram.edit.commands.RoundCommand;
import nima.diagram.edit.commands.SimulationCommand;
import nima.diagram.edit.parts.AttaqueEditPart;
import nima.diagram.edit.parts.CombatEditPart;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

/**
 * @generated
 */
public class StartRoundAutoAction implements IActionDelegate {

	
	private Combat  cmb;
	
	@Override
	public void run(IAction action) {
		if(cmb!=null)
		{


			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(cmb);
			AutoRoundCommand simu = new AutoRoundCommand(domain);
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
