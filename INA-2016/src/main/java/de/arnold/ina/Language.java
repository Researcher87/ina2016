package de.arnold.ina;

/**
 * This enumeration defines the languages a newspaper can have.
 * 
 * <br><br><b>Initial date:</b> 13.02.2016
 * @author Arnold
 */
public enum Language {

	GERMAN {
		@Override
		public String toString() {
			return "German";
		}
	},
	
	ENGLISH {
		@Override
		public String toString() {
			return "English";
		}
	}
	
}
