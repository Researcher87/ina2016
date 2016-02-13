package de.arnold.ina;


/**
 * This class defines a newspaper entity.
 * 
 * <br><br><b>Initial date:</b> 13.02.2016
 * @author Arnold
 */
public class Newspaper {

	private int id;
	
	private int name;
	private int shortName;
	private int abbreviation;
	
	private Language language;
	private String feedURL;
	
	// Constructor
	
	public Newspaper(int id, int name, int shortName, int abbreviation, Language language, 
			String feedURL) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.abbreviation = abbreviation;
		this.language = language;
		this.feedURL = feedURL;
	}

	// Getters

	public int getId() {
		return id;
	}

	public int getName() {
		return name;
	}

	public int getShortName() {
		return shortName;
	}

	public int getAbbreviation() {
		return abbreviation;
	}

	public Language getLanguage() {
		return language;
	}

	public String getFeedURL() {
		return feedURL;
	}
	
}
