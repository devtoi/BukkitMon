package org.bukkitmon;

import org.bukkit.entity.MobType;

public class BMMob {
	
	private byte nrOfMobs = 1;
	private MobType mobtype = MobType.CHICKEN;
	private boolean rndAmount = false;
	private boolean rndType = false;
	private boolean active = true;
	private byte maxAmount = 10;
	
	public BMMob()
	{
		
	}
	
	public boolean isRndAmount() {
		return rndAmount;
	}

	public void setRndAmount(boolean rndAmount) {
		this.rndAmount = rndAmount;
	}

	public boolean isRndType() {
		return rndType;
	}

	public void setRndType(boolean rndType) {
		this.rndType = rndType;
	}

	public byte getNrOfMobs() {
		return nrOfMobs;
	}

	public void setNrOfMobs(byte nrOfMobs) {
		this.nrOfMobs = nrOfMobs;
	}

	public MobType getMobtype() {
		return mobtype;
	}

	public void setMobtype(MobType mobtype) {
		this.mobtype = mobtype;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public byte getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(byte maxAmount) {
		this.maxAmount = maxAmount;
	}
	
}
