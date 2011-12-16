package uk.ac.dotrural.irp.sparql.restful.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class BundleGenerator {
	private static final String BUNDLE_NAME = "uk.ac.dotrural.irp.restful.templates.query";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private BundleGenerator() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
