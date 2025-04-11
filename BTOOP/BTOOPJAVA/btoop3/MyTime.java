package btoop3;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime()
	{
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	public MyTime(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour()
	{
		return this.hour;
	}
	public int getMinute()
	{
		return this.minute;
	}
	public int getSecond()
	{
		return this.second;
	}
	public void setHour(int hour)
	{
		this.hour=hour;
	}
	public void setMinute(int minute)
	{
		this.minute=minute;
	}
	public void setSecond(int second)
	{
		this.second=second;
	}
	public String tostring()
	{
		String s;
		String s1;
		String s2;
		if (this.hour<10)  s  = "0"+this.hour;
		else s=this.hour+"";
		if (this.minute<10) s1="0"+this.minute;
		else s1=this.minute +"";
		if (this.second<10) s2="0"+this.second;
		else s2=this.second+"";
		return s+":"+s1+":"+s2;
	}
	public MyTime nextSecond()
	{
		if (this.second==59) 
		{
			this.second=0;
			if (this.minute==59) 
			{
				this.minute=0;
				if (this.hour==23) 
					this.hour=0;
					else this.hour++;
			}
			else this.minute++;
		}
		else this.second++;
		return this;
	}
	public MyTime nextMinute()
	{
		if (this.minute==59)
		{
			this.minute=0;
			if(this.hour==23)
			{
				this.hour=0;
			}
			else this.hour++;
		}
		else this.minute++;
		return this;
	}
	public MyTime nextHour()
	{
		if (this.hour==23) {
			this.hour=0;
		}
		else this.hour++;
		return this;
	}
	public MyTime previousSecond() {
		if (this.second==0) 
		{
			this.second=59;
			if (this.minute==0) {
				this.minute=59;
				if (this.hour==0) {
					this.hour=23;
				}
				else this.hour--;
			}
			else this.minute--;
			
		}
		else this.second--;
		return this;
	}
	public MyTime previousMinute() {
		if(this.minute==0)
		{
			this.minute=59;
			if(this.hour==0)
			{
				this.hour=23;
			}
			else this.hour--;
		}
		else this.minute--;
		return this;
	}
	public MyTime previousHour()
	{
		if(this.hour==0)
		{
			this.hour=23;
		}
		else this.hour--;
		return this;
	}
}
