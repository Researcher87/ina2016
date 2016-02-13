package de.arnold.ina;


/**
 * This class defines a newspaper.
 * 
 * <br><br><b>Initial date:</b> 13.02.2016
 * @author Arnold
 */
public class Newspaper {

	private String fullName;
	private String shortName;
	private String abbreviation;
	
	private Language language;
	
	private String feedURL;

	// Constructor
	
	public Newspaper(String fullName, String shortName, String abbreviation, Language language, 
			String feedURL) {
		this.fullName = fullName;
		this.shortName = shortName;
		this.abbreviation = abbreviation;
		this.language = language;
		this.feedURL = feedURL;
	}

	// Getters
	
	public String getFullName() {
		return fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public Language getLanguage() {
		return language;
	}

	public String getFeedURL() {
		return feedURL;
	}
	
}
