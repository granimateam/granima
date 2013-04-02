package nima.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nima.diagram.providers.NimaElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NimaPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNima1Group());
	}

	/**
	 * Creates "nima" palette tool group
	 * @generated
	 */
	private PaletteContainer createNima1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nima1Group_title);
		paletteContainer.setId("createNima1Group"); //$NON-NLS-1$
		paletteContainer.add(createArchetype1CreationTool());
		paletteContainer.add(createAttaque2CreationTool());
		paletteContainer.add(createConfig3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchetype1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Archetype1CreationTool_title,
				Messages.Archetype1CreationTool_desc,
				Collections.singletonList(NimaElementTypes.Archetype_2001));
		entry.setId("createArchetype1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NimaElementTypes
				.getImageDescriptor(NimaElementTypes.Archetype_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttaque2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(NimaElementTypes.ArchetypeCible_4003);
		types.add(NimaElementTypes.ConfigEnchaine_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Attaque2CreationTool_title,
				Messages.Attaque2CreationTool_desc, types);
		entry.setId("createAttaque2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NimaElementTypes
				.getImageDescriptor(NimaElementTypes.ArchetypeCible_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConfig3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Config3CreationTool_title,
				Messages.Config3CreationTool_desc,
				Collections.singletonList(NimaElementTypes.Config_3001));
		entry.setId("createConfig3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NimaElementTypes
				.getImageDescriptor(NimaElementTypes.Config_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
