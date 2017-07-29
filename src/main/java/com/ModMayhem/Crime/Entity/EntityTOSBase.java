package com.ModMayhem.Crime.Entity;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityTOSBase extends EntityMob{
	public int x;
	public boolean truebool;
	public boolean nightTime;
	public int y;
	public boolean dayTime;
	public EntityTOSBase(World p_i1738_1_) {
		super(p_i1738_1_);
		this.NonSelf.add(Arsonist.class);
		this.NonSelf.add(Hypnotist.class);
		//this.NonSelf.add(.class);
		//in mob class, remove self.
		while(this.truebool = true) {
			x++;
		}
			if(this.x==10000) {
				this.nightTime = true;
				this.x = 0;
				this.truebool=false;
			}
			while(this.nightTime = true) {
				y++;
			}
			if(this.y == 10000) {
				this.dayTime = true;
				this.truebool=true;
				}
	}
	public void NightAction() {
		
	}
	public String Role;

	public int fixedMoneyValue = 1000;
	public boolean isThirdParty;
	public boolean isCoven;
	public Random rand;
	public boolean WasKilled;
	public boolean isMafia;
	public boolean isTown;
	public boolean isDoused;
	public boolean isJailed;
	public List<Object> NonSelf;
	public boolean knowsArsonist;
	public String getRole() {
		return Role;
	}
	/*
	  public void getConditionalRole() {
		if(this.Role.equals("Arsonist")) {
			this.knowsArsonist=true;
		}
	}	
	*/
	public int lengthNonSelf = NonSelf.size();
	public Object RandomNonSelfMember() {
		EntityTOSBase e;
		int l;
		l = this.rand.nextInt(lengthNonSelf);
		e = (EntityTOSBase) this.NonSelf.get(l);
		return e;
	}
	public List<Object> NonMafia;
	public int lengthMafia = NonMafia.size();
	public Object RandomMafiaMember() {
		EntityTOSBase e;
		int l;
		l = this.rand.nextInt(lengthMafia);
		e = (EntityTOSBase) this.NonMafia.get(l);
		return e;
	}
	public List<Object> MemberList;
	public int length = MemberList.size();
	public Object RandomMember() {
		EntityTOSBase e;
		int l;
		l = this.rand.nextInt(length);
		e = (EntityTOSBase) this.MemberList.get(l);
		return e;
	}
}
