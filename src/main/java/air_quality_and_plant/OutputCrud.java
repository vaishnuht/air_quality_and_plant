package air_quality_and_plant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OutputCrud {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/air_and_plant?user=root&password=root");
	}
	
	public void insert(MQOutput output) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO OUTPUT VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setString(1, output.getDate()+output.getTime());
		preparedStatement.setString(2, output.getDate());
		preparedStatement.setString(3, output.getTime());
		preparedStatement.setDouble(4, output.getMq2());
		preparedStatement.setDouble(5, output.getMq3());
		preparedStatement.setDouble(6, output.getMq4());
		preparedStatement.setDouble(7, output.getMq5());
		preparedStatement.setDouble(8, output.getMq7());
		preparedStatement.setDouble(9, output.getMq8());
		preparedStatement.setDouble(10, output.getMq9());
		preparedStatement.setDouble(11, output.getMq135());
		preparedStatement.executeUpdate();
		connection.close();
	}
	
	public List<PrepareOutput> display() throws ClassNotFoundException, SQLException{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM output");
		ResultSet resultSet =preparedStatement.executeQuery();
		List<MQOutput> out=new ArrayList<MQOutput>();
		while(resultSet.next()) {
			MQOutput output=new MQOutput();
			output.setDate(resultSet.getString("date"));
			output.setMq2(resultSet.getDouble("mq2"));
			output.setMq3(resultSet.getDouble("mq3"));
			output.setMq4(resultSet.getDouble("mq4"));
			output.setMq5(resultSet.getDouble("mq5"));
			output.setMq7(resultSet.getDouble("mq7"));
			output.setMq8(resultSet.getDouble("mq8"));
			output.setMq135(resultSet.getDouble("mq135"));
			out.add(output);
			
		}
		
		
		List<PrepareOutput> list =new ArrayList();
		for(MQOutput output: out) {
			PrepareOutput prepare=new PrepareOutput();
		 prepare.setDate(output.getDate());
		 prepare.setTime(output.getTime());
		if(output.getMq2()<2.00 ||output.getMq135()<0.0488) {
			prepare.setMq2("Not Found");
		}else if(output.getMq2()<3.00 || output.getMq135()<0.0588) {
			prepare.setMq2("Smoke found but Normal Air");
		}else {
			prepare.setMq2("Smoke found");
		}
		
		
		if(output.getMq3()<0.1227) {
			prepare.setMq3("Not Found");
		}
		else if(output.getMq3()<3.00) {
			prepare.setMq3("Alcohol found ");
		}
		else {
			prepare.setMq3("Found but Normal Air");
		}
		
		
		if(output.getMq4()<1.466) {
			prepare.setMq3("Not Found");
		}
		else if(output.getMq4()<2.44) {
			prepare.setMq4("Found but Normal Air ");
		}
		else {
			prepare.setMq4("Found ");
		}
		
		if(output.getMq5()<0.9727) {
			prepare.setMq5("Not Found");
		}
		else if(output.getMq5()<1.4) {
			prepare.setMq5("Found but Normal Air ");
		}
		else {
			prepare.setMq5("LPG and natural gas found");
		}
		
		if(output.getMq7()<0.0978) {
			prepare.setMq7("Not Found");
		}
		else if(output.getMq7()<0.200) {
			prepare.setMq7("Found but Normal Air ");
		}
		else {
			prepare.setMq7("Found");
		}
		
		
		if(output.getMq8()<0.3887 || output.getMq9()<0.03889) {
			prepare.setMq8("Not Found");
		}
		else if(output.getMq8()<0.5866 || output.getMq9()<0.0500) {
			prepare.setMq8("Found but Normal Air");
		}
		else {
			prepare.setMq8("Found");
		}
		
		if(output.getMq9()<0.4227) {
			prepare.setMq9("Not Found");
		}
		else if(output.getMq9()<0.4887) {
			prepare.setMq9("Found but Normal Air");
		}
		else {
			prepare.setMq9("Found");
		}
		
		if(output.getMq135()<0.0488) {
			prepare.setMq135("Not Found");
		}
		else if(output.getMq135()<3.00) {
			prepare.setMq135("Found but Normal Air ");
		}
		else {
			prepare.setMq135("Found");
		}
		
		list.add(prepare);
	}
		
		connection.close();
		return list;
	}
	
	
}
