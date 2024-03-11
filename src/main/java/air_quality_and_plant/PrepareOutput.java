package air_quality_and_plant;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrepareOutput {
	private String date;
	private String time;
	private String mq2;
	private String mq3;
	private String mq4;
	private String mq5;
	private String mq7;
	private String mq8;
	private String mq9;
	private String mq135;
//
//	public List<PrepareOutput> prepareOutput() throws ClassNotFoundException, SQLException {
//	OutputCrud crud=new OutputCrud();
////	List<PrepareOutput> out=new ArrayList<PrepareOutput>();
//	// MQOutput out=new MQOutput();
//	return null;
//	}

	public String getDate() {
		return date;
	}

	public void setDate(String date2) {
		this.date = date2;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMq2() {
		return mq2;
	}

	public void setMq2(String mq2) {
		this.mq2 = mq2;
	}

	public String getMq3() {
		return mq3;
	}

	public void setMq3(String mq3) {
		this.mq3 = mq3;
	}

	public String getMq4() {
		return mq4;
	}

	public void setMq4(String mq4) {
		this.mq4 = mq4;
	}

	public String getMq5() {
		return mq5;
	}

	public void setMq5(String mq5) {
		this.mq5 = mq5;
	}

	public String getMq7() {
		return mq7;
	}

	public void setMq7(String mq7) {
		this.mq7 = mq7;
	}

	public String getMq8() {
		return mq8;
	}

	public void setMq8(String mq8) {
		this.mq8 = mq8;
	}

	public String getMq9() {
		return mq9;
	}

	public void setMq9(String mq9) {
		this.mq9 = mq9;
	}

	public String getMq135() {
		return mq135;
	}

	public void setMq135(String mq135) {
		this.mq135 = mq135;
	}
	

	
}