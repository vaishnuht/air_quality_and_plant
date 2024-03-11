package air_quality_and_plant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlantCrud {
		
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/air_and_plant?user=root&password=root");
	}
	public int addPLant(Plant plant) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO PLANT VALUES(?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, plant.getPlantId());
		preparedStatement.setString(2, plant.getSciName());
		preparedStatement.setString(3, plant.getCommName());
		preparedStatement.setString(4, plant.getDescription());
		preparedStatement.setString(5, plant.getGases());
		preparedStatement.setDouble(6, plant.getRadius());
		preparedStatement.setString(7, plant.getImg());
		preparedStatement.setString(8, plant.getLink());
		preparedStatement.setString(9, plant.getOrigin());
		preparedStatement.setString(10,plant.getSpecies());
		int res=preparedStatement.executeUpdate();
		connection.close();
		return res;
	}
	
	public int delete(int id) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM PLANT WHERE PLANTID=?");
		preparedStatement.setInt(1, id);
		int res=preparedStatement.executeUpdate();
		connection.close();
		return res;
	}
	public List<Plant> displayAll() throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM PLANT");
		ResultSet resultSet=preparedStatement.executeQuery();
		
		List<Plant> list=new ArrayList<Plant>();
		while(resultSet.next()) {
			Plant plant=new Plant();
			plant.setPlantId(resultSet.getInt("plantid"));
			plant.setSciName(resultSet.getString("plantSciName"));
			plant.setCommName(resultSet.getString("plantCommName"));
			plant.setDescription(resultSet.getString("plantDescription"));
			plant.setGases(resultSet.getString("gases"));
			plant.setRadius(resultSet.getDouble("radius"));
			plant.setImg(resultSet.getString("plantimg"));
			plant.setLink(resultSet.getString("plantlink"));
			plant.setOrigin(resultSet.getString("plantorigin"));
			plant.setSpecies(resultSet.getString("plantspecies"));
			list.add(plant);
		}
		connection.close();
		return list;
	}
	public List<Plant> selectDisplay(String gas)throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM PLANT where GASES like %?%");
		preparedStatement.setString(1, gas);
		ResultSet resultSet=preparedStatement.executeQuery();
		
		List<Plant> list=new ArrayList<Plant>();
		while(resultSet.next()) {
			Plant plant=new Plant();
			plant.setPlantId(resultSet.getInt(1));
			plant.setSciName(resultSet.getString(2));
			plant.setCommName(resultSet.getString(3));
			plant.setDescription(resultSet.getString(4));
			plant.setGases(resultSet.getString(5));
			plant.setRadius(resultSet.getDouble(6));
			plant.setImg(resultSet.getString(7));
			plant.setLink(resultSet.getString(8));
			plant.setOrigin(resultSet.getString(9));
			plant.setSpecies(resultSet.getString(10));
			list.add(plant);
		}
		connection.close();
		return list;
	}
}
