package de.uni_ko.fitnessstudio.util;

import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.ChangeImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;

import org.eclipse.emf.henshin.trace.TracePackage;

public class EngineFactory {

	public static Engine createEngine() {
		Engine result = new EngineImpl();
		result.getOptions().put(Engine.OPTION_DETERMINISTIC, false);
		ChangeImpl.PRINT_WARNINGS = false;

		// Register the Trace Model package
		TracePackage.eINSTANCE.getName();
		
		return result;
	}

}
