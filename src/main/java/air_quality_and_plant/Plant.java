package air_quality_and_plant;

public class Plant {
	private String sciName;
	private String commName;
	private String description;
	private String gases;
	private double radius;
	private int plantId;
	private String img;
	private String link;
	private String origin;
	private String species;
	public Plant(String sciName, String commName, String description, String gases, double radius, String img, String link, String origin, String species) {
		this.sciName = sciName;
		this.commName = commName;
		this.description = description;
		this.gases = gases;
		this.radius = radius;
		this.plantId =sciName.hashCode();
		this.setImg(img);
		this.setLink(link);
		this.species=species;
		this.origin=origin;
		
	}
	
	public Plant() {
		
	}

	public String getSciName() {
		return sciName;
	}

	public void setSciName(String sciName) {
		this.sciName = sciName;
	}

	public String getCommName() {
		return commName;
	}

	public void setCommName(String commName) {
		this.commName = commName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGases() {
		return gases;
	}

	public void setGases(String gases) {
		this.gases = gases;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
