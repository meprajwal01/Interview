package com.design.pattern.structural.adapter;

/*
 * Here PenAdapter IS-A Pen, so instead of Pen we can use PenAdapter whenever required
 */
public class PenAdapter implements Pen {

	private LegacyPen legacyPen = new LegacyPen();
	
	public LegacyPen getLegacyPen() {
		return legacyPen;
	}

	public void setLegacyPen(LegacyPen legacyPen) {
		this.legacyPen = legacyPen;
	}

	@Override
	public void write(String msg) {
		legacyPen.writeWithLegacyPen(msg);
	}

	
}
