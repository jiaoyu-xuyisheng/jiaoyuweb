package entity;

import java.io.Serializable;

public class JyResult implements Serializable{
	
	
	private Object fistdate ;
	
	private Object date;

	public Object getFistdate() {
		return fistdate;
	}

	public void setFistdate(Object fistdate) {
		this.fistdate = fistdate;
	}

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}

	public JyResult() {
	}

	public JyResult(Object fistdate, Object date) {
		this.fistdate = fistdate;
		this.date = date;
	}
	
	

}
