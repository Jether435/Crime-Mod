package com.ModMayhem.Crime.Entity;

import java.util.Random;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Arsonist extends EntityTOSBase {
	
	private int dousedCount;
	private int killCount;
	public Arsonist(World p_i1738_1_) {
		super(p_i1738_1_);
		this.Role = "Arsonist";
		isThirdParty = true;
		this.NonSelf.remove(this);
		this.MemberList.add(this);
		if(this.nightTime = true) {
			EntityTOSBase e;
			e = (EntityTOSBase) this.RandomNonSelfMember();
			e.isDoused = true;
			dousedCount++;
		}
		while(this.dousedCount == 3) {
			EntityTOSBase e;
			e = (EntityTOSBase) this.RandomMember();
			if(e.isDoused = true) {
				e.setDead();
				killCount++; 
			}	
			if(this.killCount == 3) {
				dousedCount = 0;
			}
		}
	}
}