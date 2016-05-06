/**
 * 
 */
package com.pranav.examples.pojo;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class Price {

	private double price;
	private String instrument;

	public Price() {

	}

	public Price(double price, String instrument) {
		this.price = price;
		this.instrument = instrument;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Price [price=" + price + ", instrument=" + instrument + "]";
	}

}
