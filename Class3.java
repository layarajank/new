package caseStudyonDate;

import java.time.LocalDate;

public class Class3 
{
	//public class CSView5
	int id;
	int room;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int cost;
	LocalDate date1;

	public void booking(int id,int room,LocalDate date1,String ac,String cot,String cable,String wifi,String laundry)
	{
	cost=0;
	this.id=id;
	this.date1=date1;
	this.room=room;
	this.ac= ac;
	this.cot= cot;
	this.cable= cable;
	this.wifi= wifi;
	this.laundry= laundry;
	if(ac.equals("AC"))
	{
	cost=cost+1000;
	}
	else
	{
	cost=cost+750;
	}
	if(cot.equals("Single"))
	{
	cost=cost+0;
	}
	else
	{
	cost=cost+350;
	}
	if(cable.equals("C"))
	{
	cost=cost+50;
	}
	if(wifi.equals("W"))
	{
	cost=cost+200;
	}
	if(laundry.equals("L"))
	{
	cost=cost+100;
	}
	System.out.println("\nThe total charge is Rs." +cost);
	System.out.println("The services chosen are");
	System.out.println(cot+" cot "+ac+ " room");
	System.out.println(cable+" enabled");
	System.out.println(wifi+" enabled");
	System.out.println("with " + laundry+ " service");
	}
	public void display()
	{
	System.out.println(room+"\t\t"+id);
	}
}





