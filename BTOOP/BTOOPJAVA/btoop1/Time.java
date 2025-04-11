package baitap00p1;
public class Time {
private int hour, minute, second;
public Time(int hour, int minute, int second) {
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
public void setTime(int hour, int minute, int second)
{
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public String tostring() {
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
public Time nextSecond()
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
public Time previousSecond() {
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
}

