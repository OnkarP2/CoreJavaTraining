package com.ct.day2Assinment2;

public class ObjCount {
 static int i;
 ObjCount()
 {
	 i++;
 }
public static void main(String args[])
{
	ObjCount o1=new ObjCount();
	ObjCount o2=new ObjCount();
	ObjCount o3=new ObjCount();
	
	System.out.println(ObjCount.i);
}
}
