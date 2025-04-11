package baitap00p1;
public class Date {
private int day, month, years;
public Date(int day, int month, int years) {
	this.day=day;
	this.month=month;
	this.years=years;
}
public int getDay()
{
	return this.day;
}
public int getMonth()
{
	return this.month;
}
public int getYears() {
	return this.years;
}
public void setDay(int a){
	this.day=a;
}
public void setMonth(int b) {
	this.month=b;
}
public void setYears(int c)
{
	this.years=c;
}
public void setDate(int day, int month, int years) {
	this.day=day;
	this.month=month;
	this.years=years;
}
public String tostring()
{
	if (this.day<10 && this.month<10) return "0"+this.day+"/"+"0"+this.month+"/"+this.years;
	else if(this.day<10) return "0"+this.day+"/"+this.month+"/"+this.years;
	else if (this.month<10) return this.day+"/"+"0"+this.month+"/"+this.years;
	return this.day+"/"+this.month+"/"+this.years;
}
}
