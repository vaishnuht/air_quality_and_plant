package air_quality_and_plant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomCrud {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/air_and_plant?user=root&password=root");
	}
	
	public int addRoom(RoomDetails roomDetails) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("Insert into Room Values (?,?,?,?)");
		preparedStatement.setInt(2, roomDetails.getRoomNo());
		preparedStatement.setString(4, roomDetails.getDate());
		preparedStatement.setString(3, roomDetails.getPlantName());
		preparedStatement.setInt(1, roomDetails.getId());
		int res=preparedStatement.executeUpdate();
		connection.close();
		return  res;
	}

	public int deleteRoom(int id) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from Room where idroom=?");
		preparedStatement.setInt(1,id);

		int res=preparedStatement.executeUpdate();
		connection.close();
		return res;
	}

	public List<RoomDetails> displayRoom() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM ROOM");
		ResultSet resultSet =preparedStatement.executeQuery();
		List<RoomDetails> details=new ArrayList<RoomDetails>();
		while(resultSet.next()) {
			RoomDetails roomDetails=new RoomDetails();
			roomDetails.setRoomNo(resultSet.getInt("roomno"));
			roomDetails.setDate(resultSet.getString("date"));
			roomDetails.setPlantName(resultSet.getString("plantname"));
			roomDetails.setId(resultSet.getInt("idroom"));
			details.add(roomDetails);
		}
		connection.close();
		return details;
	}
}

