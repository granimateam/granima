package tool;

import nima.Archetype;
import nima.Config;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public class AnimaPopup {
	
	
	
	public static int getScoreDes(Archetype joueur, String action)
	{
		if(joueur.isJoueur())
		{
			String nomjoueur = joueur.getNom();
			InputDialog d = new InputDialog(new Shell(),"Score du joueur", "Entrez le score "+action+" au dés de "+nomjoueur, "50",null);
			int choice = d.open();
			if(choice==Window.OK) {
				Integer result = Integer.parseInt(d.getValue());
				return result;
			}
		}		
		return Des.fullRoll();
	}
	
	public static int calcMarge(int attaque, int rollAtt, int def, int rollDef)
	{
		String tab[] ={"Ok"}; 
		int marge = attaque+rollAtt - def - rollDef;
		int defenseTotale=def+rollDef;
		if(defenseTotale<0) defenseTotale=0;
		String info = "Attaque : "+attaque +" + "+rollAtt+" = "+(attaque+rollAtt)+
					"\nDéfense :"+def+" + "+rollDef+" = "+defenseTotale+"\n Total : "+marge;
		MessageDialog d = new MessageDialog(new Shell(), "Résultat", null, info, 0, tab, 0);
		d.open();
		
		return marge;
	}

	
	public static void resultat(Config attaque, Archetype defenseur, String resultat, int valeur, String resultat2 )
	{
		String tab[] ={"Ok"};
		String titre = attaque.getNom()+" sur "+defenseur.getNom();
		String message = resultat +"\n"+valeur+" "+resultat2;
		MessageDialog d = new MessageDialog(new Shell(), titre, null, message, 0, tab, 0);
		d.open();
	}
	
}
