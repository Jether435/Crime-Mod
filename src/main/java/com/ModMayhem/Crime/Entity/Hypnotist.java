package com.ModMayhem.Crime.Entity;

import net.minecraft.world.World;

public class Hypnotist extends EntityTOSBase{

	public Hypnotist(World p_i1738_1_) {
		super(p_i1738_1_);
		this.isMafia = true;
		this.Role = "Hypnotist";
		this.MemberList.add(this);
		this.NonSelf.remove(this);
		if(this.nightTime=true) {
			EntityTOSBase e;
			e = (EntityTOSBase) this.RandomNonSelfMember();
			//e.
			}
	}

}
