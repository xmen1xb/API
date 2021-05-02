package com.vti.entity;

public class Contestant{
	public int sbd;
	public String fullname;
	public String address;
	public int level;
	public static int count=0;
	public Block block;
	public Contestant(String fullname, String address, int level,Block block) {
		count++;
		this.sbd = count;
		this.fullname = fullname;
		this.address = address;
		this.level = level;
		this.block=block;
	}
	@Override
	public String toString() {
		return "Contestant [sbd=" + sbd + ", fullname=" + fullname + ", address=" + address + ", level=" + level
				+ ", block=" + block.getName()+":"+block.getSubject() + "]";
	}
	
}
