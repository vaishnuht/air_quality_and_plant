package air_quality_and_plant;

public class RoomDetails {
	private int roomNo;
	private String date;
	private String plantName;
	private int id;
	public RoomDetails(int roomNo, String date, String plantName) {
		super();
		this.id=(roomNo+date+plantName).hashCode();
		this.roomNo = roomNo;
		this.date = date;
		this.plantName = plantName;
	}
	public RoomDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
