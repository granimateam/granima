package nima.diagram.providers;

import nima.diagram.part.NimaDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = NimaDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			NimaDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
