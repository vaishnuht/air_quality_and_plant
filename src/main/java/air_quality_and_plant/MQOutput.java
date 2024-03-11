package air_quality_and_plant;

import java.util.Date;

//import java.sql.Date;

public class MQOutput {
	private String date;
	private String time;
	private double mq2;
	private double mq3;
	private double mq4;
	private double mq5;
	private double mq7;
	private double mq8;
	private double mq9;
	private double mq135;
	
	public MQOutput(String date, String time, double mq2, double mq3, double mq4, double mq5, double mq7, double mq8,
			double mq9, double mq135) {
		super();
		this.date = date;
		this.time = time;
		this.mq2 = mq2;
		this.mq3 = mq3;
		this.mq4 = mq4;
		this.mq5 = mq5;
		this.mq7 = mq7;
		this.mq8 = mq8;
		this.mq9 = mq9;
		this.mq135 = mq135;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	
	public double getMq2() {
		return mq2;
	}
	public void setMq2(double mq2) {
		this.mq2 = mq2;
	}
	public double getMq3() {
		return mq3;
	}
	public void setMq3(double mq3) {
		this.mq3 = mq3;
	}
	public double getMq4() {
		return mq4;
	}
	public void setMq4(double mq4) {
		this.mq4 = mq4;
	}
	public double getMq5() {
		return mq5;
	}
	public void setMq5(double mq5) {
		this.mq5 = mq5;
	}
	public double getMq7() {
		return mq7;
	}
	public void setMq7(double mq7) {
		this.mq7 = mq7;
	}
	public double getMq8() {
		return mq8;
	}
	public void setMq8(double mq8) {
		this.mq8 = mq8;
	}
	public double getMq9() {
		return mq9;
	}
	public void setMq9(double mq9) {
		this.mq9 = mq9;
	}
	public double getMq135() {
		return mq135;
	}
	public void setMq135(double mq135) {
		this.mq135 = mq135;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public MQOutput() {
		
	}

	//public void setDate(java.sql.Date date2) {
		// TODO Auto-generated method stub
		
//	}

	
}
