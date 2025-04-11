package btoop3;

public class MyDate {
private int year;
private int month;
private int day;
private String[] MONTHS= {"Jan", "Feb","Mar","Apr","May","Jun","Jul", "Aug","Sep","Oct","Nov","Dec"};
private String[] DAYS= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
private int[] DAYSINMONTHS = {31, 28, 31, 30, 31,30,31,31,30,31,30,31};
public boolean isLeapYear(int year) {
	if(year%4==0 && year%100!=0 || year%400==0) return true;
	else return false;
}
public boolean isValidDate(int year, int month, int day){
	if(year>=1 && year<=9999 && month>=1 && month<=12 && day>=1 && day<=31) {
		for(int i=0;i<12;i++) {
			if(month==i+1)
			{
				if(this.DAYSINMONTHS[i]==day) return true;
			}
		}
	}
	return false;
}
public int getDayOfWeek(int year, int month, int day){
	int a=(int)year/100;
	if(a==17) {
		a=4;
	}
	else if(a==18) {
		a=2;
	}
	else if(a==19){
		a=0;
	}
	else if(a==20) {
		a=6;
	}
	else if(a==21) {
		a=4;
	}
	else if(a==22) {
		a=2;
	}
	else if(a==23) {
		a=0;
	}
	else {
		a=6;
	}
	a+=year%100;
	a+=(int)year%100/4;
	int[] thang= {0,3,3,6,1,4,6,2,5,0,3,5};
	if(this.year%4==0 && this.year%100!=0 || this.year%400==0)
	{	
		thang[0]=6;
	    thang[1]=2;
	}
	for(int i=0;i<12;i++)
	{
		if(month==i+1)
		{
			a+=thang[i];
		}
	}
	a+=day;
	return a%7+1;
}
public MyDate(int year, int month, int day)
{
	this.year=year;
	this.month=month;
	this.day=day;
}
public void setDate(int year, int month, int day)
{
	this.year=year;
	this.month=month;
	this.day=day;
}
public int getYear()
{
	return this.year;
}
public int getMonth()
{
	return this.month;
}
public int getDay()
{
	return this.day;
}
public void setYear(int x)
{
	this.year=x;
}
public void setMonth(int y)
{
	this.month=y;
}
public void setDay(int z)
{
	this.day=z;
	
}
//Thứ ba, ngày 14 tháng 2 năm 2012
public String tostring()
{
	String s="";
	for(int i=0;i<7;i++)
	{
		if(getDayOfWeek(this.year, this.month, this.day)==i+1)
				{
			           
						s+=DAYS[i]+" " +this.day+" ";  
				}
	}
	for(int i=0;i<12;i++)
	{
		if(month==i+1)
			s+=MONTHS[i]+" ";
	}
	return s+this.year+"";	
}
public MyDate nextDay()
{
	if(this.year%4==0 && this.year%100!=0 || this.year%400==0) {
		if(day<=28) day++;
		else {
			this.day=1;
			this.month++;
		}
	}
	else {
	 if(this.month%2==1 || this.month==8)
		{
			
			if(this.day==31) {
				this.day=1;
				this.month++;
			}
			else this.day++;
		}
	 else if(this.month==2)
	 {
		 if(day!=28)
		 {
			 this.day++;
		 }
		 else {
			 this.day=1;
			 this.month=3;
		 }
	 }
		else 
		{
			
			if(this.day==30) {
				this.day=1;
				if(this.month==12)
				{
					this.month=1;
					this.year++;
					
				}
				else this.month++;
			}
			else this.day++;
		}
	}
	return this;
}
public MyDate nextMonth()
{
	if(this.month==12)
	{
		this.month=1;
		this.year++;
	}
	else this.month++;
	return this;
}
public MyDate nextYear()
{
	int a=this.year;
	this.year++;
	if(a%4==0 && a%100!=0 || a%400==0)
	{
		if(this.day==29 && this.month==2) {
		this.day=28;
		}
	}
	return this;
}
public MyDate previousDay()
{
	if(this.day!=1)
	{
		this.day--;
	}
	else {
		if(this.month%2==1 && this.month==8)
		{
			this.day=30;
			if(this.month==1)
			{
				this.month=12;
				this.year--;
			}
			else this.month--;
		}
		else if(this.month==3)
		{
			if(this.year%4==0 && this.year%100!=0 || this.year%400==0)
			{
				this.day=29;
				this.month--;
			}
			else this.day=28;
		}
		else {
			this.day=31;
			this.month--;
		}
	}
	return this;
}
}
